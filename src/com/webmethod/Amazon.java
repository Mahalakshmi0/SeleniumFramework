package com.webmethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import java.util.*;

public class Amazon 
{
	public static void main(String[] args)throws AWTException, InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");	
	
	WebElement soap = driver.findElement(By.id("twotabsearchtextbox"));
	soap.sendKeys("soap");
	Thread.sleep(1000);	
	    Robot rob = new Robot();
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
        rob.keyPress(KeyEvent.VK_ENTER);
        
    driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("100");
   	driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("300");
 	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
 	
 	driver.findElement(By.xpath("(//a[@target='_blank'])[19]")).click();
       
     String Windowhandle = driver.getWindowHandle();
      System.out.println(Windowhandle);
       
        Set<String> Windowhandles = driver.getWindowHandles();
        List<String> listtab = new ArrayList<String>(Windowhandles);
        driver.switchTo().window(listtab.get(1));
        System.out.println(driver.getCurrentUrl());
        
        
      
      
       driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	
	
     
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,350)","");
//	driver.findElement(By.xpath("(//img[@class='product-image'])[49]")).click();
//	
		
}
}
