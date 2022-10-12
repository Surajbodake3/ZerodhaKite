package com.kite.POMClass;

import javax.swing.ActionMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchlistPOMClass 
{
	WebDriver driver;
	Actions act;
	
	public WatchlistPOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
		act = new Actions(driver);
	}
	
	@FindBy(xpath="//li[@data-balloon='MW 7']")
	
	WebElement wlist;
	
	public void watchlist7()
	{
		wlist.click();
	}
	
	@FindBy(xpath="//input[@type='text']")
	
	WebElement search;
	
	public void Enterstokname()
	{
		search.sendKeys("Tata Motors");
	}
	
	@FindBy(xpath="//li[@class='search-result-item selected']")
	WebElement suggestion;
	
	public void suggestion()
	{
		act.moveToElement(suggestion).perform();
	}
	
	@FindBy(xpath="//button[@data-balloon='Add']")
	WebElement add;
	public void clickonadd()
	{
		add.click();
		add.click();
	}
	
	@FindBy(xpath="//span[@class='counts']")
	WebElement display;
	
	public String getlist()
	{
		String count1 = display.getText();
		return count1;
	}
	
	@FindBy(xpath="//span[@class='symbol']")
	WebElement dropdown;
	
	public void movetodropdown()
	{
		act.moveToElement(dropdown).perform();
	}
	

	@FindBy(xpath="//button[@class='button-blue buy']")
	WebElement buy;
	
	public void clickonbuy()
	{
		buy.click();
	}
}
