package com.java8.features;

/*Lambda expression is
	Nameless
	No return type
	No access modifiers
	LE can be called via Functional interface
*/

/******************
 * Examples of functional interface
 * Runnable = run()
 * Comparable = compareTo()
 * Comparator = compare()
 * ActionListner = actionPerformed()
 * Callable = call()
 */
public class LambdaExpression {
	public static void main(String[] args) {
		LambdaExpression le = new LambdaExpression();
		le.m1();
	}
	
	public void m1() {
		System.out.println("hello");
	}
	//() -> System.out.println("hello");
	
	public void m2(int a,int b) {
		System.out.println(a+b);
	}
	//() -> System.out.println(a+b);
	
	public int squareIt(int n) {
		return n*n;
	}
	
	/******************
	 * 	Syntex of lambda expressions
	 *	n -> return n*n; = invalid 
	 *  n ->{return n*n;};= valid
	 *  n ->{return n*n};= invalid
	 *  n -> n*n; = valid
	 */
	
}

@FunctionalInterface
interface myFunctionalInterface{
	abstract void yesIamAbstract();
	default void m2() {
		System.out.println("I am default");
	}
	public static void m3()
	{
		System.out.println("I am static");
	}
}