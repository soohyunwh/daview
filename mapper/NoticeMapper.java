package com.daview.mapper;

import com.daview.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface NoticeMapper {
    List<NoticeDTO> getNoticesByFacilityId(@Param("facilityId") String facilityId);
    NoticeDTO getNoticeDetail(@Param("facilityId") String facilityId, @Param("noticeId") int noticeId);
}