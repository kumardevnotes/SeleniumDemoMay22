package com.collections.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		// EmpName, EmpID, EmpSal, EmpMarStatus, EmpAge
		// Set will not store duplicate elements/data
		// Set will not follow indexing

		Set empDetails = new HashSet(); //

		empDetails.add("John Doe");
		empDetails.add(1122);
		empDetails.add(1200.5000565);
		empDetails.add(true);
		empDetails.add(35);

		empDetails.add("John Doe");
		empDetails.add("John Doe");
		empDetails.add("John Doe");
		empDetails.add(1122);
		empDetails.add(1122);

		System.out.println(empDetails);

		//Advanced for loop
		for (Object myObj : empDetails) {
			System.out.println(myObj);
		}

		empDetails.add("Newyork");

		System.out.println(empDetails);

		// Set will not allow indexing. So below statement will give syntactical error
		//System.out.println(empDetails.get(2)); // 1200.5000565

		empDetails.remove(4);
		System.out.println(empDetails.size());
		System.out.println(empDetails.isEmpty());

		System.out.println(empDetails.contains(33444));

		empDetails.clear();
		System.out.println(empDetails.isEmpty());

	}

}
