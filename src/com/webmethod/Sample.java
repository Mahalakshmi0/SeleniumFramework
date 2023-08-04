package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.*;

public class Sample
	{
		public static void main(String[] args)throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");

				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		String titlea = driver.getTitle();
		System.out.println("amazon title :"+titlea);
		Thread.sleep(3000);
		
	    driver.navigate().to("https://www.facebook.com/signup");
	    String s = driver.getTitle();
	    System.out.println("facebooksignup title : "+s);
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    driver.navigate().forward();
	    
	    driver.findElement(By.name("firstname")).sendKeys("Mahalakshmi");
	    driver.findElement(By.name("lastname")).sendKeys("S");
	    driver.findElement(By.name("reg_email__")).sendKeys("mahakumar1999k@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mahakumar1999k@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Maha*0512$");
	    driver.findElement(By.name("birthday_day")).sendKeys("5");
	    driver.findElement(By.name("birthday_month")).sendKeys("Dec");
	    
	    WebElement yr = driver.findElement(By.name("birthday_year"));
	    yr.sendKeys("1999");
	    		
	    driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    }
	}

