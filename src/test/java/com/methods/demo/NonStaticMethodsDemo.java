package com.methods.demo;

public class NonStaticMethodsDemo {

	public static void main(String[] args) {
		
		NonStaticMethodsDemo myObj = new NonStaticMethodsDemo(); //A standard java expression to create a class object
		//Calling a non-static method with the class object
		myObj.displayEmpName();
		
		myObj.checkEmpTaxStatus(2100);
		myObj.displayEmpNameID("Sam", 3344);
		myObj.displayFullName("Kumar", "Thoudi");
		
		String empCity = myObj.getEmpCity();
		System.out.println(empCity);
		
		int empIncentive = myObj.getEmpIncentive();
		System.out.println(empIncentive);
	}
	
	//Declaring a non-static method with String, int parameters
	public void displayEmpNameID(String name, int empId) { 
		System.out.println(name + " " +empId); 
	}
	
	//Declaring a non-static method with String, String parameters
	public void displayFullName(String firstName, String lastName) { 
		System.out.println("emp fullname: "+firstName + " " +lastName); 
	}
	
	//Declaring a non-static method with String return type
	public String getEmpCity() {
		return "Newyork";
	}
	
	// declaring a non-static method with return type as int
	public  int getEmpIncentive() {
		return 300;
	}

	//declaring a non-static method without any parameter
	public void displayEmpName() {
		System.out.println("John Doe");
		System.out.println("Manager");
		
	}

	//declaring a non-static method with int parameter
	public void checkEmpTaxStatus(int empSalary) { //2100
		if(empSalary > 2500) { // 2100 > 2500
			System.out.println("Emp has to pay 30% tax");
		}
		else
		{
			System.out.println("Emp has to pay 10% tax");
		}
	}

}
