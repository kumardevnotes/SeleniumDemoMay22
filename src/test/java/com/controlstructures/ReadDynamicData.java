package com.controlstructures;

import java.util.Scanner;

public class ReadDynamicData {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Pls enter std Marks to check the results");

		int stdMarks = myScanner.nextInt();

		if (stdMarks >= 35 && stdMarks <= 100) {
			System.out.println("Std Passed in the exam");
		} else if (stdMarks > 100) {
			System.out.println("you have entered incorrect std marks. pls check");
		} else {
			System.out.println("Std failed in the exam");
		}
		
		//String city = myScanner.nextLine();
		
		/*
		 * if (city.equals("Newyork")) {
			System.out.println("It is newyork");
		}  else {
			System.out.println("It is not newyork");
		}*/
	}

}
