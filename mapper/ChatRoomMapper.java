package com.daview.mapper;

import com.daview.dto.ChatRoomDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ChatRoomMapper {
    List<ChatRoomDTO> getChatRoomsByMemberId(int memberId);
}