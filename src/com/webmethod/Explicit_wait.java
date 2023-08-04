package com.webmethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import java.util.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement; 
//import org.openqa.selenium.


public class Explicit_wait 
{
public static void main(String[] args)
{
	ExplicitWwait();
}

public static void ExplicitWwait()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.findElement(By.id("email")).sendKeys("mahakumar1999k@gmail.com");
	 
	 WebDriverWait emailbtn = new WebDriverWait(driver , 10);
	 emailbtn.until(ExpectedConditions.elementToBeClickable(By.id("email")));
	 
	 
	 
}
}
