package com.javaversion.features;

public class Java8Interface implements NormalInteface,StaticMethodInterface{

	public static void main(String[] args) {
		NormalInteface.getName();
	}
	
	@Override
	public String thismethod(Integer age) {
		StaticMethodInterface.super.thismethod(22);
		return "dsfsdf";
	}
}
