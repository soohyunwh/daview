//package com.daview.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig implements WebMvcConfigurer {
//
//	public void addCorsMappings (CorsRegistry registry) {
//		registry.addMapping("/**")
//				.allowedOrigins("http://localhost:3000", "http://localhost:3001")
//				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//				.allowedHeaders("Authorization", "Cache-Control", "Content-Type")
//				.allowCredentials(true) 
//                .maxAge(3600); 
//	}
//}
