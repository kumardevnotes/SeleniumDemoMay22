package com.arrays.demo;

public class ArraysDemo {

	public static void main(String[] args) {
		//A variable in java stores only one value at any given point of time
		int stdID = 1122;
		
		stdID = 3344;
		//System.out.println(stdID);
		
		/*
		 * Arrays store multiple values into single variable
		 * Arrays store only same type of data / homogeneous data
		 * */
		int stdIds[] = {112, 3344,5566, 1234, 767, 112, 3344,5566, 1234, 767, 112, 3344,5566, 1234, 767};
		              // 0     1   2      3     4
		
		/*System.out.println(stdIds[0]);
		System.out.println(stdIds[1]);
		System.out.println(stdIds[2]);
		System.out.println(stdIds[3]);
		
		System.out.println(stdIds[4]);
		
		System.out.println(stdIds.length);
		
		System.out.println(stdIds[stdIds.length-1]); */
		
		//classic forloop
//		for (int j = 0; j < stdIds.length; j++) { // 5 < 5
//			System.out.println(stdIds[j]);
//		} 
		
		for (Integer myObj : stdIds) {
			System.out.println(myObj);
		}
		
	}

}
