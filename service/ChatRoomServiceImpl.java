package com.daview.service;

import com.daview.dto.ChatMessageDTO;
import com.daview.dto.ChatRoomDTO;
import com.daview.mapper.ChatMessageMapper;
import com.daview.mapper.ChatRoomMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChatRoomServiceImpl implements ChatRoomService {

    private final ChatRoomMapper chatRoomMapper;

    public ChatRoomServiceImpl(ChatRoomMapper chatRoomMapper) {
        this.chatRoomMapper = chatRoomMapper;
    }

    @Override
    public List<ChatRoomDTO> getChatRooms(int memberId) {
        return chatRoomMapper.getChatRoomsByMemberId(memberId);
    }
    

    
}
