package com.testvagrant.PushpaMovieValidation;
import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vagrant.genericlibrary.Baseclass;
import com.vagrant.objectrepo.PomclassIMDB;
import com.vagrant.objectrepo.Wikipidia;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author pavan.joshi
 *
 */
public class imdb extends Baseclass {
	public PomclassIMDB pom=new PomclassIMDB(driver);
	public Wikipidia wiki=new Wikipidia(driver);
	 String releaseText1;
	 String releaseText;
	 String country1;
	 String country;

	@Test
  /**
 * This test script fetch the data from IMBD site
 * @throws Throwable
 */
	public void imdbdata() throws Throwable 
	{
     WebDriverManager.chromedriver().setup();
		//fetch data from IMBD
	  String url = plib.Readdatafrompropertyfile("url");
	  driver.get(url);
	  WebElement del = pom.getdetailes();
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", del);
	  String releaseText = pom.releasedate().getText();
	  String country = pom.getcountry().getText();
	}
	
	  @Test
	  /**
	   * This test script fetch data from wikipedia
	   * @throws Throwable
	   */
	  public  void wikidata() throws Throwable
	  {
	   String url1 = plib.Readdatafrompropertyfile("url1");
	   driver.get(url1);
		WebElement release = wiki.getrealease();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",release );
		String releaseText1 = wiki.getrealease().getText();
		String country1 = wiki.getcountry().getText();
	  }
	  
	  @Test
	  /**
	   * This script for validation from both wiki and IMDB
	   */
	  public void validation() {
	//Release Date Validation
		Assert.assertEquals(releaseText, releaseText1);
		System.out.println("Realease Date Match");
	//Country Validation
		Assert.assertEquals(country, country1);
		System.out.println("Country Match");
	}
	}
