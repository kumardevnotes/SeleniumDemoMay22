package com.selenium.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class SeleniumLocatorsDemo2 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {

		// To get root folder and set the driver property as shown below
		String rootPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootPath + "//src//test//resources//chromedriver.exe");

		// Browser is launched
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		// Browser is maximized
		driver.manage().window().maximize();
	}

	@Test
	public void locatorsDemo() throws InterruptedException {
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(4000);
		
		WebElement headerElement = driver.findElement(By.className("search_visible_header"));
		boolean isDisplayed  = headerElement.isDisplayed();
		System.out.println("headerDispplayed ? "+ isDisplayed);
		
		WebElement  logInElement  = driver.findElement(By.partialLinkText("Log in"));
		boolean isLogInTextDisplayed  = logInElement.isDisplayed();
		System.out.println("login link displayed ? "+ isLogInTextDisplayed);
		
		WebElement  signUpElement  = driver.findElement(By.linkText("Sign up"));
		boolean isSignupTextDisplayed  = signUpElement.isDisplayed();
		System.out.println("signUp link displayed ? "+ isSignupTextDisplayed);
		
		//WebElement  imageElement  = driver.findElement(By.tagName("img"));
	
		Thread.sleep(5000);
		
	}

	@AfterMethod
	public void afterMethod() {

		// driver.close() closes only the current window

		// Close all opened browser tabs
		driver.quit();
	}

}
