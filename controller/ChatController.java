package com.daview.controller;

import com.daview.dto.ChatMessageDTO;
import com.daview.service.ChatMessageService;
import com.daview.service.KafkaChatProducer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private KafkaChatProducer kafkaChatProducer;
    

    @Autowired
    private ChatMessageService chatMessageService;

    @MessageMapping("/send") // pub/chat/send
    public void send(ChatMessageDTO message) {
        kafkaChatProducer.sendMessage(message);
        // WebSocket으로는 이제 응답 안 보내고 Kafka → Redis → DB → 구독 구조로 전환
    }
    
    
    //채팅방에 과저 메세지 넣기
    @GetMapping("/rooms/{chatroomId}/messages")
    public List<ChatMessageDTO> getMessages(@PathVariable String chatroomId) {
        return chatMessageService.getMessagesByRoom(chatroomId); // ✅ 인스턴스로 호출
    }
}