package com.daview.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.daview.dto.User;

@Mapper
public interface UserMapper {
	User findByUsername(String username);
	void insertUser(User user);
	int countByUsername(String username);
	String findUsernameByPhone(@Param("name") String name, @Param("phone") String phone);
	String findUsernameByEmail(@Param("name") String name, @Param("email") String email);
	User findUserForReset(@Param("name") String name, @Param("username") String username, @Param("phone") String phone);
	void updatePassword(@Param("username") String username, @Param("password") String password);

}
