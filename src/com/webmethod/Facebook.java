package com.webmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Facebook 
{
	public static WebDriver driver;

	public static void getBrowser()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	public static void get(String url)
	{
		driver.get(url);
	}

	public static void get_url()
	{
		System.out.println(driver.getCurrentUrl());

	}
	public static void get_Title()
	{
		System.out.println(driver.getTitle());

	}
	public static void get_Text(WebElement element)
	{
		//String Text = element.getText();
		System.out.println(element.getText());
	}

	//navigate methods

	public static void Navigate(String url)
	{
		driver.navigate().to(url);
	}
	public static void Back()
	{
		driver.navigate().back();
	}
	public static void Forward()
	{
		driver.navigate().forward();
	}
	public static void Refresh()
	{
		driver.navigate().refresh();
	}

	// sendKeys

	public static void sendk(WebElement email , String value)
	{
		email.sendKeys(value);
	}

	//




	public static void close_browser()
	{
		driver.close();
	}
}
