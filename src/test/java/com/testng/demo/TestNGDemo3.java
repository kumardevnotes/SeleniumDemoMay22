package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class TestNGDemo3 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		// to get rootPath
		String rootPath = System.getProperty("user.dir");
		// C:\Users\DELL\Documents\May22nd Data\repos\SeleniumDemoMay22
		System.setProperty("webdriver.chrome.driver", rootPath + "//src//test//resources//chromedriver.exe");

		// Browser is launched
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		// to maximize browser
		driver.manage().window().maximize();
		System.out.println("browser opened and maximized");
	}

	@Test
	public void launchMyApp() throws InterruptedException {
		driver.get("https://www.speaklanguages.com/");
		
		WebElement LogInElement = driver.findElement(By.xpath("//a[.='Log in']"));
		LogInElement.click();
		Thread.sleep(3000);//3seconds
		driver.navigate().back();
		
		
		WebElement SignUpElement = driver.findElement(By.xpath("//a[.='Sign up']"));
		SignUpElement.click();
		Thread.sleep(3000);//3seconds
		driver.navigate().back();
		
		WebElement phraseGuidesElement = driver.findElement(By.xpath("//p[contains(text(),'Phrase guides')]"));
		System.out.println(phraseGuidesElement.getText());
		
		WebElement searchFieldElement = driver.findElement(By.xpath("//input[@name='q']"));
		searchFieldElement.sendKeys("spanish");
		Thread.sleep(3000);//3seconds
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("browser closed");
	}

}
