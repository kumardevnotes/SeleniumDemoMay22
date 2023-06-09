package com.exception.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Properties props = new Properties();

		try {
			String empName = "John";
			System.out.println(empName.toUpperCase());

			int num1 = 100;
			int num2 = 10;
			System.out.println(num1 / num2); // 100/0
			
			
			//Below statement gives you the complete path of the current project
			String rootPath =  System.getProperty("user.dir");
			System.out.println(rootPath);
			FileReader myFile = new FileReader(rootPath + "//src//test//resources//appData.properties");
			props.load(myFile);
			System.out.println(props.getProperty("appBrowser")); //Edge
			System.out.println(props.getProperty("appUrl"));
			System.out.println(props.getProperty("appUserEmailID"));
			System.out.println(props.getProperty("apppassword"));
			
			//Below statement will print null on the console as we dont have a property "nitesh" in the appData file
			System.out.println(props.getProperty("nitesh"));
			

		} catch (NullPointerException e) {
			System.out.println("Caught an exception or error: " + e);
		}

		catch (FileNotFoundException e) {
			System.out.println("Caught an exception or error: " + e);
		}
		
		catch (IOException e) {
			System.out.println("Caught an exception or error: " + e);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Caught an exception or error: " + e);
		}
		
		finally {
			System.out.println("I will run always");
			//removing data from props
			props.clear();
		}
		
		System.out.println("Program completed");
	}

}
