package com.testcases;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.base.BaseClass;

public class DataDrivenTest extends BaseClass {
	
	
	@Test(dataProvider="LoginTestData")
	public void loginTest(String uname, String pword) {
		
		//page elements
		driver.findElement(By.name("username")).sendKeys("uname");
		driver.findElement(By.name("password")).sendKeys("pword");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//Assertions
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actualURL, expectedURL);

	}

}
