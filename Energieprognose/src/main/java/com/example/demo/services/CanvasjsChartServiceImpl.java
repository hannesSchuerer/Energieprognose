package com.example.demo.services;

import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CanvasjsChartDao;
 
@Component
public class CanvasjsChartServiceImpl implements CanvasjsChartService {
 
	private CanvasjsChartDao canvasjsChartDao;
 
	@Autowired
	public void setCanvasjsChartDao(CanvasjsChartDao canvasjsChartDao) {
		this.canvasjsChartDao = canvasjsChartDao;
	}
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		return canvasjsChartDao.getCanvasjsChartData();
	}
 
}