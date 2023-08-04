package com.webmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_main extends Facebook
{
	public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException
	{
		driver = new ChromeDriver();
		 getBrowser();
		get("https://www.facebook.com/");
		get_url();
		get_Title();
		Thread.sleep(3000);
//		WebElement em = driver.findElement(By.id("email"));
//		get_Text(em);
//		
		Navigate("https://www.amazon.in/");
		Back();
        Forward();	
        Back();
        Refresh();
		WebElement email= driver.findElement(By.id("email"));
		sendk(email, "mahakumar1999k@gmail.com");
	    
		WebElement password = driver.findElement(By.id("pass"));
		sendk(password , "Maha123");
		close_browser();
	}
	
}
