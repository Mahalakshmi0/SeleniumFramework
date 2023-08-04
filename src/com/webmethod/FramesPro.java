package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.*;
import org.openqa.selenium.support.ui.Select;

public class FramesPro 
{

	public static void main(String[] args)throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[@id='Click']")).click();
	driver.switchTo().defaultContent();
	
	
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.html']")));
	driver.switchTo().frame("frame2");
	driver.findElement(By.xpath("//button[@id='Click1']")).click();
	
	driver.close();
	}
}
