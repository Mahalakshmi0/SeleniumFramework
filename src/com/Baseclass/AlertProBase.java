package com.Baseclass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class AlertProBase 
{
	public static WebDriver driver;

	public static WebDriver getBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(driver , 20);
		return driver;

	}

	public static void page_open(String url)
	{
		driver.get(url);
	}

	public static void AlertHandle(String options)
	{
		 
	Alert alert = driver.switchTo().alert();
		if(options.equalsIgnoreCase("ok"))
		{
			alert.accept();
			
			
		}
		else if(options.equalsIgnoreCase("cancel"))
		{
		     alert.dismiss();
		}
		else if(options.equalsIgnoreCase("gettext"))
		{
			String text = alert.getText();
			System.out.println(text);
		}
	}

	public static void click(WebElement element)
	{
		element.click();
	}
	public static void close()
	{
		driver.close();
	}

}

