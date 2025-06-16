package com.daview.service;

import com.daview.dto.SearchFilterOptionDTO;
import com.daview.mapper.SearchFilterOptionMapper;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SearchFilterOptionService {

    private final SearchFilterOptionMapper searchFilterOptionMapper;

    public SearchFilterOptionService(SearchFilterOptionMapper searchFilterOptionMapper) {
        this.searchFilterOptionMapper = searchFilterOptionMapper;
    }

//    public List<SearchFilterOptionDTO> getOptionsByCategory(String category) {
//        return searchFilterOptionMapper.getOptionsByCategory(category);
//    }
//    
    
    public List<SearchFilterOptionDTO> getOptions(String targetType, String category) {
        return searchFilterOptionMapper.getOptionsByTypeAndCategory(targetType, category);
    }
}
