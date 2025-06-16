package com.daview.controller;

import com.daview.dto.ChatRoomDTO;

import com.daview.service.ChatRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    public ChatRoomController(ChatRoomService chatRoomService) {
        this.chatRoomService = chatRoomService;
    }

    @GetMapping("/rooms")
    public List<ChatRoomDTO> getChatRooms(@RequestParam int memberId) {
        return chatRoomService.getChatRooms(memberId);
    }
    

    
    
}
