package com.PomSelenium;
import org.openqa.selenium.WebDriver;
import java.io.*;
import java.io.IOException;
import com.PomSelenium.LoginPage;

import PageObjectManager.PageObjectManager;
import config.FileReaderManager;
import config.ConfigurationReader;

public class Runnable extends BasePOM
{
public static WebDriver driver;

public static void main(String[] args) throws IOException
{
driver = getBrowser();
maximize();
Wait();
// get url 
getUrl(FileReaderManager.getInstanceFRM().getInstanceCR().getUrl());
PageObjectManager pom=new PageObjectManager(driver);

// login 
click(pom.getLoginPage().getSignInBtn());
sendkey(pom.getLoginPage().getEmailId(),FileReaderManager.getInstanceFRM().getInstanceCR().getUsername());
sendkey(pom.getLoginPage().getPassword(),FileReaderManager.getInstanceFRM().getInstanceCR().getPassword());
click(pom.getLoginPage().getLoginBtn());

// search order
click(pom.getSearchOrder().getWomen());
click(pom.getSearchOrder().getTshirt());
frame1(0);


//placeorder
click(pom.getPlaceOrder().getAddtoCart());		
defaultframe();

click(pom.getPlaceOrder().getProceed_checkout());
click(pom.getPlaceOrder().getCheckout());
click(pom.getPlaceOrder().getProceed_address());
click(pom.getPlaceOrder().getTerms());
click(pom.getPlaceOrder().getProceed_Terms());

//oderpayment
click(pom.getOrderPayment().getPayment());
click(pom.getOrderPayment().getPayment_confirm());
click(pom.getOrderPayment().getBack_to_Orders());




close();
}
}


