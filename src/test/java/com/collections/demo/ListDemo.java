package com.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		//EmpName, EmpID, EmpSal, EmpMarStatus, EmpAge
		// List stores duplicate elements/data
		//List follows indexing
		
		List empDetails = new ArrayList();
		
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
		
		for(Object myObj : empDetails) {
			System.out.println(myObj);
		}
		
		empDetails.add("Newyork");
		
		System.out.println(empDetails);
		
	System.out.println(empDetails.get(2)); // 1200.5000565
	
	empDetails.remove(4);
	System.out.println(empDetails.size());
	System.out.println(empDetails.isEmpty());
	
	System.out.println(empDetails.contains(33444));
	
	empDetails.clear();
	System.out.println(empDetails.isEmpty());

	}

}
