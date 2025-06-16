package com.daview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daview.dto.CaregiverDTO;
import com.daview.dto.CaregiverFilterDTO;
import com.daview.mapper.CaregiverMapper;

@Service
public class CaregiverService {

    @Autowired
    private CaregiverMapper caregiverMapper;

    public List<CaregiverDTO> getAllCaregivers() {
        List<CaregiverDTO> caregivers = caregiverMapper.getAllCaregivers();
        for (CaregiverDTO caregiver : caregivers) {
            caregiver.setCertificates(caregiverMapper.getCertificatesByCaregiverId(caregiver.getCaregiverId()));
            caregiver.setCareer(caregiverMapper.getCareerByCaregiverId(caregiver.getCaregiverId()));
        }
        return caregivers;
    }
    
    
    public CaregiverDTO getCaregiverById(String caregiverId) {
        CaregiverDTO dto = caregiverMapper.getCaregiverById(caregiverId);
        if (dto != null) {
            dto.setCertificates(caregiverMapper.getCertificatesByCaregiverId(caregiverId));
            dto.setCareer(caregiverMapper.getCareerByCaregiverId(caregiverId));
        }
        return dto;
    }
    
    public List<CaregiverDTO> searchByKeyword(String keyword) {
        return caregiverMapper.searchCaregiversByKeyword(keyword);
    }
    
    
    public List<CaregiverDTO> searchCaregiversWithFilters(CaregiverFilterDTO filters) {
        return caregiverMapper.searchCaregiversWithFilters(filters);
    }
 
    
    
    
    
}

