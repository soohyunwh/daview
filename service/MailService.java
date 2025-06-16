package com.daview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;


@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendTempPassword(String toEmail, String tempPassword) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("[다뷰] 임시 비밀번호 안내");
        message.setText("임시 비밀번호: " + tempPassword + "\n로그인 후 꼭 비밀번호를 변경해주세요.");
        mailSender.send(message);
    }
}



