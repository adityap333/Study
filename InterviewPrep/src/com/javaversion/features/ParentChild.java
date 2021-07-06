package com.javaversion.features;

public class ParentChild {
	
	public static void main(String[] args) {
		//Child p = (Child) new Parent();
		Child.staticMethod();
		//System.out.println(p.getAddress());
		int[] numArr = new int[-10];
	}
}
class Parent{
	public String name = "aditya";

	public String getName() {
		return name;
	}
	public static void staticMethod() {
		System.out.println("in parent static");
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Child extends Parent{
	public String address="pune";

	public String getAddress() {
		return address;
	}
	public static void staticMethod() {
		Parent.staticMethod();
		System.out.println("in child static");
	}
	public void setAddress(String address) {
		this.address = address;
	}
}