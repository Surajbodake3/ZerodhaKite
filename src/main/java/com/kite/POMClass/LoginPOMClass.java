package com.kite.POMClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='userid']")
	WebElement username;
	
	public void SendUserName()
	{
		username.sendKeys("LM1376");
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	public void SendPassword()
	{
		password.sendKeys("Suraj@7875");
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Login;
	
	public void clickLogin()
	{
		Login.click();
	}
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	WebElement continuelogin;
	
	public void SendPin()
	{
		continuelogin.click();
	}
	
//	@FindBy(xpath = "//button[@class='button-orange wide']")
//	
//	WebElement Login1;
//	
//	public void ClickContinue()
//	{
//		Login1.click();
//	}
	
	 public LoginPOMClass(WebDriver driver)
	 {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	 }
	
	
}
