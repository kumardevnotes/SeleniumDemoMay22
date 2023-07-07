package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 
		 * Testcase: 1. Launch browser and maximize it 
		 * 2. Launch app1 
		 * 3. launch new tab
		 * 4. launch app2 
		 * 5.launch new tab 
		 * 6. launch app3 
		 * 7. close app3 
		 * 8.close app1 & app2
		 */

		// to get rootPath
		String rootPath = System.getProperty("user.dir");
		// C:\Users\DELL\Documents\May22nd Data\repos\SeleniumDemoMay22
		System.setProperty("webdriver.chrome.driver", rootPath + "//src//test//resources//chromedriver.exe");

		// Browser is launched
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		//to maximize browser
		driver.manage().window().maximize();
		Thread.sleep(3000); // 3000ms = 3s

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);

		// Trying to launch a new tab and switching into it
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://speaklanguages.com/");
		Thread.sleep(2000);

		// Trying to launch a new tab again and switching into it
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);

		// Close() will close the current tab only
		driver.close();

		Thread.sleep(2000);

		// quit() will close all opened tabs
		driver.quit();

	}

}
