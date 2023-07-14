package com.testng.demo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
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

public class SeleniumMethodsDemo5 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		//To disable browser popups
		chromeOptions.addArguments("--disable-notifications");
	
		driver = new ChromeDriver(chromeOptions); 
		
		//To maximize browser, use below code
		driver.manage().window().maximize();
		System.out.println("browser opened and app is launched befre running TC");
	}

	@Test
	public void launchApp() throws InterruptedException {
		driver.get("https://speaklanguages.com/");
		
		Thread.sleep(2000);
		
		WebElement myLangElement  = driver.findElement(By.id("language_menu"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", myLangElement);
	
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(myLangElement).build().perform();
		
		 //Drag and Drop using selenium's Action's class
		/*WebElement srcElement  = driver.findElement(By.id("language_menu"));
		WebElement targetElement  = driver.findElement(By.id("language_menu"));
				
				action.dragAndDrop(srcElement, targetElement).build().perform();*/
		
		Thread.sleep(6000);
	}

	@AfterMethod
	public void afterMethod() {
		//quit() will close all the opened tabs
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}

}
