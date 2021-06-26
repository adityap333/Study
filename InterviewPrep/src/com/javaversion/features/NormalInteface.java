package com.javaversion.features;

public interface NormalInteface{
	static String getName() {
		return "";
	}
	
	default String thismethod(Integer age) {
		String name = "in normalinterface" + age;
		return name;
	}
}
