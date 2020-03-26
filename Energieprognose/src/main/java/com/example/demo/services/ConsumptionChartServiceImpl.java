package com.example.demo.services;

import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ConsumptionChartDao;
 
@Component
public class ConsumptionChartServiceImpl implements ConsumptionChartService {
 
	private ConsumptionChartDao consumptionChartDao;
 
	@Autowired
	public void setCanvasjsChartDao(ConsumptionChartDao consumptionChartDao) {
		this.consumptionChartDao = consumptionChartDao;
	}
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		return consumptionChartDao.getCanvasjsChartData();
	}
 
}