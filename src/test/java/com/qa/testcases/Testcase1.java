package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Testcase1{
	
	//test NG annotations to execute our test script
	
	//Test methods
	
	@Test(priority=1)
	public void searchPage() throws InterruptedException {
		
		//add the below code in the Testcase1.java file inside the searchPage() method

		System.setProperty("webdriver.chrome.driver", "/home/ec2-user/chromedriver"); 
		
		//provide the chromedriver path accordingly

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//2. enter the app URL
		
		driver.get("http://13.59.29.251:8888/");
		
		//3. find element on the web page
		
		//XPATH = //tagname[@attribute='value'] //
		
		System.out.println("got driver");
		
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
		
		System.setProperty("webdriver.chrome.driver", "/home/ec2-user/chromedriver"); 
		
		//provide the chromedriver path accordingly

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.close();
	}
	
}
