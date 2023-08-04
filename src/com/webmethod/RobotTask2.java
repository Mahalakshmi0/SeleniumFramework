//package com.webmethod;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import org.openqa.*;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.awt.AWTException;
//import org.openqa.selenium.interactions.Actions;
//
//public class RobotTask2
//{
//	public static void main(String[] args)throws AWTException , InterruptedException
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
//		driver.manage().window().maximize();
//		
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_S);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//	
//		
//		
////		driver.findElement(By.xpath("//a[@class='activeLink']")).click();
////		WebElement sel = driver.findElement(By.xpath("//img[@alt='Selenium Training in Chennai']"));
////		
////		Actions act = new Actions(driver);
////		act.click(sel).build().perform();
////		
////		WebElement jav = driver.findElement(By.xpath("//a[@data-target='#corejava-test-paper-2']"));
////		act.doubleClick(jav).build().perform();
////		
////		 driver.findElement(By.xpath("(//button[@class='close'])[159]")).click();
//////         act.click(clos).build().perform();
//		
//	}
//	
//}
//
//
//

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

public class RobotTask2
{
	public static void main(String[] args)throws AWTException , InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//a[@class='activeLink']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Selenium Training in Chennai']")).click();
		Thread.sleep(3000);
		
		
		WebElement para = driver.findElement(By.xpath("(//a[@data-toggle='modal'])[30]"));
		para.click();
	    
     	Robot rob = new Robot();
     	
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_A);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(3000);
     	
		
		Actions act = new Actions(driver);
		
		act.doubleClick().click().build().perform();
        act.contextClick().build().perform();
        
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
		
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_ENTER);
        
	}
}

