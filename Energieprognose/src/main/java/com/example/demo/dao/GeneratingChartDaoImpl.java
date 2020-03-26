package com.example.demo.dao;

import com.example.demo.model.ConsumptionChartData;
import com.example.demo.model.GeneratingChartData;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class GeneratingChartDaoImpl implements GeneratingChartDao {
 
	@Override
	public List<List<Map<Object, Object>>> getGenerationChartData() {
		return GeneratingChartData.getGenerationChartData();
	}
 
} 
