package com.javaversion.features;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Temp {
	public static void main(String[] args) {
		  String date = "12/01/2016";
		  System.out.println("index " + date.indexOf('/'));
		  
		  Map<String, String> cityMap = new HashMap<String, String>();
		  cityMap.put("1","New York City" );
		  cityMap.put("2", "New Delhi");
		  cityMap.put("3", "Newark");
		  cityMap.put("4", "Newport");
		  
		  System.out.println("Looping with keySet");
		  // Loop through HashMap using Key Set
		  Set<String> citySet =  cityMap.keySet();
		  for(String key : citySet){
		   System.out.println("Key is " + key + " Value is " + cityMap.get(key));
		  }
		  
		  System.out.println("Looping HashMap using entrySet");
		  // Second way with entrySet
		  for(Map.Entry<String, String> entry:  cityMap.entrySet()){
		   System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());
		  }
		 }
	 public <T> void printElements(T[] arr){
		    // Displaying elements
		    for(int i = 0; i < arr.length; i++){
		      System.out.print(" " + arr[i]);
		    }
		    System.out.println();
		  }
}
