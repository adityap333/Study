package com.javaversion.features;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		CustomExceptionDemo ceDemo = new CustomExceptionDemo();
		ceDemo.calculateExtraBenefits(45);
	}

	public void calculateExtraBenefits(int age) throws RuntimeException {
		// If age is less than 60 throw exception
		/*if (age < 60) {
			throw new InvalidAgeException(age);
		}*/
	}
}

class InvalidAgeException extends RuntimeException {
	private int age;

	InvalidAgeException() {
		super();
	}

	InvalidAgeException(int age) {
		this.age = age;
	}

	InvalidAgeException(String msg, int age) {
		super(msg);
		this.age = age;
	}

	InvalidAgeException(String msg, Throwable cause, int age) {
		super(msg, cause);
		this.age = age;
	}

	@Override
	public String toString() {
		return "InvalidAgeException for Age: " + getAge();
	}

	@Override
	public String getMessage() {
		return "InvalidAgeException for Age: " + getAge();
	}

	public int getAge() {
		return age;
	}
}
