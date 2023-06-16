package com.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		try {
			String empName  = "John";
			System.out.println(empName.toUpperCase());
			
			int num1 = 100;
			int num2 = 0;
			System.out.println(num1/num2); // 100/0
			
		} catch (NullPointerException e) {
			System.out.println("Caught an exception or error: " + e);
		}
		catch (ArithmeticException e) {
			System.out.println("Caught an exception or error: " + e);
		}
		
		System.out.println("Program completed");
	}

}
