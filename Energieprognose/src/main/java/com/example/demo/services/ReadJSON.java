package com.example.demo.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadJSON {

	private String url;
	private HttpURLConnection con;
	private String responsString;
	private BufferedReader in;
	private StringBuffer response;
	
	public ReadJSON(String url) throws IOException {
		this.url = url;
		URL obj = new URL(this.url);
		this.con = (HttpURLConnection) obj.openConnection();
	}
	
	public void openConnection() throws IOException {
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL :" + url);
		System.out.println("Response Code: " + responseCode);
		in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
	}
	
	public String getUrlString() {
		return responsString = response.toString();
	}
	
	public void closeConnection() throws IOException {
		in.close();
	}
	
}
