package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.*;
import org.openqa.selenium.By;
public class Webelement 
{
	public static void main(String[] args) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/web/");
	
	WebElement emailaddress = driver.findElement(By.name("email"));
	emailaddress.sendKeys("mahakumar1999k@gmail.com");
	
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys("123456789");
    Thread.sleep(3000);
    driver.close();
    
    }
}
