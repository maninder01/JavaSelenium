package com.day6.java;

public class Day6_While_Loop_HomeWork {

	public static void main(String[] args) {
		// can you write a program to print first 100 natural numbers using while loop
		
		// can you write a program to print first 50 even numbers using while loop
		// write a program to print first 50 even numbers using while loop
		
		// write a program to print reversely from 100 to 1 using while loop
		
		// write a program to print reversely from 99 till 3 with 3 separations - 99,
		// 96, 93, 90, ......... 3
		
		// write a program to print first 10 multiples of 5 and add the sum of the
		// multiples
		
		// write a program to print from 100 till 5 reversely - 100,95,90,......5 and
		// then add the sum of all the reverse multiples and give the value
		
		System.out.println("From While Loop");
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

		int i = 1;
		while (i <= rangeOfNumbers) {
			System.out.print(i + " ");
			i++;
		}

		spacer();
	}

	public static void printEvenNumbers() {
		int rangeOfNumbers = 100;

		int i = 1;
		while (i <= rangeOfNumbers) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		spacer();
	}

	public static void reverseNumbers() {

		int i = 100;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		spacer();
	}

	public static void reverseNumbersWithSeparation() {
		int seprationValue = 3;

		int i = 100;
		while (i >= 1) {
			if (i % seprationValue == 0) {
				System.out.print(i + " ");
			}
			i--;
		}
		spacer();
	}

	public static void first10MultiplesOfGivenNumber() {
		int rangeOfNumbers = 10;
		int givenNumber = 5;
		int multipleCountVlaue = givenNumber * rangeOfNumbers;

		int sum = 0;

		int i = 1;
		while (i <= multipleCountVlaue) {
			if (i % givenNumber == 0) {
				System.out.print(i + " ");
				sum += i;
			}
			i++;
		}

		System.out.println("\n Total is: " + sum);

		spacer();
	}

	public static void reverseNumbersWithSeparationAndSum() {
		int seprationValue = 5;

		int sum = 0;

		int i = 100;
		while (i >= 1) {
			if (i % seprationValue == 0) {
				System.out.print(i + " ");
				sum += i;
			}
			i--;
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
