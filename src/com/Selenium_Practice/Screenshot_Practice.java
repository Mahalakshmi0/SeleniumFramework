package com.Selenium_Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;



public class Screenshot_Practice 
{
	public static void main(String[] args)throws IOException
	{
		

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium New\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/test");
	
	//ss the whole page --> pass driver
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./snap/let.png");
	FileUtils.copyFile(src, dest);
	
	//ss a particular part
	WebElement input = driver.findElement(By.xpath("(//header[@class='card-header'])[1]"));
	TakesScreenshot ts1 = (TakesScreenshot)input;
	File in_src = ts1.getScreenshotAs(OutputType.FILE);
	File in_dest = new File("./snap/letpart.png");
	FileUtils.copyFile(in_src, in_dest);
	
	//ss a text
	WebElement sign = driver.findElement(By.xpath("//a[text()='Sign up']"));
	TakesScreenshot ts2 = (TakesScreenshot)sign;
	File sig_src = ts2.getScreenshotAs(OutputType.FILE);
	File sig_dest = new File("./snap/letsign.png");
	FileUtils.copyFile(sig_src, sig_dest);
}
}