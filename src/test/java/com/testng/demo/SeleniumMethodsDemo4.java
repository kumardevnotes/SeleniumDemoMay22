package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
public class SeleniumMethodsDemo4 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		String rootPath = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", rootPath + "//src//test//resources//msedgedriver.exe");
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--remote-allow-origins=*");
		
		//To disable browser popups
		edgeOptions.addArguments("--disable-notifications");
		driver = new EdgeDriver(edgeOptions);
		
		//To maximize browser, use below code
		driver.manage().window().maximize();
		System.out.println("browser opened and app is launched befre running TC");
	}

	@Test
	public void launchApp() throws InterruptedException {
		
		//To launch the app in the browser which is opened in above beforeMethod(), we use below get()
		driver.get("https://speaklanguages.com/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scrldown by 350p
		js.executeScript("window.scrollBy(0,350)", "");
		
		
		Thread.sleep(6000);
	
      //scroll up by 350p
		js.executeScript("window.scrollBy(0,0)", "");
		
		
		//Scroll to vew the element
		WebElement privacyPolicyElement = driver.findElement(By.linkText("Privacy policy"));
		js.executeScript("arguments[0].scrollIntoView();", privacyPolicyElement);
		
		
	
	}

	@AfterMethod
	public void afterMethod() {
		
		//quit() will close all the opened tabs
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}

}
