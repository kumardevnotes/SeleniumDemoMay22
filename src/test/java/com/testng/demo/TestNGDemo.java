package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class TestNGDemo {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("browser opened and app is launched befre running TC");
	}

	@Test
	public void launchSpeakLang() throws InterruptedException {
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
	
		driver.get("https://speaklanguages.com/");
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void launchRediffEmail() throws InterruptedException {
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
				Thread.sleep(1000); // 3000ms = 3s

				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				 driver.quit();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("browser closed and app also closed after running TC");
	}

}
