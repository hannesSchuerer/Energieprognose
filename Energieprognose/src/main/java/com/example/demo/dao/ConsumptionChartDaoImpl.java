package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.model.ConsumptionChartData;
 
@Repository
public class ConsumptionChartDaoImpl implements ConsumptionChartDao {
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		return ConsumptionChartData.getCanvasjsDataList();
	}
 
} 
