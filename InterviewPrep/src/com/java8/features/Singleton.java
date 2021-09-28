package com.java8.features;

public class Singleton {
	private static Singleton singleton;

	// We make the constructor private to prevent the use of "new"
	private Singleton() { }

	public static Singleton getSingletom() {
		// Lazy initialization
		if (singleton == null) {
			singleton = new Singleton();
			System.out.println("New captain is elected for your team.");
		} else {
			System.out.print("You already have a captain for your team.");
			System.out.println("Send him for the toss.");
		}
		return singleton;
	}
}
abstract class abc{
	abstract void display();
}
abstract class pqr extends abc{
	abstract void display();
}
class myclass extends pqr{

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
}