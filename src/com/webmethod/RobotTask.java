package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class RobotTask
{
	public static void main(String[] args)throws AWTException , InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium New\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Robot rob = new Robot();
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("mahakumar");
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		 
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
	
		
	//	driver.findElement(By.xpath("//button[@value='1']")).click();
		//driver.close();
}
}