package com.example.demo.services;

import com.example.demo.dao.ConsumptionChartDao;
import com.example.demo.dao.GeneratingChartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class GeneratingChartServiceImpl implements GeneratingChartService {
 
	private GeneratingChartDao generatingChartDao;
 
	@Autowired
	public void setCanvasjsChartDao(GeneratingChartDao generatingChartDao) {
		this.generatingChartDao = generatingChartDao;
	}
 
	@Override
	public List<List<Map<Object, Object>>> getGenerationChartData() {
		return generatingChartDao.getGenerationChartData();
	}
 
}