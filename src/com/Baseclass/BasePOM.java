package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.lang.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BasePOM 

{

	public static WebDriver driver;

	public static WebDriver getBrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromeselenium\\chromedriver.exe");
		return driver = new ChromeDriver();


		// WebDriverWait wait = new WebDriverWait(driver , 20);
     }

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void geturl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void title() {
		System.out.println(driver.getTitle());
	}

	public static void sendkey(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void getAttribute(WebElement element) {
		System.out.println(element.getAttribute("value"));

	}

	public static void getAttributeName(WebElement element) {
		System.out.println(element.getAttribute("name"));
	}

	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}

	public static void enabled(WebElement element) {
		System.out.println(element.isEnabled());
	}

	public static void display(WebElement element) {
		System.out.println(element.isDisplayed());
	}

	public static void navigate(String url) {
		driver.navigate().to(url);
	}

	public static void selected(WebElement element) {
		System.out.println(element.isSelected());
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void frwd() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void AlertHandle(String options)
	{

		Alert alert = driver.switchTo().alert();
		if(options.equalsIgnoreCase("ok"))
		{
			alert.accept();

		}
		else if(options.equalsIgnoreCase("cancel"))
		{
			alert.dismiss();
		}
		else if(options.equalsIgnoreCase("gettext"))
		{
			String text = alert.getText();
			System.out.println(text);
		}
	}


	public static void windowhandle()
	{
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
 	}

	public static void windowhandles()
	{
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

	}

	public static void actions(WebElement element ,String options)
	{
		Actions a = new Actions(driver);
		if(options.equalsIgnoreCase("click"))
		{
			a.click(element).build().perform();
		}
		else if(options.equalsIgnoreCase("doubkeclick"))
		{
			a.doubleClick(element).build().perform();
		}
		else if(options.equalsIgnoreCase("contextclick"))
		{
			a.contextClick(element).build().perform();
		}

	}

	public static void moveto( WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void DragandDrop(WebElement src , WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).build().perform();
	}

	public static void ClickandHold( WebElement element)
	{
		Actions a = new Actions(driver);
		a.clickAndHold(element).build().perform();
	}

	public static void robot(String options)throws AWTException
	{
		Robot rob = new Robot ();

		if(options.equalsIgnoreCase("dowm"))
		{
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		else if(options.equalsIgnoreCase("up"))
		{
			rob.keyPress(KeyEvent.VK_UP);
			rob.keyRelease(KeyEvent.VK_UP);
		}
		else if(options.equalsIgnoreCase("enter"))
		{
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	public static void scrollpage(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollintoview();",element);
	}

	public static void dropdown(String options , WebElement element, String input)
	{
		Select s = new Select(element);
		if(options.equalsIgnoreCase("value"))
		{
			System.out.println("select by value");
			s.selectByValue(input);
		}
		else if(options.equalsIgnoreCase("text"))
		{
			System.out.println("select by visible text");
			s.selectByVisibleText(input);
		}
		else if(options.equalsIgnoreCase("index"))
		{
			System.out.println("select by index");
			int parseint = Integer.parseInt(input);
			s.selectByIndex(parseint);
		}
	}

	public static void multipledropdown(String options , WebElement element, String input)
	{
		Select s = new Select(element);

		if(options.equalsIgnoreCase("deselectvalue"))
		{
			System.out.println("deselect by value");
			s.deselectByValue(input);
		}
		else if(options.equalsIgnoreCase("deselectindex"))
		{
			System.out.println("deselect by index");
			int parseint = Integer.parseInt(input);
			s.deselectByIndex(parseint);
		}
		else if(options.equalsIgnoreCase("deselecttext"))
		{
			System.out.println("deselect by text");
		s.deselectByVisibleText(input);
		}
		else if(options.equalsIgnoreCase("deselectall"))
		{
			System.out.println("deselect all values");
			s.deselectAll();
		}
	}

	public static void getOptions(WebElement element)
	{
		Select s = new Select(element);
		s.getOptions();
	}

	public static void getFirstSelectedOptions(WebElement element)
	{
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}

	public static void getAllSelectedOptions(WebElement element)
	{
		Select s = new Select(element);
		s.getAllSelectedOptions();
	}

	public static void frame()
	{
		driver.switchTo().defaultContent();
	}

	public static void frame1(int i)
	{
		driver.switchTo().frame(i);
	}
    
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void defaultframe()
	{
		driver.switchTo().defaultContent();
	}
	
	public static void implicitWait(int w)
	{
		driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);
	}

	public static void screenshot(String url)throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(url);
		FileUtils.copyFile(src, dest);
	}

	public static void clear(WebElement element) 
	{
		element.clear();
	}
	public static void close() 
	{
		driver.close();
	}

	public static void quit()
	{
		driver.quit();
	}
}

