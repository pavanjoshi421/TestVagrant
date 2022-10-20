package com.vagrant.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipidia {

	@FindBy(xpath="//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	private WebElement Realeasedate;
	
	@FindBy(xpath="//td[.='India']")
	private WebElement Country;
	
	public Wikipidia(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getrealease()  {
		return Realeasedate;
	}
	public WebElement getcountry() {
		return Country;
	}
	 }
