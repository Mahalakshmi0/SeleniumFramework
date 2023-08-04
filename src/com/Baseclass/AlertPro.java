package com.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPro extends AlertProBase
{
public static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException 
	{
		driver = getBrowser();
		page_open("https://letcode.in/alert");
		 
		WebElement simple = driver.findElement(By.id("accept"));
		click(simple);
	
		AlertHandle("gettext");
		AlertHandle("ok");
		
		WebElement confirm = driver.findElement(By.id("confirm"));
		click(confirm);
		
		AlertHandle("cancel");
		
		close();
		
  }
}
