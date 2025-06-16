package com.daview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.daview.mapper")
public class DaviewBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaviewBackendApplication.class, args);
	}

}
