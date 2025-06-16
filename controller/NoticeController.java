package com.daview.controller;

import com.daview.dto.NoticeDTO;
import com.daview.mapper.NoticeMapper;
import com.daview.service.NoticeService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notices")
public class NoticeController {

    private final NoticeMapper noticeMapper;
    private final NoticeService noticeService;

    // 생성자 직접 작성 (롬복 사용 안함)
    public NoticeController(NoticeMapper noticeMapper, NoticeService noticeService) {
        this.noticeMapper = noticeMapper;
        this.noticeService = noticeService;
    }

    // ✅ 특정 시설 ID의 공지사항 전체 조회
    @GetMapping("/{facilityId}")
    public List<NoticeDTO> getNoticesByFacilityId(@PathVariable String facilityId) {
        return noticeMapper.getNoticesByFacilityId(facilityId);
    }

    // ✅ 특정 공지사항 상세 조회
    @GetMapping("/{facilityId}/{noticeId}")
    public ResponseEntity<NoticeDTO> getNoticeDetail(
            @PathVariable String facilityId,
            @PathVariable int noticeId) {
        NoticeDTO dto = noticeService.getNoticeDetail(facilityId, noticeId);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }
}