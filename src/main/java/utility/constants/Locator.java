package utility.constants;

public interface Locator 
{                                     //All locators of project found in this method 
	                                  //change here to replace all over the project
	public String homeScreen_closePopupBtn="XPATH##//span[contains(text(),'✕')]";
    String homeScreen_TravelLink="XPATH##//span[text()='Flights']";                     
    String homeScreen_fromCity="XPATH##//label[contains(text(),'From')]/parent::div";
    String homeScreen_fromCity_BOM="XPATH##//input[@value='Mumbai, BOM - Chatrapati Shivaji International Airport']";
    String homeScreen_searchTextbox="XPATH##//input[@placeholder='Search for Products, Brands and More']\",\"Shoes\")";
   

    
}
 