package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AlertPro
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
        driver.switchTo().alert().sendKeys("TestLeaf");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
}
