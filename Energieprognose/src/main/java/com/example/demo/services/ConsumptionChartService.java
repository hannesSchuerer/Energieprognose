package com.example.demo.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
 
@Component
public interface ConsumptionChartService {
 
	List<List<Map<Object, Object>>> getCanvasjsChartData();
 
}
 
