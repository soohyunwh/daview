package com.daview.controller;

import com.daview.dto.User;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mypage")
public class MyPageController {

    // 로그인한 사용자 정보 반환 (마이페이지 프로필용)
    @PreAuthorize("hasAnyRole('USER', 'ADMIN', 'COMPANY', 'CAREGIVER')")
    @GetMapping("/profile")
    public ResponseEntity<User> getProfile(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        return ResponseEntity.ok(user);
    }
}
