package com.daview.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daview.dto.LoginRequest;
import com.daview.dto.SignupRequest;
import com.daview.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")

public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/signup")
	public boolean signup(@RequestBody SignupRequest request) {
		return authService.signup(request);
	}

	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody LoginRequest request) {
		return authService.login(request);
	}

	@GetMapping("/check-username")
	public ResponseEntity<Boolean> checkUsername(@RequestParam String username) {
		boolean exists = authService.checkUsernameDuplicate(username);
		return ResponseEntity.ok(exists);
	}

	@PostMapping("/find-username/phone")
	public ResponseEntity<?> findUsernameByPhone(@RequestBody Map<String, String> payload) {
		String name = payload.get("name");
		String phone = payload.get("phone");
		String username = authService.findUsernameByPhone(name, phone);

		if (username != null) {
			return ResponseEntity.ok().body(username);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("일치하는 회원이 없습니다.");
		}

	}
	
	@PostMapping("/find-username/email")
	public ResponseEntity<?> findUsernameByEmail(@RequestBody Map<String, String> payload) {
	    String name = payload.get("name");
	    String email = payload.get("email");
	    String username = authService.findUsernameByEmail(name, email);

	    if (username != null) {
	        return ResponseEntity.ok().body(username);
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("일치하는 회원이 없습니다.");
	    }
	}
	
	@PostMapping("/find-password")
	public ResponseEntity<?> findPassword(@RequestBody Map<String, String> payload) {
	    String name = payload.get("name");
	    String username = payload.get("username");
	    String phone = payload.get("phone");

	    boolean success = authService.resetPasswordAndSendEmail(name, username, phone);
	    if (success) {
	        return ResponseEntity.ok("임시 비밀번호가 이메일로 발송되었습니다.");
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("일치하는 회원이 없습니다.");
	    }
	}



}
