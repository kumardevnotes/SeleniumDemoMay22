package com.staticmethods.demo;

//Class Naming Convention
public class StaticMethodsDemo {

	public static void main(String[] args) {
		//calling a static method
		//displayEmpName();
		displayEmpSalary();
		displayEmpName();
		
		//calling below method with int value
		checkEmpTaxStatus(2100);
		
		System.out.println(getEmpCity());// Newyork
		
		System.out.println(getEmpIncentive()); //300
		
		displayFullName("James", "Cameron");
		displayFullName("kumar", "thoudi");
		displayFullName("bipisha", "bipisha");
		displayFullName("Lucie", "Lucie");
		
		displayEmpNameID("John miller" , 33434);
		//Below method throws errro as incorrect order of arguments or param values being passed
		//displayEmpNameID(33434, "John miller");
	}
	
	public static void displayEmpNameID(String name, int empId) { // john, miller
		System.out.println(name + " " +empId); // emp fullname: john miller
	}
	
	public static void displayFullName(String firstName, String lastName) { // john, miller
		System.out.println("emp fullname: "+firstName + " " +lastName); // emp fullname: john miller
	}
	
	//Declaring a method with String return type
	public static String getEmpCity() {
		return "Newyork";
	}
	
	public static int getEmpIncentive() {
		return 300;
	}

	// declaring a static method without any parameter
	//method signature
	public static void displayEmpName() {
		System.out.println("John Doe");
		System.out.println("Manager");
		
	}

	//declaring a static method
	public static void displayEmpSalary() {
		System.out.println(3500);
	}
	
	//declaring a static method with int parameter
	public static void checkEmpTaxStatus(int empSalary) {  //empSalary = 3000
		if(empSalary > 2500) { //2100 > 2500 --> false
			System.out.println("Emp has to pay 30% tax");
		}
		else
		{
			System.out.println("Emp has to pay 10% tax");
		}
	}

}
