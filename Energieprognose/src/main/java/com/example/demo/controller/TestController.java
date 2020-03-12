package com.example.demo.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.EnergydataDao;
import com.example.demo.model.Energydata;
import com.example.demo.services.ReadJSON;
import com.example.demo.services.CanvasjsChartService;


@Controller
public class TestController{
	
	private EnergydataDao energydataDAO;
	private ReadJSON rj;
	
	@Autowired
	public TestController(EnergydataDao energydataDAO) {
        this.energydataDAO = energydataDAO;
    }
	
	@Autowired
	private CanvasjsChartService canvasjsChartService;
	
	@RequestMapping("/")
	public String welcome(ModelMap model) throws URISyntaxException, IOException, JSONException
	{
		List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService.getCanvasjsChartData();
		model.addAttribute("dataPointsList", canvasjsDataList);

		rj = new ReadJSON("http://api.openweathermap.org/data/2.5/weather?q=Hallein&units=metric&appid=2ca1e7f1b8f1ce750da10a52a8c4a4d1");
		rj.openConnection();
		String weatherDataString = rj.getUrlString();
		JSONObject weatherDataJson = new JSONObject(weatherDataString);
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date currentTimeDate = new Date(System.currentTimeMillis());
		Date sunriseTimeDate = new Date(weatherDataJson.getJSONObject("sys").getLong("sunrise")*1000);
		Date sunsetTimeDate = new Date(weatherDataJson.getJSONObject("sys").getLong("sunset")*1000);
		String currentTime = dateFormat.format(currentTimeDate);
		String sunriseTime = dateFormat.format(sunriseTimeDate);
		String sunsetTime = dateFormat.format(sunsetTimeDate);
		
		Iterable<Energydata> all = energydataDAO.findAll();
		 
	    StringBuilder sb = new StringBuilder();
	 
	    all.forEach(p -> sb.append(p.getCosPhi() + "<br>"));
		
	    model.put("currentTime", currentTime);
		model.put("main", weatherDataJson.getJSONArray("weather").getJSONObject(0).getString("main"));
		model.put("description", weatherDataJson.getJSONArray("weather").getJSONObject(0).getString("description"));
		model.put("temperature", weatherDataJson.getJSONObject("main").getDouble("temp"));
		model.put("sunrise", sunriseTime);
		model.put("sunset", sunsetTime);
		rj.closeConnection();
		
		return "welcome";
	}
	
}
