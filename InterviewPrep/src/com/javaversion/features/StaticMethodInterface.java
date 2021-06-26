package com.javaversion.features;

public interface StaticMethodInterface {

	static String getName() {
		return "Aditya";
	}
	
	default String thismethod(Integer age) {
		String name = "in static method interface" + age;
		return name;
	}
}
