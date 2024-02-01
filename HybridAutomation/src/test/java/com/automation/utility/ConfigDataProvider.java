package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider() {
		try {
			File src = new File("C:\\Users\\dell\\eclipse-workspace\\HybridAutomation\\Config\\config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		} catch (Exception e) {
		
			System.out.println("unable to read config file "+e.getMessage());
	
		}
	}
	
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	public String getqaUrl() {
		return pro.getProperty("qaUrl");
	}

}
