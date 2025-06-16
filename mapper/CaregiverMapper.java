package com.daview.mapper;

import java.util.List;

import com.daview.dto.CaregiverDTO;
import com.daview.dto.CaregiverFilterDTO;
import com.daview.dto.CaregiverCareerDTO;

public interface CaregiverMapper {
    List<CaregiverDTO> getAllCaregivers();
    List<String> getCertificatesByCaregiverId(String caregiverId);
    List<CaregiverCareerDTO> getCareerByCaregiverId(String caregiverId);
    CaregiverDTO getCaregiverById(String caregiverId);
    List<CaregiverDTO> searchCaregiversByKeyword(String keyword);
    List<CaregiverDTO> searchCaregiversWithFilters(CaregiverFilterDTO filters);

}
