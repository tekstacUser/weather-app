package com.Weather;

public class Weather {

	 public String getWeather(String city) {
	        
		 if(city.equalsIgnoreCase("Chennai")) {
			 return "Sunny";
		 }else if(city.equalsIgnoreCase("Bangalore")) {
			 return "Cool";
		 }else if(city.equalsIgnoreCase("Kerala")) {
			 return "Warm and wet";
		 }
	        return "";
	 }
	
}
