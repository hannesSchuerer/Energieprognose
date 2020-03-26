package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GeneratingChartDao {
 
	List<List<Map<Object, Object>>> getGenerationChartData();
 
}
 

        