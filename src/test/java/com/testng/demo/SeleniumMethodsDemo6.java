package com.testng.demo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class SeleniumMethodsDemo6 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		//To disable browser popups
		//chromeOptions.addArguments("--disable-notifications");
	
		driver = new ChromeDriver(chromeOptions); 
		
		//To maximize browser, use below code
		driver.manage().window().maximize();
		System.out.println("browser opened and app is launched befre running TC");
	}

	@Test
	public void launchApp() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
	
		Thread.sleep(4000);
		
		alert.dismiss(); //To cancel the Alert box
		Thread.sleep(4000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		
		alert = driver.switchTo().alert();
		
		alert.accept(); //It clicks on OK button on the alert box that is opened
		
		Thread.sleep(4000);
	}

	@AfterMethod
	public void afterMethod() {
		//quit() will close all the opened tabs
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}

}
