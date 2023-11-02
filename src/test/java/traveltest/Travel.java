package traveltest;
//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
/**
 * @author Admin
 */
import org.testng.annotations.Test;

import configure.BaseFramework;
import frameworkk.utitlity.PropUtility;
import utility.constants.Locator;
import utility.constants.LocatorType;

import static frameworkk.utitlity.Keyword.*;


//import baseframe.BaseFramework;

public class Travel extends BaseFramework
{                  //Keyword Driven Framework
	private static final Logger Log = Logger.getLogger(Travel.class);   //import apache.log4j
	@Test
	public void verifyErrorOnSelectingsameCitiesAsSourceAndDestination()
	{   

       //openBrowser("Chrome");
       //launchUrl("https://www.flipkart.com/");
		waitFor(3000);
		click(Locator.homeScreen_closePopupBtn);
		click(Locator.homeScreen_TravelLink);
		waitFor(5000);
		/*PropUtility prop = new PropUtility();
		click(prop.getLocator("homeScreen.travelLink")[0],prop.getLocator("homeScreen.travelLink")[1]);*/
		click(Locator.homeScreen_fromCity);
		waitFor(2000);
		Log.info("Clicked on From city dropdown");
		click(Locator.homeScreen_fromCity_BOM);
		Log.info("Selected Bombay as from city");
		
		
		
		//WebElement closeBtn = driver.findElement(By.xpath("//span[contains(text(),'✕')]")).click();
		
		/*click(LocatorType.xpath,"//span[contains(text(),'✕')]");
		click(LocatorType.xpath,"//span[text()='Flights']");
		waitFor(5000);
		click(LocatorType.xpath,"//label[contains(text(),'From')]/parent::div");
		waitFor(2000);
		click(LocatorType.xpath,"//input[@value='Mumbai, BOM - Chatrapati Shivaji International Airport']");*/
		/*waitFor(3000);
	    click(LoatorType.xpath,"XPATH,"//span[contains(text(),'✕')]"");
		click(Locator.homeScreen_closePopupBtn);
		//click(LocatorType.xpath,"//button[contains(text(),'x')]");
		click(Locator.homeScreen_TravelLink);
		waitFor(5000);
		PropUtility prop = new PropUtility();
		click(prop.getLocator("homeScreen.travelLink")[0],prop.getLocator("homeScreen.travelLink")[1]);
		//click(LocatorType.xpath,"//button[contains(text(),'x')]");
		click(Locator.homeScreen_fromCity);
		waitFor(2000);
		//Log.info("Clicked on From city dropdown");
		click(Locator.homeScreen_fromCity_BOM);
		//Log.info("Selected Bombay as from city");*/
		
	}
	@Test
	public void verifySearchResultsForShoes()
	{
     	//enterText(Locator.homeScreen_searchTextbox,"Shoes" );
		enterText(Locator.homeScreen_searchTextbox,"Shoes");
	}

}



