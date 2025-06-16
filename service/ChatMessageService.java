package com.daview.service;

import java.util.List;

import com.daview.dto.ChatMessageDTO;

public interface ChatMessageService {
    void saveMessage(ChatMessageDTO message);
    List<ChatMessageDTO> getMessagesByRoom(String chatroomId);
}
