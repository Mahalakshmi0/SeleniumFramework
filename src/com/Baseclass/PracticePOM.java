package com.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import com.webmethod.Login_Page;

public class PracticePOM extends PracticeBase
{

public static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException 
	{
		driver = getBrowser();
		page_open("https://www.facebook.com/login/");
		//Login_Page lp = new Login_Page(driver);
		//click(lp.getLogin_button());
		
		
		
		WebElement email = driver.findElement(By.id("email"));
		//sendkey(com.
		click(email);
//		
//		WebElement password = driver.findElement(By.id("pass"));
//		sendkey(password , "maha123kk");
//		click(password);
//		
//		WebElement login_button= driver.findElement(By.id("loginbutton"));
//		click(login_button);
		
	}
	
}
