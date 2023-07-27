package com.day7.java;

public class PatternAssignment {

	public static void main(String[] args) {
		square();
		leftTriangle();
		rightTriangle();
		starPyramidUpsideDown();
		starPyramid();

	}

	public static void square() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}
		spacer();
	}

	public static void leftTriangle() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}

		System.out.println();
		spacer();
	}

	public static void rightTriangle() {
		int numbersOfRows = 5;

		for (int i = 1; i <= numbersOfRows; i++) {

			for (int j = 1; j <= numbersOfRows - i; j++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		spacer();

	}

	public static void starPyramid() {
		int numbersOfRows = 6;

		for (int i = 0; i < numbersOfRows; i++) {

			for (int j = numbersOfRows - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	public static void starPyramidUpsideDown() {
		int numbersOfRows = 6;

		for (int i = 0; i < numbersOfRows; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < numbersOfRows - i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	public static void spacer() {
		System.out.println();
	}

}
