package com.day6.java;

public class Day6_ForLoop_Homework {

	public static void main(String[] args) {
		// can you write a program to print first 100 natural numbers using for loop
		
		// can you write a program to print first 50 even numbers using for loop
		// write a program to print first 50 even numbers using for loop
		
		// write a program to print reversely from 100 to 1 using for loop
		
		// write a program to print reversely from 99 till 3 with 3 separations - 99,
		// 96, 93, 90, ......... 3
		
		// write a program to print first 10 multiples of 5 and add the sum of the
		// multiples
		
		// write a program to print from 100 till 5 reversely - 100,95,90,......5 and
		// then add the sum of all the reverse multiples and give the value
		
		System.out.println("From For Loop");
		System.out.println();

		printNaturalNumbers();
		printEvenNumbers();
		reverseNumbers();
		reverseNumbersWithSeparation();
		first10MultiplesOfGivenNumber();
		reverseNumbersWithSeparationAndSum();
	}

	public static void printNaturalNumbers() {
		int rangeOfNumbers = 100;

		for (int i = 1; i <= rangeOfNumbers; i++) {
			System.out.print(i + " ");
		}
		spacer();
	}

	public static void printEvenNumbers() {
		int rangeOfNumbers = 100;

		for (int i = 1; i <= rangeOfNumbers; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		spacer();
	}

	public static void reverseNumbers() {
		int rangeOfNumbers = 100;

		for (int i = rangeOfNumbers; i >= 1; i--) {
			System.out.print(i + " ");
		}
		spacer();
	}

	public static void reverseNumbersWithSeparation() {
		int rangeOfNumbers = 100;
		int seprationValue = 3;

		for (int i = rangeOfNumbers; i >= 1; i--) {
			if (i % seprationValue == 0) {
				System.out.print(i + " ");
			}
		}
		spacer();
	}

	public static void first10MultiplesOfGivenNumber() {
		int rangeOfNumbers = 10;
		int givenNumber = 5;
		int multipleCountVlaue = givenNumber * rangeOfNumbers;

		int sum = 0;

		for (int i = 1; i <= multipleCountVlaue; i++) {
			if (i % givenNumber == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\n Total is: " + sum);

		spacer();
	}
	
	public static void reverseNumbersWithSeparationAndSum() {
		int rangeOfNumbers = 100;
		int seprationValue = 5;
		
		int sum =0;

		for (int i = rangeOfNumbers; i >= 1; i--) {
			if (i % seprationValue == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\n Total is: " + sum);
		spacer();
	}

	public static void spacer() {
		System.out.println("");
		System.out.println("\n *********** End of Question ***********");
		System.out.println("");
	}
}
