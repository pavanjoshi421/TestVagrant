package com.vagrant.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.crm.GenericLibrary.WebdriverUtility;

public class Baseclass {

	public static WebDriver driver;
	public propertyfileutility plib=new propertyfileutility();
	public WebdriverUtility wlib=new WebdriverUtility();
	
	@BeforeClass
	public void launchbrowser() throws Throwable 
	{
		//read the data from property File
		String browser = plib.Readdatafrompropertyfile("browser");
		if(browser.equalsIgnoreCase("chrome"))  {
		   //  WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))  {
		    // WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}else{
			System.out.println("invalid browser");
		}
		wlib.maximizewindow(driver);
		wlib.waitForpageload(driver);
		Reporter.log("Browser launch sucessful",true);
		}			
	@AfterClass
	public void closebrowser()  {
		driver.quit();
		Reporter.log("browser close sucessful",true);
	}
		 }