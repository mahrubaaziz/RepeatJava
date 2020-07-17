package com.app.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.app.Pages.LoginAP;

import Helper.BrowserFactory;

public class VerifyValidLogin {
	
	@Test
	public void CheckUser()
	{	//This will launch the browserand hit url
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//created page object using Page Factory ,when I will perform action I will declare only driver
		LoginAP login_page=PageFactory.initElements(driver, LoginAP.class); //it will imported the info from LoginAP class
		//call the method from LoginAP class
		login_page.login_apsite("testj3913@gmail.com", "abc123");
	
	}
	

}
