package com.constructors.demo;

public class ConstructorDemo {
	
	//Declaring a constructor
	//Constructor is a special method/function in java whose name should e same as className
	//Default constructor
	ConstructorDemo(){
		System.out.println("Hello All! I am default constructor");
		System.out.println("John Miller");
		System.out.println("112233, 567800, Newyork");
	}
	
	//String parameterized constructor 
	ConstructorDemo(String myMessage){
		System.out.println("Got a new message: " + myMessage);
	}
	
	// int parameterized constructor
	ConstructorDemo(int empPostalCode) {
		System.out.println("emp PostalCode: " + empPostalCode);
	}

	public static void main(String[] args) {
		
		ConstructorDemo myObj2 = new ConstructorDemo("Hello All! How are you ?");
		
		ConstructorDemo myObj = new ConstructorDemo();
		myObj.displayEmpName();
		myObj.displayFullName("Sam", "Josh");
		
		ConstructorDemo myObj3 = new ConstructorDemo(9135);
		
	}
	
	
	//Declaring a non-static method with String, String parameters
	public void displayFullName(String firstName, String lastName) { 
		System.out.println("emp fullname: "+firstName + " " +lastName); 
	}

	//declaring a non-static method without any parameter
	public void displayEmpName() {
		System.out.println("John Doe");
	}


}
