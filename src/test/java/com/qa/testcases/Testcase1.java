package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	
	public static WebDriver driver;
	
	//test NG annotations to execute our test script
	
	//Test methods
	
	@Test(priority=1)
	public void searchPage() throws InterruptedException {
		
		// 1. Open chrome browser
		
		
		driver = new ChromeDriver();
		
		//2. enter the app URL
		
		driver.get("http://18.191.177.45:8888/");
		
		//3. find element on the web page
		
		//XPATH = //tagname[@attribute='value'] //
		
		driver.findElement(By.xpath("//div[@id='about']"));
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("existing bug reports")).click();
				
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Code")).click();
		
	}
    
	@Test(priority=2)
	public void closeBrowser() {
		
		driver.close();
	}
	
}
