package com.daview.mapper;

import com.daview.dto.ChatMessageDTO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChatMessageMapper {
    void insertChatMessage(ChatMessageDTO message);
    List<ChatMessageDTO> getMessagesByRoom(@Param("chatroomId") String chatroomId);
}