package com.daview.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daview.dto.CaregiverDTO;
import com.daview.dto.FacilityDTO;
import com.daview.dto.FacilitySearchFilterRequest;
import com.daview.service.CaregiverService;
import com.daview.service.FacilityService;

@RestController
@RequestMapping("/api")
public class SearchController {

    private final FacilityService facilityService;
    private final CaregiverService caregiverService;

    public SearchController(FacilityService facilityService, CaregiverService caregiverService) {
        this.facilityService = facilityService;
        this.caregiverService = caregiverService;
    }
    
    
//    @GetMapping("/search")
//    public Map<String, Object> searchAll(@RequestParam("keyword") String keyword) {
//        Map<String, Object> result = new HashMap<>();
//        result.put("facilities", searchService.searchFacilities(keyword));
//        result.put("caregivers", searchService.searchCaregivers(keyword));
//        return result;
//    }
    
    
    

    @GetMapping("/search")
    public Map<String, Object> searchAll(@RequestParam String query) {
        // 시설(요양원+실버타운) 검색
        List<FacilityDTO> facilities = facilityService.searchFacilitiesByKeyword(query);

        // 요양사 검색
        List<CaregiverDTO> caregivers = caregiverService.searchByKeyword(query);

        // 중복 제거
        Map<String, FacilityDTO> facilityMap = new LinkedHashMap<>();
        for (FacilityDTO dto : facilities) {
            facilityMap.put(dto.getFacilityId(), dto);
        }

        Map<String, CaregiverDTO> caregiverMap = new LinkedHashMap<>();
        for (CaregiverDTO dto : caregivers) {
            caregiverMap.put(dto.getCaregiverId(), dto);
        }

        // 요양원, 실버타운 분리
        List<FacilityDTO> nursinghomes = facilityMap.values().stream()
            .filter(f -> "요양원".equals(f.getFacilityType()))
            .collect(Collectors.toList());

        List<FacilityDTO> silvertowns = facilityMap.values().stream()
            .filter(f -> "실버타운".equals(f.getFacilityType()))
            .collect(Collectors.toList());

        // 응답 구성
        Map<String, Object> result = new HashMap<>();
        result.put("nursinghomes", nursinghomes);
        result.put("silvertowns", silvertowns);
        result.put("caregivers", new ArrayList<>(caregiverMap.values()));

        return result;
    }
    

    
}