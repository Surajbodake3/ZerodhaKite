package com.kite.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPOMClass 
{
	WebDriver driver;
	
	public LogOutPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='user-id']")
	WebElement id;
	
	public void clickonID()
	{
		id.click();
	}
	
	@FindBy(xpath="//a[@target='_self']")
	WebElement logout;
	
	public void clickonLogout()
	{
		logout.click();
	}
	
	
	

}
