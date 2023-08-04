package com.webmethod;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.*;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Iphone {
	public static void main(String[] args)throws AWTException, InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");	
	
	WebElement soap = driver.findElement(By.id("twotabsearchtextbox"));
	soap.sendKeys("iphone x");
	Thread.sleep(1000);	
	Robot rob = new Robot();
	 rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
    rob.keyPress(KeyEvent.VK_ENTER);
    
    driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
    driver.findElement(By.id("add-to-cart-buttons")).click();
    
    
    
    
    
    
}
}