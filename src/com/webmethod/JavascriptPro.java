package com.webmethod;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.*;
import org.openqa.selenium.By;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;

import java.util.*;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class JavascriptPro
{
	public static void main(String[] args)throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		String Windowhandle = driver.getWindowHandle();
		System.out.println(Windowhandle);
		
		driver.findElement(By.id("home")).click();
		Set<String> Windowhandles = driver.getWindowHandles();
	    List<String> listtab = new ArrayList<String>(Windowhandles);
	    driver.switchTo().window(listtab.get(1));
	    
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().window(listtab.get(1));
	    driver.close();
	    
	    driver.switchTo().window(listtab.get(0));
	    driver.findElement(By.id("multi")).click();
	    
	    Set<String> window2 = driver.getWindowHandles();
	    List<String> list2 = new ArrayList<String>(window2);
	    driver.switchTo().window(list2.get(0));
	    System.out.println("1st window title :"+driver.getTitle());
	    
	    driver.switchTo().window(list2.get(1));
	    System.out.println("2nd window title :"+driver.getTitle());
	    
	    driver.switchTo().window(list2.get(2));
	    System.out.println("3rd window title :"+driver.getTitle());  
	    
	    driver.quit();
	    
 }
}


