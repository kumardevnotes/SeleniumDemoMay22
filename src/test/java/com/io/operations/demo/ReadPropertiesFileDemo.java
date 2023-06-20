package com.io.operations.demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileDemo {

	public static void main(String[] args) throws IOException   {
	
		
			//Below statement gives you the complete path of the current project
			String rootPath =  System.getProperty("user.dir");
			System.out.println(rootPath);
			
			FileReader myFile = new FileReader(rootPath + "//src//test//resources//appData.properties");
			
			Properties props = new Properties();
			
			props.load(myFile);
			System.out.println(props.getProperty("appBrowser")); //Edge
			System.out.println(props.getProperty("appUrl"));
			System.out.println(props.getProperty("appUserEmailID"));
			System.out.println(props.getProperty("apppassword"));
			
			//Below statement will print null on the console as we dont have a property "nitesh" in the appData file
			System.out.println(props.getProperty("nitesh"));
			
		
		
	}

}
