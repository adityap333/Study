package com.java8.lambdaExpression;

interface Parser {
	String parse(String str);
}

class StringParser {
	public static String convert(String s) {
		if (s.length() <= 3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();
		return s;
	}
}

class MyPrinter {
	public void print(String str, Parser p ) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodRefBestExample {
	public static void main(String[] args) {

		String str = "Aditya Pujari";
		MyPrinter mp = new MyPrinter();
		/*
		 * mp.print(str, new Parser() { public String parse(String str) { return
		 * StringParser.convert(str); } });
		 */
		//mp.print(str, s -> StringParser.convert(s));
		mp.print(str,StringParser::convert);
	}
}
