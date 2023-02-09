package com.scratch.test;

public class Factorial {

	public static void main(String[] args) {

		Factorial fact = new Factorial(5);

		System.out.println("Factorial is : " + factorial(5));

	}

	public static int factorial(int num) {

		int result = 1;

		while (num > 0) {

			result = result * num;
			num--;

			;
		}
		return result;
	}

	public Factorial(int num) {

		int result = 1;

		while (num > 0) {

			result = result * num;
			num--;

			;
		}
		System.out.println("Factorial is : " + result);
	}

}
