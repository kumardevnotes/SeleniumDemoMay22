package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;

/*
 * 1. Launch browser
 * 2. Launch App https://www.speaklanguages.com/
 * 3. Click on Log in link
 * 4. Verify that user is able to select "Keep me logged in" Checkbox, if it is not selected
 * */	

public class SeleniumMethodsDemo3 {

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
		
		boolean isSelected  = driver.findElement(By.id("keep_logged_in_input")).isSelected();
		
		if(isSelected) { //true
			System.out.println("Keep me logged in is selected already");
		}
		else {
			System.out.println("Keep me logged in not selected");
			driver.findElement(By.id("keep_logged_in_input")).click();
		}
		
		String myPageTitle = driver.getTitle();
		String myPageUrl = driver.getCurrentUrl();
		String myPageSource =driver.getPageSource();
		
		WebElement checkBoxElement  = driver.findElement(By.id("keep_logged_in_input"));
		
		Thread.sleep(2000);
	
	}

	@AfterMethod
	public void afterMethod() {
		
		//quit() will close all the opened tabs
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}

}
