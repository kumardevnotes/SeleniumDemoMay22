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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class SeleniumMethodsDemo9 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
	
		driver = new ChromeDriver(chromeOptions); 
		
		//To maximize browser, use below code
		driver.manage().window().maximize();
		System.out.println("browser opened and app is launched befre running TC");
	}

	@Test
	public void signUpintoApp() throws InterruptedException, IOException {
		
		driver.get("https://www.speaklanguages.com/");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("John");
		
		driver.findElement(By.name("last_name")).sendKeys("Legend");
		
		driver.findElement(By.name("email")).sendKeys("test11221257@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Training1122");
		
		Thread.sleep(5000);
		
		//Need to select drop downs - ToDo
		
		WebElement genderWebElement  = driver.findElement(By.name("sex"));
		Select genderDD =  new Select(genderWebElement);
		
		/*genderDD.selectByIndex(2); //Female
		Thread.sleep(3000);
		genderDD.selectByIndex(1); //Male
		Thread.sleep(3000); */
		
		/*genderDD.selectByValue("Female");//Female
		Thread.sleep(3000);
		genderDD.selectByValue("Male"); //Male */
		
		genderDD.selectByVisibleText("Female"); //Female
		Thread.sleep(3000);
		genderDD.selectByVisibleText("Male"); //Male
		Thread.sleep(3000);
		
		WebElement dayWebElement  = driver.findElement(By.name("dob_day"));
		Select dayDD =  new Select(dayWebElement);
		dayDD.selectByVisibleText("10");
		
		WebElement monthWebElement  = driver.findElement(By.name("dob_month"));
		Select monthDD =  new Select(monthWebElement);
		monthDD.selectByVisibleText("April");
		
		WebElement yearWebElement  = driver.findElement(By.name("dob_year"));
		Select yearDD =  new Select(yearWebElement);
		yearDD.selectByVisibleText("1996");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();
		
		Thread.sleep(8000);
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		//quit() will close all the opened tabs
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}
	

}
