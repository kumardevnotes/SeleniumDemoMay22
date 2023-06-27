package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;

public class TestNGDemo2 {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		// to get rootPath
		String rootPath = System.getProperty("user.dir");
		// C:\Users\DELL\Documents\May22nd Data\repos\SeleniumDemoMay22
		System.setProperty("webdriver.edge.driver", rootPath + "//src//test//resources//msedgedriver.exe");

		// Browser is launched
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);

		// to maximize browser
		driver.manage().window().maximize();
		System.out.println("browser opened and app is launched befre running TC");
	}

	@Test
	public void launchSpeakLangII() throws InterruptedException {
		driver.get("https://speaklanguages.com/");
		Thread.sleep(5000);
	}

	@Test
	public void launchRediffEmailII() throws InterruptedException {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}

}
