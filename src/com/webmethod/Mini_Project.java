package com.webmethod;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;



public class Mini_Project 
{
public static void main(String[] args)throws InterruptedException, AWTException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    //sign in
    driver.findElement(By.xpath("//a[@class='login']")).click();
 
    //create account
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,350)","");
  
    driver.findElement(By.name("email_create")).sendKeys("mahakumar19@gmail.com");
    driver.findElement(By.id("SubmitCreate")).click();
    
   //registration
    driver.findElement(By.id("id_gender1")).click();
    
    
    driver.findElement(By.id("customer_firstname")).sendKeys("Mahalakshmi");
    driver.findElement(By.id("customer_lastname")).sendKeys("S");
    driver.findElement(By.id("passwd")).sendKeys("Maha*0512$");
    
    //birthday
     WebElement birthdate = driver.findElement(By.id("days"));
     Select s = new Select(birthdate);
     s.selectByValue("5");
     
     WebElement birthmonth = driver.findElement(By.id("months"));
     Select s1 = new Select(birthmonth);
     s1.selectByValue("12");
      
     WebElement birthyear = driver.findElement(By.id("years"));
     Select s2 = new Select(birthyear);
     s2.selectByValue("1999");
    
     driver.findElement(By.id("optin")).click();
     driver.findElement(By.id("address1")).sendKeys("85/B");
     driver.findElement(By.id("address2")).sendKeys("New Jail Road");
     driver.findElement(By.id("city")).sendKeys("Madurai");
     
     WebElement state = driver.findElement(By.name("id_state"));
     Select s3 = new Select(state);
     s3.selectByVisibleText("Massachusetts");
     
     driver.findElement(By.id("postcode")).sendKeys("62501");
    
     WebElement country = driver.findElement(By.id("id_country"));
     Select s4= new Select(country);
     s4.selectByValue("21");
     
     driver.findElement(By.id("phone_mobile")).sendKeys("9597851818");
     driver.findElement(By.name("alias")).sendKeys("85b,njr");
     		
     driver.findElement(By.id("submitAccount")).click();
     
     //signout
     driver.findElement(By.xpath("//a[@class='logout']")).click();
     
     
     driver.findElement(By.id("email")).sendKeys("mahakumar19@gmail.com");
     driver.findElement(By.id("passwd")).sendKeys("Maha*0512$");
     driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
     
     
     
    
   
   
   
   
}
}
