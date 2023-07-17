package com.testng.demo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class SeleniumMethodsDemo8 {

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
	public void launchAppinTabs() throws InterruptedException, IOException {
		driver.get("https://www.speaklanguages.com/");
		String window1 = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String window2 = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().window(window1);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(window2);
		//driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window : allWindows) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			String pageTile = driver.getTitle();
			captureScreenshot(pageTile);
		}
	}
	
	@Test
	public void launchAppinWindows() throws InterruptedException {
		driver.get("https://www.speaklanguages.com/");
		String window1 = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String window2 = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().window(window1);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(window2);
		//driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window : allWindows) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
	}

	@AfterMethod
	public void afterMethod() {
		//quit() will close all the opened tabs
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}
	
	private void captureScreenshot(String screenShotName) throws IOException {
	
		String rootPath  =  System.getProperty("user.dir");
		
		//Call getScreenshotAs method to create image file
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//create a destination path
		File dest=new File(rootPath+"//Screenshots/"+screenShotName+".png");
		
		//Copying from source to destination path
		FileHandler.copy(src, dest);
	}

}
