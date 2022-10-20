package com.vagrant.genericlibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author pavan.joshi
 *
 */
public class Webdriverutility {

	/**
	 * This class consists of all generic methods related to webdriverActions
	 * @author pavan.joshi
	 *
	 */
	public class WebdriverUtility 
	{
		/**
		 * This method will maximize the window
		 * @param driver
		 */
	public void maximizewindow(WebDriver driver)  {
		driver.manage().window().maximize();
	}
	/**
	 * This method will wait for 20 second for the page to load
	 * @param driver
	 */
	public void waitForpageload(WebDriver driver)  {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
    	}
}
	
	
