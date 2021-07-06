package com.javaversion.features;

public class FinallyDemo {
	public static void main(String[] args) {
		int i = displayValue();
		System.out.println("Value of i " + i);
	}

	static int displayValue() {
		try {
			System.out.println("In try block");
			/*
			 * try { System.out.println("In try block"); int a = 10/0; } catch (Exception
			 * nExp) {
			 * System.out.println("Exception caught in catch block of displayValue"); return
			 * 2; } finally { System.out.println("In finally block"); return 5; } throw new
			 * NullPointerException();
			 */
			int ab = 10/0;
		} catch (Exception nExp) {
			System.out.println("Exception caught in catch block of displayValue");
			return 2;
		} finally {
			System.out.println("In finally block");
   			 // return 3;
			if(1 != 2) return 6;
		}
		return 0;
	}
}
