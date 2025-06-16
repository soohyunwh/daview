package com.daview.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.daview.dto.CityDTO;
import com.daview.dto.RegionDTO;

@Mapper
public interface SearchRegionMapper {
    List<RegionDTO> getAllRegions();
    List<CityDTO> getCitiesByRegionId(@Param("regionId") Long regionId);
}
