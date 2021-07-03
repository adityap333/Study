package com.javaversion.features;

public class Casting {
	public static void main(String[] args) {
		MainCastion cast;
		BB b = new BB();
		CC c = new CC();
		//cast = b;
		MainCastion cast2 = new MainCastion();
		// b = (BB)cast2;
		AbstractClass ac = b;
		AbstractClass acp = new BB();
		System.out.println("b" + b);
		ac.mymethod();
		int month = 4;
		switch (month) {
		case 1, 2, 3 -> System.out.println("Quarter 1");

		case 4, 5, 6 -> System.out.println("Quarter 2");

		case 7, 8, 9 -> System.out.println("Quarter 3");

		case 10, 11, 12 -> System.out.println("Quarter 4");

		default -> System.out.println("Invalid month value passed");
		}
		
		 System.out.println("The object's" + " class is " +
				 cast2.getClass().getSimpleName());
		 Integer abc= Integer.valueOf(6789);
		 System.out.println(abc.reverse(6789));
	}
}

class MainCastion {
	public String p = "pppp";
	public String a = "aditya";
}

class BB extends AbstractClass {
	public String a = "fdgfg";

	@Override
	void mymethod() {
		System.out.println("implemented");
		
	}

}

class CC extends MainCastion {
	public String r = "refg";
}