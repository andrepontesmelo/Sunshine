package com.ignorelist.melo.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {

        JSONObject jObject = new JSONObject(weatherJsonStr);

        JSONArray days = jObject.getJSONArray("list");

        JSONObject day = days.getJSONObject(dayIndex);

        return day.getJSONObject("temp").getDouble("max");

    }

}
