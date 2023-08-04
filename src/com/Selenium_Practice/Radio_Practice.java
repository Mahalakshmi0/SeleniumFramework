package com.Selenium_Practice;

	import java.io.File;
import java.io.IOException;
import java.util.List;
	import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Radio_Practice 
	{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium New\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		WebElement one = driver.findElement(By.id("one"));
		WebElement two = driver.findElement(By.id("two"));
		one.click();
		System.out.println("has yes been selected: "+ one.isSelected());
		System.out.println("has no been selected: "+ two.isSelected());
		
		two.click();
		
		System.out.println("has yes been selected: "+ one.isSelected());
		System.out.println("has no been selected: "+ two.isSelected());
		
		
		
		
		
		
		driver.close();
		
		
		
}
}
	