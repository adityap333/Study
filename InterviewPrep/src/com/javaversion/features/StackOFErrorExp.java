package com.javaversion.features;

public class StackOFErrorExp {
	public static void main(String[] args) {
	    double factorialResult = factorial(1000);
	    System.out.println(factorialResult);
	  }
	  private static int factorial(int i) {
	    /*
	     * if (i == 0 || i == 1 ) '
	     *  return 1;
	     */
	    return i * factorial(i - 1);
	  }
}
