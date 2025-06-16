package com.daview.service;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.daview.dto.LoginRequest;
import com.daview.dto.SignupRequest;
import com.daview.dto.User;
import com.daview.mapper.UserMapper;
import com.daview.util.JwtUtil;

@Service
public class AuthService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public boolean signup(SignupRequest request) {
		if (userMapper.findByUsername(request.getUsername()) != null) {
			return false;
		}

		User user = new User();
		user.setUsername(request.getUsername());
		user.setPassword(passwordEncoder.encode(request.getPassword())); // 비번 암호화
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPhone(request.getPhone());
		user.setRole(request.getRole());

		userMapper.insertUser(user);
		return true;
	}

	public Map<String, Object> login(LoginRequest request) {
		Map<String, Object> response = new HashMap<>();

		User user = userMapper.findByUsername(request.getUsername());

		// 비밀번호 확인용
		System.out.println("입력된 비밀번호: " + request.getPassword());
		System.out.println("DB에 저장된 암호화 비밀번호: " + user.getPassword());
		System.out.println("matches 결과: " + passwordEncoder.matches(request.getPassword(), user.getPassword()));
		// 비밀번호 확인용

		if (user == null || !passwordEncoder.matches(request.getPassword(), user.getPassword())) {
			response.put("success", false);
			return response;
		}

		String token = JwtUtil.generateToken(user.getUsername(), user.getRole(), user.getMemberId());

		response.put("success", true);
		response.put("token", token);
		response.put("username", user.getUsername());
		response.put("role", user.getRole());

		return response;
	}

	public boolean checkUsernameDuplicate(String username) {
		return userMapper.countByUsername(username) > 0;
	}
	
	public String findUsernameByPhone(String name, String phone) {
	    return userMapper.findUsernameByPhone(name, phone);
	}
	
	public String findUsernameByEmail(String name, String email) {
	    return userMapper.findUsernameByEmail(name, email);
	}
	
	@Autowired
	private MailService mailService;

	public boolean resetPasswordAndSendEmail(String name, String username, String phone) {
	    User user = userMapper.findUserForReset(name, username, phone);
	    if (user == null) return false;

	    String tempPwd = generateTempPassword();
	    String hashedPwd = passwordEncoder.encode(tempPwd);

	    userMapper.updatePassword(user.getUsername(), hashedPwd);
	    mailService.sendTempPassword(user.getEmail(), tempPwd);
	    return true;
	}

	private String generateTempPassword() {
	    int length = 10;
	    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    SecureRandom rnd = new SecureRandom();
	    StringBuilder sb = new StringBuilder(length);
	    for (int i = 0; i < length; i++) {
	        sb.append(chars.charAt(rnd.nextInt(chars.length())));
	    }
	    return sb.toString();
	}




}
