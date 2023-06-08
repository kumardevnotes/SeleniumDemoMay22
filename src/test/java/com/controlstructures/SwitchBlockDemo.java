package com.controlstructures;

public class SwitchBlockDemo {

	public static void main(String[] args) {
		
		int day = 55;
		
		switch(day) {
		case 1:
			System.out.println("Its Day1 and Monday");
			break;
		case 2:
			System.out.println("Its Day2 and Tuesday");
			break;
		case 3:
			System.out.println("Its Day3 and Wednesday");
			break;
		case 4:
			System.out.println("Its Day4 and Thursday");
			break;
		case 5:
			System.out.println("Its Day5 and Friday");
			break;
		default:
			System.out.println("Pass a valid number starting from 1 to 5");
			break;
			
		}
		
	}

}
