package com.Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import org.openqa.*;
import org.openqa.selenium.support.ui.Select;

public class Frames_Practice 
{

	public static void main(String[] args)throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.switchTo().frame("iframeResult");
	 WebElement name = driver.findElement(By.xpath("//button[text()='Try it']"));
	 name.click();
	 
	  Alert alert = driver.switchTo().alert();
	  System.out.println(alert.getText());
	  alert.sendKeys("maha");
	  alert.accept();
	 System.out.println(driver.findElement(By.id("demo")).getText());
	 
	 
	 driver.navigate().to("https://letcode.in/frame");
	 
	 driver.switchTo().frame("firstFr");
	 driver.findElement(By.name("fname")).sendKeys("mah");
     driver.findElement(By.name("lname")).sendKeys("Lakshmi");
	 System.out.println(driver.findElement(By.xpath("//p[@class='title has-text-info']")).getText());
	
	 //inner frame
	 WebElement inner = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
	 driver.switchTo().frame(inner);
	 driver.findElement(By.name("email")).sendKeys("Mahakumar@gmail.com");
	 
//	 back to parent frame
	 driver.switchTo().parentFrame();
	 driver.findElement(By.name("fname")).sendKeys("maha");
    
//	 come out of all the frame
	 driver.switchTo().defaultContent();
	 System.out.println(driver.findElement(By.xpath("//p[text()=' Insight ']")).getText());
	 
//     driver.close();
     
    
     
	
	}
}
