package com.controlstructures;

public class SwitchDemoII {

	public static void main(String[] args) {

		char empGender = 'A';

		switch (empGender) { // F
		case 'M':
			System.out.println("Its a Male employee");
			break;
		case 'F':
			System.out.println("Its a Female employee");
			break;
		default:
			System.out.println("Please pass a valid empGender");
		}
		
		System.out.println("I am outside switch block now");
	}

}
