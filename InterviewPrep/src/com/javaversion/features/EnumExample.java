package com.javaversion.features;

enum Day {
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private int day;

	private Day(int day) {
		this.day = day;
	}

	int getDay() {
		return day;
	}
}

public class EnumExample {
	public static void main(String[] args) {
		Day[] allDays = Day.values();
		for (Day day : allDays) {
			System.out.println(day);
			System.out.println(day.getDay());
		}
	}
}
