package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.*;

public class Webdriver 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("amazon title page : "+title);
		Thread.sleep(3000);
		
		String currurl = driver.getCurrentUrl();
		System.out.println("current url : "+currurl);
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.swiggy.com/");
		String title2 = driver.getTitle();
		System.out.println("swiggy title page : "+title2);
		Thread.sleep(3000);
		
		driver.navigate().back();
		String title3 = driver.getTitle();
		System.out.println("amazon title page : "+title3);
		Thread.sleep(3000);
		
		driver.navigate().forward();
		String title4 = driver.getTitle();
		System.out.println("swiggy title page : "+title4);
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.w3schools.com/");
		driver.manage().window().maximize();
		String title5 = driver.getTitle();
		
		System.out.println("w3 schools title page : "+title5);
		Thread.sleep(3000);
		
		driver.navigate().back();
		String title6 = driver.getTitle();
		System.out.println("swiggy title page : "+title6);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		String title7 = driver.getTitle();
		System.out.println("w3 schools title page : "+title7);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		driver.close();
		
	}
		
	
}
