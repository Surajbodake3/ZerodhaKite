package com.kite.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.kite.POMClass.LoginPOMClass;


public class TestBaseClass 

{
	public WebDriver driver;
	
	Logger log = Logger.getLogger("KiteZerodha");
	@Parameters("browserName")
	@BeforeMethod
	 
	public void Setup(String browserName) throws InterruptedException, IOException
	{
		
	
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "./DriverFiles\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser is opened");
		
		
		driver.manage().window().maximize();
		log.info("Browser Maximized");
		
		driver.get("https://kite.zerodha.com/");
		log.info("URL is opened");
		
//		ScreenShot.TakeScreenshot(driver,"LoginPage");
		
		log.info("Screenshot taken");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPOMClass x = new LoginPOMClass(driver);
		
		x.SendUserName();
		log.info("UserName is Entered");
		x.SendPassword();
		log.info("Password is Entered");
		
		x.clickLogin();
		log.info("Clicked on Login Button");
		Thread.sleep(20000);
		x.SendPin();
		log.info("Pin is Entered");
		
		
		
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}

}
