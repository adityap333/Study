package com.javaversion.features;

public class CovarientReturn {
	public static void main(String[] args) {
		// Reference of Class C
		C c;
		// pointing to class C
		c = new C();
		System.out.println("Value from class C " + c.getValue().name);
		System.out.println("Value from class C by eclipse" + c.getValue().name);
		// now pointing to class D
		c = new D();
		System.out.println("Value from class D " + c.getValue().name);
	}
}

//used as return type
class A {
	String name;

	A(String name) {
		this.name = name;
	}
}

//sub-class of A, also used as return type
class B extends A {
	B(String name) {
		super(name);
	}
}
class Z{
	String name;
	Z(String name) {
		this.name = name;
	}
}
class C {
	public A getValue() {
		return new A("Test A");
	}
}

class D extends C {
// overriding method, returning subtype of the 
// super class method
	public B getValue() {
		return new B("Test B");
	}
}