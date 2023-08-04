package com.Selenium_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Practice 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium New\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/windows");
	
	driver.findElement(By.id("multi")).click();
	String w = driver.getWindowHandle();

	
	Set<String> windowhandles = driver.getWindowHandles();
//	for (String wh : windowhandles)
//	{
//	driver.switchTo().window(wh);
//	System.out.println(driver.getTitle());
//	}
	List<String> wh = new ArrayList<String>(windowhandles);
	driver.switchTo().window(wh.get(1));
	{
		System.out.println("currently opened tabs: "+wh);
		System.out.println(driver.getCurrentUrl());
	}
	
	driver.switchTo().window(wh.get(0));
	driver.close();
	
	Set<String> windowhandles2 = driver.getWindowHandles();
	
	
}
}




