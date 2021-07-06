package com.javaversion.features;

interface Message {
	String readMsg();
}

class Outer {
	private int outerVar = 12;

	public Message msg(String str) {
		// Local variable - it has to be final or
		// effectively final
		String hello = "Hello ";
		// Local Inner class
		class InnerMsg implements Message {

			private String msg;

			InnerMsg(String msg) {
				this.msg = msg;
			}

			@Override
			// implementing interface method
			public String readMsg() {
				//hello = "Hi";
				System.out.println("I can read outer class variable its value is - " + outerVar);
				return hello + msg;
			}
		}
		return new InnerMsg(str);
	}
}

public class InnerClasses {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Message message = outer.msg("Local Inner Class");
		String temp = message.readMsg();
		System.out.println("temp -- " + temp);
	}
}
