package com.daview.controller;

import com.daview.dto.SearchFilterOptionDTO;
import com.daview.service.SearchFilterOptionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/options")
public class SearchFilterOptionController {

    private final SearchFilterOptionService service;

    public SearchFilterOptionController(SearchFilterOptionService service) {
        this.service = service;
    }

//    @GetMapping
//    public List<SearchFilterOptionDTO> getOptions(@RequestParam String category) {
//        return service.getOptionsByCategory(category);
//    }
    
    @GetMapping
    public List<SearchFilterOptionDTO> getOptions(
        @RequestParam String targetType,
        @RequestParam String category
    ) {
        return service.getOptions(targetType, category);
    }
    
}
