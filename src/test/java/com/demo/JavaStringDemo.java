package com.demo;

public class JavaStringDemo {

	public static void main(String[] args) {
		
		String empName = "John Miller";
		
		/*
		 * empName[0] = J
		 * empName[1] = o
		 * empName[2] = h
		 * empName[3] = n
		 * empName[4] = __
		 * empName[5] = M
		 * empName[6] = i
		 * empName[7] = l
		 * empName[8] = i
		 * empName[9] = e
		 * empName[10] = r
		 * 
		 * */
		
		System.out.println(empName);
		System.out.println(empName.toUpperCase()); //JOHN MILLER
		System.out.println(empName.toLowerCase()); //john miller
		System.out.println(empName.charAt(2)); //h
		System.out.println(empName.concat(" is a manager")); // John Miller is a manager
		System.out.println(empName.replace('l', 'X')); //John MiXXer
		System.out.println(empName.equals("john miller")); // false    "John Miller" equals "john miller"
		System.out.println(empName.equalsIgnoreCase("john miller")); //true  "John Miller" equalsIgnoreCase "john miller"
		System.out.println(empName.length()); //11
		System.out.println(empName.startsWith("John")); //true
		System.out.println(empName.endsWith("XYZ")); // false
		
		System.out.println(empName.substring(5)); //"John Miller"; Miller
		
		empName = "  John Miller  ";
		System.out.println(empName);
		System.out.println(empName.trim());
		

	}

}
