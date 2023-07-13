package com.day6.java;

public class Day6_Switch_HomeWork {

	public static void main(String[] args) {

		int year = 1904;

		int isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0;

		switch (isLeapYear) {
		case 1:
			System.out.println("\n" + year + " is the leap year.");
			break;

		case 0:
			System.out.println("\n" + year + " is not the leap year.");
			break;

		default:
			System.out.println("\n" + year + " is not the leap year.");
		}

	}

}
