package com.Baseclass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.Alert;
public class PracticeBase 
{
	
	public static WebDriver driver;

	public static WebDriver getBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		//	WebDriverWait wait = new WebDriverWait(driver , 20);
		return driver;
	}
	public static void page_open(String url)
	{
		driver.get(url);
	}
	public static void sendkey(WebElement element , String value)
	{
		element.sendKeys(value);
	}
	public static void click(WebElement element)
	{
		element.click();
	}
	
}



