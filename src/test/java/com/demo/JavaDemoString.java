package com.demo;

public class JavaDemoString {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 50;
		System.out.println(num1 + num2);

		String firstName = "John";
		String lastName = "Miller";
		System.out.println(firstName + " " + lastName);

		System.out.println(firstName + lastName + num1 + num2);

		/*
		 * Output: 150 
		 * John Miller 
		 * JohnMiller10050
		 */
	}

}
