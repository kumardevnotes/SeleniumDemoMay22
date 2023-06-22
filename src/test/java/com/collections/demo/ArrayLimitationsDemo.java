package com.collections.demo;

public class ArrayLimitationsDemo {

	public static void main(String[] args) {

		//Arrays store only same type of data or homogeneous data.
		// If you try to store String or char data into below array, it will throw type mismatch error
	int empIds[] = {123, 87, 9010};
	               //0    1   2
	
	System.out.println(empIds[0]); //123
	System.out.println(empIds[2]); // 9010
	System.out.println(empIds[1]); //87
	
	// As you already stored 3 values into your array, it will not accept new value
	//Array size is fixed and not dynamic
	//empIds[3] = 10001;
	
	//Arrays size is declared but not assigned values
	int stdIds[] = new int[1000];
	
	//Assigning values into array
	stdIds[0] = 101;
	stdIds[1] = 102;
	stdIds[2] = 103;
	stdIds[3] = 104;
	stdIds[4] = 105;
		
	}

}
