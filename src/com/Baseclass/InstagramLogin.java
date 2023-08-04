package com.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

public class InstagramLogin extends Baseclass_Insta {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = getBrowser();
		page_open("https://www.instagram.com/");
		geturl();
		title();

		// login
		WebElement email = driver.findElement(By.name("username"));
		sendkey(email, "mahakumar");

		WebElement pass = driver.findElement(By.name("password"));
		sendkey(pass, "maha123k");

		WebElement login_button = driver.findElement(By.xpath("//button[@type='submit']"));
		click(login_button);

		getAttribute(email);
		getAttributeName(email);
		getText(email);
		enabled(pass);
		display(pass);

		// navigate

		navigate("https://letcode.in/test");

		// select

		WebElement radio_button = driver.findElement(By.xpath("//a[@href='/radio']"));
		click(radio_button);

		WebElement select = driver.findElement(By.xpath("//input[@id='yes']"));
		selected(select);

		// alert
		navigate("https://letcode.in/alert");

//		WebElement alert = driver.findElement(By.xpath("//a[@href='/alert']"));
//		click(alert);
		WebElement simple = driver.findElement(By.id("accept"));
		click(simple);
	
		AlertHandle("gettext");
		AlertHandle("ok");
		
		WebElement confirm = driver.findElement(By.id("confirm"));
		click(confirm);
		
		AlertHandle("cancel");
		
//		WebElement confirm_alert = driver.findElement(By.id("confirm"));
//		driver.switchTo().alert().accept();

		back();
		frwd();
		refresh();

		close();

	}
}
