package com.daview.service;

import com.daview.dto.ChatMessageDTO;
import com.daview.mapper.ChatMessageMapper;
import com.daview.service.ChatMessageService;
import lombok.RequiredArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatMessageServiceImpl implements ChatMessageService {

    private final ChatMessageMapper chatMessageMapper;

    @Override
    public void saveMessage(ChatMessageDTO message) {
        // ISO 형식을 MySQL DATETIME 형식으로 변환
        LocalDateTime parsedDateTime = LocalDateTime.ofInstant(
            Instant.parse(message.getSentAt()), ZoneId.of("Asia/Seoul")
        );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = parsedDateTime.format(formatter);
        message.setSentAt(formatted);

        
    }
    
    @Override
    public List<ChatMessageDTO> getMessagesByRoom(String chatroomId) {
        return chatMessageMapper.getMessagesByRoom(chatroomId);
    }
    
}
