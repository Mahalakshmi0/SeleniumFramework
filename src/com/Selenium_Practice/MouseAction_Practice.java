package com.Selenium_Practice;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetElementLocation;

public class MouseAction_Practice
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium New\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	
	WebElement fram = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(fram);
	
	//drag and drop
	
	Actions act = new Actions(driver);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	act.dragAndDrop(drag, drop).build().perform();
	
	//alternative method
    //act.clickAndHold(drag).moveToElement(drop).perform();
	
	//drag and drop by
	
	
	driver.navigate().to("https://jqueryui.com/draggable/");
	driver.switchTo().frame(0);
	WebElement dragBy = driver.findElement(By.xpath("//p[text()='Drag me around']"));
	
	
	int x = dragBy.getLocation().getX();
	int y = dragBy.getLocation().getY();
	act.dragAndDropBy(dragBy, x+30, y+90).perform();
	 
	//click and hold 
    driver.navigate().to("https://jqueryui.com/resizable/");
    WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
    driver.switchTo().frame(frame1);
	WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
	
	act.clickAndHold(resize).moveByOffset(50 ,70).perform();
	
	// selectable
	
	driver.navigate().to("https://jqueryui.com/selectable/");
	driver.switchTo().frame(0);
     List<WebElement> options = driver.findElements(By.cssSelector("ol#selectable *"));
     
    	 for(WebElement opt : options)
    	 {
    		 System.out.println(opt.getText());
    	 } 
      WebElement one = options.get(0);
      WebElement two = options.get(2);
      
      act.click().clickAndHold(one).clickAndHold(two).release().build().perform();
      
    //sortable 
      driver.navigate().to("https://jqueryui.com/sortable/");
      driver.switchTo().frame(0);
      WebElement i2 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
      act.clickAndHold(i2).moveByOffset(90,90).release().perform();      
     
	
	
}
}
