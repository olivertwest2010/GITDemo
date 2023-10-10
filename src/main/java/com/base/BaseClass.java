package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class BaseClass {
	public WebDriver driver;
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumWebdriverNew\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		//System.setProperty("web.driver.chrome", "E:\\SeleniumWebdriverNew\\chromedriver-win64\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	//@AfterMethod
	//public void tearDown() {
		//driver.quit();
	//}
	
	@DataProvider(name="LoginTestData")
	public Object[][] getData() {
		
		// creating 2 data sets
		Object[][] data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="admin";
		data[1][1]="Admin123";
		
		data[2][0]="Admin";
		data[2][1]="admin123";
		
		return data;
		 }
	

}
