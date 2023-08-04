package PageObjectManager;

import org.openqa.selenium.WebDriver;
import config.FileReaderManager;
import config.ConfigurationReader;
import com.PomSelenium.LoginPage;
import com.PomSelenium.OrderPayment;
import com.PomSelenium.PlaceOrder;
import com.PomSelenium.SearchOrder;

public class PageObjectManager {

	public static WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	
	

	//1.Login
	public LoginPage getLoginPage()
	{
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	
	//2.SearchOrder
	public SearchOrder getSearchOrder()
	{
		SearchOrder so=new SearchOrder(driver);
		return so;
	}
	
	
	//3.PlaceOrder
	
	public PlaceOrder getPlaceOrder()
	{
		PlaceOrder po=new PlaceOrder(driver);
		return po;
	}
	
	//4.OrderPayment
	
	public OrderPayment getOrderPayment()
	{
		OrderPayment op=new OrderPayment(driver);
		return op;
	}
	
}
















