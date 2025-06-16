package com.daview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daview.dto.CityDTO;
import com.daview.dto.RegionDTO;
import com.daview.mapper.SearchRegionMapper;

@Service
public class SearchRegionService {

    @Autowired
    private SearchRegionMapper searchRegionMapper;

    public List<RegionDTO> getAllRegions() {
        return searchRegionMapper.getAllRegions();
    }

    public List<CityDTO> getCitiesByRegionId(Long regionId) {
        return searchRegionMapper.getCitiesByRegionId(regionId);
    }
}

