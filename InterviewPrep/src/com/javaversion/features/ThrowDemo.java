package com.javaversion.features;

import java.io.IOException;

public class ThrowDemo {
	public static void main(String[] args) {
		ThrowDemo throwDemo = new ThrowDemo();
		//throwDemo.displayValue();
		/*
		 * try { throwDemo.displayValue(); } catch (NullPointerException nExp) {
		 * System.out.println("Exception caught in catch block of main");
		 * nExp.printStackTrace(); ; }
		 */
	}

	public void displayValue() throws IOException{
		int abc = 10/0;
	}
}
