package com.selenium.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;


/* https://www.speaklanguages.com/
 * appUserEmailID=johnnitesh2@gmail.com
   apppassword=Testing@123
   appUserName=nitesh 
   
   TC: Verify login
   1. Launch browser
   2. Launch app
   3. Click on Log in link on the screen
   4. Enter valid email address and password
   5. Click on Log in and verify logged in username
   */

public class SeleniumLocatorsDemo {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {

		// To get root folder and set the driver property as shown below
		String rootPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootPath + "//src//test//resources//chromedriver.exe");

		// Browser is launched
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		// Browser is maximized
		driver.manage().window().maximize();
	}

	@Test
	public void locatorsDemo() throws InterruptedException {
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(4000);
		
		WebElement  logInElement  = driver.findElement(By.id("nav_login"));
		logInElement.click();
		
		WebElement  emailAddressElement  = driver.findElement(By.id("email_input"));
		emailAddressElement.sendKeys("johnnitesh2@gmail.com");
		
		WebElement  paswordElement  = driver.findElement(By.name("password"));
		paswordElement.sendKeys("Testing@123");
		
		WebElement  loginButtonElement  = driver.findElement(By.id("login_button"));
		loginButtonElement.click();
		
		Thread.sleep(5000);
		
		WebElement  userNameElement  = driver.findElement(By.xpath("//li[@id='nav_user']/a"));
		
		String userName  = userNameElement.getText();
		System.out.println(userName);
		
		Thread.sleep(5000);
		
	}

	@AfterMethod
	public void afterMethod() {

		// driver.close() closes only the current window

		// Close all opened browser tabs
		driver.quit();
	}

}
