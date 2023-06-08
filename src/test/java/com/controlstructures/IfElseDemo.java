package com.controlstructures;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int empFixedSalary = 2500;
		int empIncentive =  300;
		
		int finalSalry = empFixedSalary + empIncentive;
		
		System.out.println(finalSalry);
		
		int personAge = 18;
		
		if(personAge >= 18) { // 18 >= 18 --> true
			System.out.println("Person is eligible to Vote");
		}
		else {
			System.out.println("Person is not eligible to vote");
		}
		
	}

}
