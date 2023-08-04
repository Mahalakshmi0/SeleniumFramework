package com.Selenium_Practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Practice

{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromeselenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/dropdowns");
	
	WebElement fruits = driver.findElement(By.id("fruits"));
	Select s = new Select(fruits);
	s.selectByVisibleText("Banana");
	WebElement fruit_op = driver.findElement(By.xpath("(//p[@class='subtitle'])[1]"));
	System.out.println("option selected in single dropdown :-"+ fruit_op.getText());
	
	WebElement hero = driver.findElement(By.id("superheros"));
	Select s1 = new Select(hero);
	System.out.println(s1.isMultiple());
	
	List<WebElement> options = s1.getOptions();
	for(WebElement opt : options)
	{
		System.out.println("super heros option :-" +opt.getText());
	}
	
	s1.selectByValue("aq");
	s1.selectByValue("bt");
	s1.selectByValue("bw");
	s1.deselectByVisibleText("Batman");
	
	List<WebElement> all_selected = s1.getAllSelectedOptions();
	
	for(WebElement al_s : all_selected)
	{
		System.out.println("all selectd options in heros:- "+al_s.getText());
	}
	
	System.out.println("first selected options :-" +s1.getFirstSelectedOption().getText());
	
	WebElement lang = driver.findElement(By.id("lang"));
	Select s2 = new Select(lang);
	s2.selectByVisibleText("C#");
	
	List<WebElement> lang_options = s2.getOptions();
	for(WebElement lang_opt : lang_options)
	{
		System.out.println("language options :-" +lang_opt.getText());
	}
	
	WebElement country = driver.findElement(By.id("country"));
	Select s3 = new Select(country);
 	s3.selectByValue("India");
 	System.out.println(s3.getFirstSelectedOption().getText());
	
	
	
	
	driver.close();
	
	
	
}
}





