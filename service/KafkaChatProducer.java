package com.daview.service;

import com.daview.dto.ChatMessageDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaChatProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    public KafkaChatProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = new ObjectMapper();
    }

    public void sendMessage(ChatMessageDTO message) {
        try {
            String jsonMessage = objectMapper.writeValueAsString(message);
            kafkaTemplate.send("chat-topic", jsonMessage);
            System.out.println("🔥 Kafka로 메시지 보냄: " + jsonMessage); // ✅ 로그 추가
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}