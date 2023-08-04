package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.*;
import org.openqa.selenium.By;

public class Xpath
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Csign%20up%20for%20facebook%7C&placement=&creative=589460569891&keyword=sign%20up%20for%20facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-9881758786%26loc_physical_ms%3D9301566%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwv-GUBhAzEiwASUMm4jTxReKmsqX4JCzmxfiei84TyV_2xeBxaQcbTtD5P-7DbkpG3V9pGxoCHUQQAvD_BwE");
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Mahalakshmi");
	    driver.findElement(By.name("lastname")).sendKeys("S");
	    driver.findElement(By.name("reg_email__")).sendKeys("mahakumar1999k@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mahakumar1999k@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Maha123kk");
	    
	    driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("5");
	    driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Dec");
	    driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1999");
	    
	    driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
	    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	    
	  
	}

}
