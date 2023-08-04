package com.webmethod;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.*;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.By;

public class Practice
{
	public static void main(String[] args)throws AWTException , InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//a[@class='activeLink']")).click();
		driver.findElement(By.xpath("//img[@alt='Selenium Training in Chennai']")).click();
		
		
		WebElement para = driver.findElement(By.xpath("(//a[@data-toggle='modal'])[30]"));
		para.click();
	    
	Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_A);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//      Thread.sleep(3000);
	
	   Actions act = new Actions(driver);
	   
       act.contextClick().build().perform();
//        
//        rob.keyPress(KeyEvent.VK_DOWN);
//        rob.keyRelease(KeyEvent.VK_DOWN);
//        
//        rob.keyPress(KeyEvent.VK_DOWN);
//        rob.keyRelease(KeyEvent.VK_DOWN);
//		
//        rob.keyPress(KeyEvent.VK_DOWN);
//        rob.keyRelease(KeyEvent.VK_DOWN);
//        
//        rob.keyPress(KeyEvent.VK_ENTER);
//        
	}
}
 
