package com.crm.UtilityFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFile 
{
	public static String propertiesFile(String key) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\configuration.properties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
	}
}
