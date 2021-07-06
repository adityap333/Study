package com.java8.features;

import java.util.function.Function;

public class FunctionalProgramming {

	public static void main(String[] args) {
		Function<Integer,Integer> f= i->i*i;
		System.out.println(f.apply(40));
	}
}
