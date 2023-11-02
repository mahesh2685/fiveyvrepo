package configure;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import static frameworkk.utitlity.Keyword.*;

public class BaseFramework {
	
    @BeforeMethod
	public void setup()
	{
		openBrowser("Chrome");
		launchUrl("https://www.flipkart.com/");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
