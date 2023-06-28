package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;

public class TestNGDemo {

	WebDriver driver = null;

	@Parameters({ "browser" })
	@BeforeMethod (alwaysRun = true)
	public void beforeMethod(String browser) {

		String rootPath = System.getProperty("user.dir");
		switch (browser) {

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", rootPath + "//src//test//resources//chromedriver.exe");
			// Browser is launched
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			break;

		case "Edge":
			System.setProperty("webdriver.edge.driver", rootPath + "//src//test//resources//msedgedriver.exe");

			// Browser is launched
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(edgeOptions);
			break;
			
			default:
				System.out.println("Please pass a valid browser name");
		}

		// to maximize browser
		driver.manage().window().maximize();
		System.out.println("browser opened and app is launched befre running TC");
	}

	@Test(groups = {"Smoke"} )
	public void launchSpeakLangI() throws InterruptedException {
		driver.get("https://speaklanguages.com/");
		Thread.sleep(5000);
	}

	@Test (groups = {"Smoke"} )
	public void launchRediffEmailI() throws InterruptedException {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
	}

	@AfterMethod  (alwaysRun = true)
	public void afterMethod() {
		driver.quit();
		System.out.println("browser closed and app also closed after running TC");
	}

}
