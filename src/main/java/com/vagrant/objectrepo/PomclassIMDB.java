package com.vagrant.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PomclassIMDB {
	
	@FindBy(xpath="//span[.='Details']")
	private WebElement Details;
	
	@FindBy(xpath="//a[.='December 17, 2021 (United States)']")
	private WebElement state;
	
	@FindBy(xpath="//a[.='India']")
	private WebElement country;
	
	public PomclassIMDB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getdetailes()  {
		return Details;
	}
	public WebElement releasedate() {
		return state;
	}
	public WebElement getcountry() {
		return country;
	}
	}
