package com.inheritance.demo;

public class SchoolDemo {

	
	public void displaySchoolName() {
		System.out.println("Reynolds Public School");
	}
	
    public void displaySchoolAnnualFee() {
    	System.out.println("It is 2500$ for Grade1 ");
	}
    
    //if you make a method as private as shown belw, it is not accessible to outside people or subclasses/inheritec classes
    private int getSchoolAnnualIncome() {
    	return 20000; // 20k dollars
    }
	
}
