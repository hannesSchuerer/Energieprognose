package com.example.demo.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.example.demo.services.ReadJSON;

 
public class CanvasjsChartData extends Thread{
 
	private ReadJSON rj;
	static Map<Object,Object> map = null;
	static List<List<Map<Object,Object>>> list = new ArrayList<List<Map<Object,Object>>>();
	static List<Map<Object,Object>> dataPoints1 = new ArrayList<Map<Object,Object>>();
	
	long time = System.currentTimeMillis();
	
	static {
		
		list.add(dataPoints1);
		//System.out.println(list);
	}
	
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}catch (Exception e) {
			System.out.println("Exception is caught");
		}
		
		JSONObject powerDataJson;
		int power = 0;
		
		while(true) {
			try {
				rj = new ReadJSON("http://80.120.42.246:82/androidapi/api/verbrauch");
				rj.openConnection();
				String powerDataString = rj.getUrlString();
				powerDataJson = new JSONObject(powerDataString);
				power = powerDataJson.getInt("tagesVerbrauch");
				System.out.println(power);
				time = System.currentTimeMillis();
				map = new HashMap<Object,Object>(); map.put("x", time); map.put("y", power);dataPoints1.add(map);
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
 
	public static List<List<Map<Object, Object>>> getCanvasjsDataList() {
		return list;
	}
}