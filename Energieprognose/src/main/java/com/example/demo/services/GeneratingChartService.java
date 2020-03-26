package com.example.demo.services;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface GeneratingChartService {
 
	List<List<Map<Object, Object>>> getGenerationChartData();
 
}
 
