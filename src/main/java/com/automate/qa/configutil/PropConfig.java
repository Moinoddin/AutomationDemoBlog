package com.automate.qa.configutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropConfig {

	Properties prop;
	InputStream inputstream;
	
	
	public PropConfig() throws IOException
	{
		prop = new Properties();
		
		File file = new File("C:\\Users\\Mainuddin\\eclipse-workspace\\AutomationBlogspot\\src\\main\\java\\com\\automate\\qa\\propconfig\\enviroment.properties");
		
		inputstream = new FileInputStream(file);
				
		prop.load(inputstream);
		
		
	}
	
	public String url()
	{
		return prop.getProperty("url");
	}
	
	
	
}
