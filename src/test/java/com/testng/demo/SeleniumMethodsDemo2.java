package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;

/*
 * 1. Launch browser
 * 2. Launch App https://www.speaklanguages.com/
 * 3. Click on Log in link
 * 4. Enter email address and leave the password field as blank
 * 5. Click on Log in button
 * 6. Verify that user is prompted with "Please enter your password." error message
 * */

public class SeleniumMethodsDemo2 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		String rootPath = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", rootPath + "//src//test//resources//msedgedriver.exe");
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(edgeOptions);
		
		//To maximize browser, use below code
		driver.manage().window().maximize();
		System.out.println("browser opened and app is launched befre running TC");
	}

	@Test
	public void launchApp() throws InterruptedException {
		
		//To launch the app in the browser which is opened in above beforeMethod(), we use below get()
		driver.get("https://speaklanguages.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email_input")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("email_input")).clear();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("email_input")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_button")).click();
		
		Thread.sleep(5000);
		
		String errorTextExpected ="Please enter your password.";
		String errorTextActual  = driver.findElement(By.xpath("//li[@class='error_message']")).getText();
		
		if(errorTextActual.equals(errorTextExpected)) { //true
			System.out.println("Error message verfied on the login page..");
		}
		else {
			System.out.println("Something went wrong. Unable to verify an error message on the login page..");
		}
		
		boolean isDisplayed  = driver.findElement(By.xpath("//li[@class='error_message']")).isDisplayed();
		
		if(isDisplayed) { //true
			System.out.println("Error message  displayed");
		}
		else {
			System.out.println("Error message not  displayed");
		}
		
		boolean isEnabled  = driver.findElement(By.id("login_button")).isEnabled();
		if(isEnabled) { //true
			System.out.println("Log in button enabled");
		}
		else {
			System.out.println("Log in button not enabled");
		}
		
	}

	@AfterMethod
	public void afterMethod() {
		
		//quit() will close all the opened tabs
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}

}
