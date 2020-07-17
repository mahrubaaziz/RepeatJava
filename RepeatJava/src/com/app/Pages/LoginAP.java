package com.app.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginAP {
	
	WebDriver driver;
	public LoginAP(WebDriver Pdriver) //Pdriver is a obj name here
	{
		this.driver=Pdriver;
	}
	//option 1
	@FindBy(id="email")
	WebElement username;
	//option 2
	@FindBy(how=How.ID,using="passwd") 
	//@CacheLookup we can use it but need to make sure loctor value never changes in the website 
	//and this will sit in my computer for ever that's not good
	WebElement password;
	
	@FindBy(how=How.XPATH,using ="//*[@id='SubmitLogin']/span")
	WebElement SignIn_button;
	
	@FindBy(how=How.XPATH,using="//a[@title='Recover your forgotten password']")
	WebElement forgotpassword;
	
	public void login_apsite(String uid, String passs)
	{
		username.sendKeys(uid);
		password.sendKeys(passs);
		SignIn_button.click();
	}

}
