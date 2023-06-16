package com.inheritance.demo;

//Inheriting parent into child
//Child extends Parent
public class TeacherDemo2 extends SchoolDemo { // 2+2 --> 4

	//class level variable
	public static int Id  =  100;
	
	public static void main(String[] args) {
	
		TeacherDemo2 myObj = new TeacherDemo2();
		myObj.displayDetails();
		
		displayID();
		updateId();
		displayID();
	}
	
	public static void displayID() {
		System.out.println(Id);
	}
	
	public static void updateId() {
		Id =  200;
	}
	
	//Calling a method inside another method
	public void displayDetails() {
		this.displayAddress(); // Assume that this is my child class method
		super.displayAddress();
		System.out.println(this.Id);
		System.out.println(super.Id);
	}
	
	
	public void displayAddress() {
		System.out.println("Mr John Doe. 231, King Street, Newjersy 10430");
	}
	
	
	public void displayClassTimeTable() {
		System.out.println("Morning 11AM  -  English class \n Noon 12PM  -  Maths class ");
	}
	
    public void displayClassTimeTable(int classGrade) {
    	System.out.println("Printing class time table for Grade: " + classGrade);
    	System.out.println("Morning 10AM  -  English class \n Noon 11AM  -  Maths class ");
	}

}
