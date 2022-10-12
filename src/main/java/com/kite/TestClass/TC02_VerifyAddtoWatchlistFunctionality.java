package com.kite.TestClass;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kite.POMClass.WatchlistPOMClass;
import com.utilityClass.ScreenShot;




public class TC02_VerifyAddtoWatchlistFunctionality extends TestBaseClass
{

	@Test
	
	public void watchlist() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		ScreenShot.TakeScreenshot(driver,"HomePage");

		WatchlistPOMClass x = new WatchlistPOMClass(driver);
		
		x.watchlist7();
		log.info("Move to watchlist 7");
		x.Enterstokname();
		log.info("Stock name Entered");
		x.suggestion();
		x.clickonadd();
		Thread.sleep(3000);
		ScreenShot.TakeScreenshot(driver,"ShareaddedinWatchList");
		log.info("Share is added in watchlist");
		x.movetodropdown();
		x.clickonbuy();
		Thread.sleep(3000);
		ScreenShot.TakeScreenshot(driver,"BuyWindowOpen");
		String expected = "1 / 50";
		
		String actual = x.getlist();
		
		log.info(actual);
		
//		Assert.assertEquals(expected, actual);
		
	
		
		
	}

}
