package com.example.demo.services;

import com.fasterxml.jackson.core.io.JsonEOFException;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;

public class ConsumptionJson {

    private static ReadJSON rj;
    private static JSONArray powerDataJson;

    static{
        try {
            rj = new ReadJSON("http://80.120.42.246:82/androidapi/api/gesamtverbrauch");
            rj.openConnection();
            String powerDataString = rj.getUrlString();
            rj.closeConnection();
            powerDataJson = new JSONArray(powerDataString);
        }catch(IOException e)
        {

        }catch(JSONException e){

        }
    }

    public static JSONArray getPowerDataJson(){
        try {
            rj = new ReadJSON("http://80.120.42.246:82/androidapi/api/gesamtverbrauch");
            rj.openConnection();
            String powerDataString = rj.getUrlString();
            rj.closeConnection();
            powerDataJson = new JSONArray(powerDataString);
        }catch(JSONException e){

        }catch(IOException e){

        }
        return powerDataJson;
    }

}
