package com.daview.service;

import com.daview.dto.ChatMessageDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaChatConsumer {

    private final SimpMessagingTemplate messagingTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final ChatMessageService chatMessageService; // MySQL 저장용

    @KafkaListener(topics = "chat-topic", groupId = "chat-group")
    public void consume(String messageJson) {
        try {
            ChatMessageDTO message = objectMapper.readValue(messageJson, ChatMessageDTO.class);

            System.out.println("✅ Kafka 메시지 수신: " + message.getContent());

            // 1️⃣ DB 저장
            chatMessageService.saveMessage(message);

            // 2️⃣ WebSocket 브로드캐스트
            messagingTemplate.convertAndSend("/sub/chat/room", message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}