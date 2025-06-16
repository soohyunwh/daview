package com.daview.service;

import org.springframework.stereotype.Service;

import com.daview.dto.NoticeDTO;
import com.daview.mapper.NoticeMapper;

@Service
public class NoticeService {
	
	 private final NoticeMapper noticeMapper;

	    public NoticeService(NoticeMapper noticeMapper) {
	        this.noticeMapper = noticeMapper;
	    }

	    public NoticeDTO getNoticeDetail(String facilityId, int noticeId) {
	        return noticeMapper.getNoticeDetail(facilityId, noticeId);
	    }

}
