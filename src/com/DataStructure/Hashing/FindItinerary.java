package com.DataStructure.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FindItinerary {

	public static void main(String[] args) {
		Map<String, String> dataSet = new HashMap<>();
		dataSet.put("Chennai", "Banglore"); 
		dataSet.put("Bombay", "Delhi"); 
		dataSet.put("Goa", "Chennai"); 
		dataSet.put("Delhi", "Goa"); 
		
		itinerary(dataSet);

	}

	private static void itinerary(Map<String, String> dataSet) {
		Map<String, String> reverse = new HashMap<String, String>();
		for(Map.Entry<String, String> entry : dataSet.entrySet()) {
			reverse.put(entry.getValue(), entry.getKey());
		}
		String start = null;
		
		for(Map.Entry<String, String> entry : dataSet.entrySet()) {
			if(!reverse.containsKey(entry.getKey())) {
				start = entry.getKey();
				break;
			}
		}
			
		if(start == null) {
			System.out.println("Invalid Input");
			return;
		}
		
		String starting = dataSet.get(start);
		while(starting != null) {
			System.out.println(start +  "->" + starting + ", "); 
            start = starting; 
            starting = dataSet.get(starting); 
		}
	}

}
