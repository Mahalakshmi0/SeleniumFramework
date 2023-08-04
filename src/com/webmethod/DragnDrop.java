package com.webmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop 
{
    public static void main(String[] args)throws InterruptedException
    {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.get("http://www.leafground.com/pages/drop.html");
    WebElement drag = driver.findElement(By.id("draggable"));
    WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
    
    Actions act = new Actions(driver);
    //act.dragAndDrop(drag, drop).build().perform();
    
    //driver.navigate().refresh();
    act.clickAndHold(drag).moveToElement(drop).build().perform();
    
    driver.close();
    }
}
