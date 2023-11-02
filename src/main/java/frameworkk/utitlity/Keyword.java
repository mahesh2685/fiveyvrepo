package frameworkk.utitlity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Admin
 *
 */
public class Keyword {
	public static RemoteWebDriver driver;
	private static WebDriverWait wait;
	//private static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

	/*private static final Logger log = Logger.getLogger(Keyword.class);
	private static final Category Log = null;*/
	
	/**
     * This method will launch specified browser in maximized mode
     * 
     * @param browserName must be one of the following
     *                 <ul>
     *                 <li>Chrome</li>
     *                 <li>Firefox</li>
     *                 <li>Safari</li>
     *                 </ul>
     */
    public static void openBrowser(String browserName)      //static-d'ont create object to call method.Not need to create object and call method
    {                                                       //because instance variable create multiple copies in a memory according to object created
    	if(browserName.equalsIgnoreCase("Chrome")) {
    		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Testing\\Java development\\SeleniumDownloads\\browserchrome\\WebDrivers\\chromedriver-win64\\chromedriver.exe");
    		ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
       		WebDriver driver = new ChromeDriver(options);
       		}
       		else if(browserName.equalsIgnoreCase("Firefox")) {
       			System.setProperty("firefox.gecko.driver", "D:\\Automation_Testing\\Java development\\SeleniumDownloads\\WebDriverFiles\\geckodriver-v0.32.0-win64\\geckodriver.exe"); 
                WebDriver driver = new FirefoxDriver(); 
       		}
       		else if
       		
       			(browserName.equalsIgnoreCase("Edge")) {
       		 System.setProperty("webdriver.edge.driver", "D:\\Automation_Testing\\Java development\\SeleniumDownloads\\WedDriver\\edgedriver_win32\\msedgedriver.exe");
       		 EdgeOptions ed= new EdgeOptions();
       		 ed.addArguments("--remote-allow-origins=*");
       		 WebDriver driver = new EdgeDriver(ed);
       		}
       		else {
       		System.err.println("Invalid browser name: "+ browserName);
       		//Log.error("Invalid browser name: "+ browserName);                 //logger:replace with log error
     	}
    	System.out.println(browserName+ " is launched successfully");
    	//Log.info(browserName+ " is launched successfully");
     	wait =new WebDriverWait(driver, Duration.ofSeconds(30));
    }
	/**
	 * This method will launch the specified url in currently opened browser window
	 * 
	 * @param url
	 */
     public static void launchUrl(String url)
     {
    	 driver.get(url);
    	 System.out.println("url is launched successfully");
    	 //Log.info("url is launched successfully");          //replace with log info
     }
     
     /**
      * This method will click on element described by {@code locatorType} and
      *{@code locatorValue}
      *
      *@param element on which you want to perform click
      *
      *@param locatorType must be one of the following:
      *                            <ul>
      *                            <li>xpath</li>
      *                            <li>css</li>
      *                            <li>id</li>
      *                            <li>class</li>
      *                            <li>name</li>
      *                            </ul>
      *@param locatorValue                            
      */
    
     @Deprecated                                                                   //at coming version will remove
     public static void click(String locatorType, String locatorValue) {  //overloading
    	 getWebElement(locatorType, locatorValue).click();   //lt,lv knows call it
    	 
     }
     public static void click(String locator) {
    	 String[] parts = locator.split("##");
    	 getWebElement(parts[0], parts[1]).click();
     }
     public static void click(By by) {        //Oop's concept of method overloading is used
    	 driver.findElement(by).click();       //by class instance knows ,call it
     }
     @Deprecated
     public static void enterText(String locatorType, String locatorValue, String textToEnter) {
    	 getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
     }
     public static void enterText(String locator, String textToEnter) {
    	 String[] parts = locator.split("##");
    	 getWebElement(parts[0], parts[1]).sendKeys(textToEnter);
     }
     /**
      * This method will click on element described by {@code locator Type} and {@code locator value} 
      * @param locatorType must be one of the following
      * <ul>
      * <li>xpath</li>
      * <li>css</li>
      * <li>id</li>
      * <li>class</li>
      * <li>name</li>
      * </li>
      * @param locatorValue
      * @return
      */
      private static WebElement getWebElement(String locatorType, String locatorValue) {
		if(locatorType.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(locatorValue));
		}else if(locatorType.equalsIgnoreCase("css"))
		{
			return driver.findElement(By.cssSelector(locatorValue));
		}else
		{
			System.err.println("Invalid locator type: "+ locatorType);
			//Log.error("Invalid locator type: "+ locatorType);
			return null;
		}
      }
     /*public static void click(String locatorType, String locatorValue) {
 		if(locatorType.equalsIgnoreCase("xpath")) {                            //duplicacy  
 			 driver.findElement(By.xpath(locatorValue)).click();
 		}else if(locatorType.equalsIgnoreCase("css"))
 		{
 			 driver.findElement(By.cssSelector(locatorValue)).click();
 		}else
 		{
 			System.err.println("Invalid locator type: "+ locatorType);
 			
 		}	
 		}
 		public static void enterText(String locatorType, String locatorValue, String textToEnter) {
 	 		if(locatorType.equalsIgnoreCase("xpath")) {
 	 			 driver.findElement(By.xpath(locatorValue)).sendKeys(textToEnter);;        //duplicacy  
 	 		}else if(locatorType.equalsIgnoreCase("css"))
 	 		{
 	 			 driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);;
 	 		}else
 	 		{
 	 			System.err.println("Invalid locator type: "+ locatorType);
 	 			 			
 	 		}
		
      }*/
		public static void waitFor(long duration) {
			try {
				Thread.sleep(duration);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();

		}
			
	 }

}
