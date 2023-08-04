package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.io.*;
import java.io.File;
import org.openqa.selenium.OutputType;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot 
{
	public static void main(String[] args)throws AWTException, InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File src= ts.getScreenshotAs(OutputType.FILE);
       File dest = new File("./snap/img.png");
       FileHandler.copy(src, dest);
       
       
       
       
    }
	
}
