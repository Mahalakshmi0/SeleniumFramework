package com.Selenium_Practice;

import org.openqa.selenium.chrome.*;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable_Practice
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium New\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://letcode.in/table");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
    WebElement table = driver.findElement(By.id("simpletable"));
    
    // Print the header (column heading)
    List<WebElement> table_head = table.findElements(By.xpath("//table[@id ='simpletable']/thead/tr"));
    for(WebElement header : table_head)
    {
    	System.out.println("Table headers : "+header.getText());
    }
    
    //size of the row with datas 
    List<WebElement> allrow = table.findElements(By.cssSelector("tbody tr"));
    int size = allrow.size();
    System.out.println("row size : "+size);
    
    	for(WebElement row : allrow)
    	{
    		List<WebElement> column = row.findElements(By.tagName("td"));
    		WebElement second_col = column.get(1);
    		System.out.println("First Name : "+second_col.getText());
    		if(second_col.getText().equalsIgnoreCase("raj"));
    		{
    			WebElement check = driver.findElement(By.xpath("//input[@id='second']"));
    			check.click();
    			System.out.println("raj checkbox selected :"+check.isSelected());
    			break;
    		}
    	}
    	
    	//navigate to other table
    	//add the first column 
          List<WebElement> all_col = driver.findElements(By.xpath("(//table)[3]/tr/td[2]"));
          
         int sum=0;
        for(int j=0; j <all_col.size();j++)
        {
             WebElement s_col = all_col.get(j);
             String text = s_col.getText();
             System.out.println(text);
              sum = sum+Integer.parseInt(text);
         }
        System.out.println("Total Calories :"+sum);
        
        
        
        //navigate to other table
        //add the first row 
       List<WebElement> shop = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[2]"));
       for(int i =0;i<shop.size();i++)
       {
    	  String text1 = shop.get(i).getText();
    	  System.out.println("shopping table"+text1);
       }
    // first column datas
   // int sum =0;
//     List<WebElement> first_col= table.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[1]"));
//     for(int i =0;i<first_col.size();i++)
//     {
//    	 System.out.println("datas in first column : "+first_col.get(i).getText());
//     }
    
    
    
    
}
}