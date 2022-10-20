package com.vagrant.genericlibrary;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * This class consists of to store the generic methods of property_file
 * @author pavan.joshi
 *
 */
public class propertyfileutility {
	/**
	 * This method read data from property file key given by user
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String Readdatafrompropertyfile(String key) throws Throwable  {
		FileInputStream fis=new FileInputStream("C:\\Users\\pavan.joshi\\eclipse-workspace\\Testvagrant1\\src\\main\\resources\\propertyfile.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}