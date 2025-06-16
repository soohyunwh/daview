package com.daview.controller;

import com.daview.dto.FacilityDTO;
import com.daview.dto.FacilitySearchFilterRequest;
import com.daview.service.FacilityService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/facilities")
@CrossOrigin(origins = "http://localhost:3000")
public class FacilityController {

    private final FacilityService facilityService;
    
    
    public FacilityController(FacilityService facilityService) {
        this.facilityService = facilityService;
    }

    //실버타운 리스트
    @GetMapping("/silvertowns")
    public List<FacilityDTO> getSilvertowns() {
        return facilityService.getSilvertowns();
    }
    
    //실버타운 상세페이지 
    @GetMapping("/silvertown/{id}")
    public ResponseEntity<FacilityDTO> getFacilityDetail(@PathVariable("id") String id) {
    	System.out.println("💡 요청된 ID: " + id);
        FacilityDTO detail = facilityService.getFacilityDetail(id);
        System.out.println("💡 결과: " + detail);
        if (detail == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(detail);
    }
    
    //실버타운 검색박스 검색 
    @PostMapping("/silvertown/search")
    public List<FacilityDTO> searchSilvertowns(@RequestBody FacilitySearchFilterRequest request) {
    	System.out.println("🟢 요청 값: " + request.getLocation() + " / " + request.getCity());
        return facilityService.searchSilvertowns(request);
    }
    
    
    //요양원 리스트
    @GetMapping("/nursinghomes")
    public List<FacilityDTO> getNursingHomes() {
        return facilityService.getNursinghomes();
    }
    
    //요양원 상세페이지
    @GetMapping("/nursinghome/{id}")
    public ResponseEntity<FacilityDTO> getNursingHomeDetail(@PathVariable("id") String id) {
    	System.out.println("💡 요청된 ID: " + id);
        FacilityDTO detail = facilityService.getNursingHomeDetail(id);
        System.out.println("💡 결과: " + detail);
        if (detail == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(detail);
    }
    
    //요양원 검색박스 검색
    @PostMapping("/nursinghome/search")
    public List<FacilityDTO> searchNursinghomes(@RequestBody FacilitySearchFilterRequest request) {
        System.out.println("🟢 요양원 검색 요청 값: " + request);
        return facilityService.searchNursinghomes(request);
    }
    
    
    
}

