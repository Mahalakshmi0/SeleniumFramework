package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Csign%20up%20for%20facebook%7C&placement=&creative=589460569891&keyword=sign%20up%20for%20facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-9881758786%26loc_physical_ms%3D9301566%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwv-GUBhAzEiwASUMm4jTxReKmsqX4JCzmxfiei84TyV_2xeBxaQcbTtD5P-7DbkpG3V9pGxoCHUQQAvD_BwE");

		//		WebElement a= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//        Select s = new Select(a);
		//        s.selectByIndex(3);
		//        Thread.sleep(1000);
		//        //Interview Series: Weekly Contests
		//        
		//   
		//        s.selectByValue("5");
		//        Thread.sleep(1000);
		//        
		//        WebElement m= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//        Select s1 = new Select(m);
		//        s1.selectByValue("12");
		//        Thread.sleep(1000);
		//        
		//        WebElement yr= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		//        Select s2 = new Select(yr);
		//        s2.selectByValue("1999");
		//        Thread.sleep(1000);

		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement b = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s3=new Select(b);
		s3.selectByValue("opel");
		Thread.sleep(1000);

		s3.selectByIndex(1);

		s3.selectByVisibleText("Saab");

		WebElement cr = s3.getFirstSelectedOption();
		System.out.println(cr.getText());

		s3.deselectByValue("saab");
		Thread.sleep(1000);

	}

}
