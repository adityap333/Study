package com.javaversion.features;

public class Varargs {
	public static void main(String[] args) {
		VarargsExample vObj = new VarargsExample();
		// four args
		vObj.displayData("var", "args", "are", "passed");
		// three args
		vObj.displayData("Three", "args", "passed");
		// no-arg
		vObj.displayData();
	}
}

class VarargsExample {
	public void displayData(String ... values) {
		System.out.println("Number of arguments passed " + values.length);
		for (String s : values) {
			System.out.println(s + " ");
		}
	}
}