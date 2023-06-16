package com.inheritance.demo;

//Inheriting parent into child
//Child extends Parent
public class TeacherDemo1 extends SchoolDemo { // 2+2 --> 4

	public static void main(String[] args) {
		TeacherDemo1 myObj  = new TeacherDemo1(); //5MB
		myObj.displayClassTimeTable();
		myObj.displayClassTimeTable(1);
		
		myObj.displaySchoolName();
		myObj.displaySchoolAnnualFee();
		//Below is a private method and not available to access here
	//System.out.println(myObj.getSchoolAnnualIncome());
		
	
	}
	
	//Overriding the method of the parent - Dynamic Polymorphism
	public void displaySchoolName() {
		System.out.println("Hello All! welcome back to school");
		System.out.println("SchoolName: Little Flower Children School");
	}
	
	public void displayClassTimeTable() {
		System.out.println("Morning 11AM  -  English class \n Noon 12PM  -  Maths class ");
	}
	
    public void displayClassTimeTable(int classGrade) {
    	System.out.println("Printing class time table for Grade: " + classGrade);
    	System.out.println("Morning 10AM  -  English class \n Noon 11AM  -  Maths class ");
	}

}
