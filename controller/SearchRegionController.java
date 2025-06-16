package com.daview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daview.dto.CityDTO;
import com.daview.dto.RegionDTO;
import com.daview.service.SearchRegionService;

@RestController
@RequestMapping("/api/region")
@CrossOrigin(origins = "http://localhost:3000")
public class SearchRegionController {

    @Autowired
    private SearchRegionService searchRegionService;

    @GetMapping
    public List<RegionDTO> getAllRegions() {
        return searchRegionService.getAllRegions();
    }

    @GetMapping("/{regionId}/cities")
    public List<CityDTO> getCitiesByRegionId(@PathVariable Long regionId) {
    	System.out.println("지역 ID: " + regionId);
        return searchRegionService.getCitiesByRegionId(regionId);
    }
}
