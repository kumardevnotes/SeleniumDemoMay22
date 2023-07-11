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

public class SeleniumMethodsDemo1 {

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
		Thread.sleep(2000);
		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		
		//To launch a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.manage().deleteAllCookies();
		driver.get("https://www.browserstack.com/");
		Thread.sleep(2000);
		
		Dimension myDimensionObj  = new Dimension(420,720);
		driver.manage().window().setSize(myDimensionObj);
		Thread.sleep(5000);
		
		boolean isDisplayed  = driver.findElement(By.id("'primary-menu-toggle")).isDisplayed();
		System.out.println(isDisplayed);
		
		Thread.sleep(5000);
		
		//close() closes the current tab of the selenium script
		driver.close();
		
		
	}

	@AfterMethod
	public void afterMethod() {
		
		//quit() will close all the opened tabs
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}

}
