package com.kite.TestClass;

import java.io.IOException;

import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.kite.POMClass.LogOutPOMClass;
import com.utilityClass.ScreenShot;



public class TC03_VerifyLogOutFunctionality extends TestBaseClass
{
	
	@Test
	
	public void logout() throws IOException
	{
		LogOutPOMClass y = new LogOutPOMClass(driver);
		
		y.clickonID();
		y.clickonLogout();
//		ScreenShot.TakeScreenshot(driver, "Logout");
		
		String expected = "Kite - Zerodha's fast and elegant flagship trading platform";
		log.info(expected);
		String actual = driver.getTitle();
		
		log.info(actual);
		Assert.assertEquals(actual,expected);
		
	}
	

}
