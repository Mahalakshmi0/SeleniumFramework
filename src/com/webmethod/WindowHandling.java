package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.*;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import java.util.*;

public class WindowHandling 
{
	public static void main(String[] args)throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium New\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");

		//to get parent window
		String windowhandle = driver.getWindowHandle();
		System.out.println("parent window :"+ windowhandle);
		System.out.println(driver.getCurrentUrl());

		//to get ids of all the tab:
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Set<String> windowhandles= driver.getWindowHandles();
		
		System.out.println("all the opened tab id's :"+ windowhandles);

		//to get url of a tab
//		List<String> listtab = new ArrayList<String>(windowhandles);
//		driver.switchTo().window(listtab.get(1)); 
//		System.out.println(driver.getCurrentUrl());

//		  for(String wh : windowhandles)
//		  { 
//		   driver.switchTo().window(wh.get(0));
//		    System.out.println("all opened windows" +driver.getCurrentUrl());
//		  }

		
		//close the parent tab:
//		driver.switchTo().window(listtab.get(0));
//		driver.close();
//
//		Set<String> windowhandles2 = driver.getWindowHandles();
//		System.out.println(windowhandles2);
//		listtab.clear();
//		listtab.addAll(windowhandles2);
//		driver.switchTo().window(listtab.get(0));
//		System.out.println(driver.getCurrentUrl());
       	}
}
