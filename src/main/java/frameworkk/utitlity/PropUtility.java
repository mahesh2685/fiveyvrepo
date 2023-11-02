package frameworkk.utitlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class can be utilized for reading and writing the .properties files
 * @author Admin
 *
 */

public class PropUtility {

	public String getValue(String filepath, String key)
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		Properties prop = new Properties();
		String value = null;
		try {
			prop.load(fis);
			prop.getProperty(key);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	public String[]  getLocator(String key) {
		String dir = System.getProperty("user.dir")+"/src/main/resources/OR.properties";   //access from object repository
		String locator = getValue(dir, key);
		String[] parts = locator.split("##");
		return parts;
		//return getValue(dir, key);

	}
}
