package com.kite.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.kite.POMClass.LoginPOMClass;
import com.utilityClass.ScreenShot;




public class TC01_VerifyLoginFuncionality extends TestBaseClass
{
//	WebDriver driver;

	@Test
	public void Loginpage() throws InterruptedException, IOException 
	{
//		System.setProperty("webdriver.chrome.driver", "E:\\Suraj\\Testing Notes\\Selenium\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://kite.zerodha.com/");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		LoginPOMClass x = new LoginPOMClass(driver);
//		
//		x.SendUserName();
//		x.SendPassword();
//		
//		x.clickLogin();
//		Thread.sleep(20000);
//		x.SendPin();
		String expected	="Kite - Zerodha's fast and elegant flagship trading platform";
		
		String actual = driver.getTitle();
		
		log.info(actual);
		
		Assert.assertEquals(expected, actual);
		
		SoftAssert sur = new SoftAssert();
		
		sur.assertEquals(expected, actual);
		
		
		
		
	}

}
