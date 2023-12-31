package com.webmethod;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;



public class RobotPro
{
public static void main(String[] args)throws AWTException , InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	
	Actions act = new Actions(driver);
	
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	act.click(search).build().perform();
	rob.keyPress(KeyEvent.VK_P);
	rob.keyRelease(KeyEvent.VK_P);
	Thread.sleep(3000);
	
	
	
	act.dragAndDropBy(search, 50, 60);
	rob.keyPress(KeyEvent.VK_A);
	rob.keyRelease(KeyEvent.VK_A);
	Thread.sleep(3000);
	
	rob.keyPress(KeyEvent.VK_N);
	rob.keyRelease(KeyEvent.VK_N);
	Thread.sleep(3000);
	
	rob.keyPress(KeyEvent.VK_T);
	rob.keyRelease(KeyEvent.VK_T);
	Thread.sleep(3000);
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	
	driver.close();
}
}
