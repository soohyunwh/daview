package com.daview.service;

import com.daview.dto.FacilityDTO;
import com.daview.dto.FacilitySearchFilterRequest;
import com.daview.mapper.FacilityMapper;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FacilityService {

    private final FacilityMapper facilityMapper;

    
    //실버타운
    public FacilityService(FacilityMapper facilityMapper) {
        this.facilityMapper = facilityMapper;
    }

    public List<FacilityDTO> getSilvertowns() {
        return facilityMapper.getAllSilvertowns();
    }

    public FacilityDTO getFacilityDetail(String facilityId) {
        // ✅ 이름 수정 (XML과 동일하게 getSilvertownDetail)
        FacilityDTO facility = facilityMapper.getSilvertownDetail(facilityId);

        if (facility != null) {
            facility.setPhotos(facilityMapper.getFacilityPhotos(facilityId));
            facility.setTags(facilityMapper.getFacilityTags(facilityId));
            facility.setNotices(facilityMapper.getFacilityNotices(facilityId));
        }

        return facility;
    }
    
    
    
    //요양원  
    
    public List<FacilityDTO> getNursinghomes() {
        return facilityMapper.getAllNursingHomes();
    }

    
    public FacilityDTO getNursingHomeDetail(String facilityId) {
        // ✅ 이름 수정 (XML과 동일하게 getSilvertownDetail)
        FacilityDTO facility = facilityMapper.getNursingHomeDetail(facilityId);

        if (facility != null) {
            facility.setPhotos(facilityMapper.getFacilityPhotos(facilityId));
            facility.setTags(facilityMapper.getFacilityTags(facilityId));
            facility.setNotices(facilityMapper.getFacilityNotices(facilityId));
        }

        return facility;
    }
    
    
    public List<FacilityDTO> searchNursinghomes(FacilitySearchFilterRequest request) {
        return facilityMapper.searchNursinghomeWithFilters(request);
    }
    
    
    
    
    
    //전체검색
    
    public List<FacilityDTO> searchFacilitiesByKeyword(String keyword) {
        return facilityMapper.searchFacilitiesByKeyword(keyword);
    }
    
    public List<FacilityDTO> searchSilvertowns(FacilitySearchFilterRequest request) {
        return facilityMapper.searchSilvertownWithFilters(request);
    }
    

    
}
    
    
    

