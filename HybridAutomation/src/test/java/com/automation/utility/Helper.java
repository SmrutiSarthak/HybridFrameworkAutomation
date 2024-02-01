package com.automation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	
	//screenshot,alert,frames,multiple windows,sync issue,java script executer
	public static String captureScreenshot(WebDriver driver) {
		String screenShotPath = System.getProperty("user.dir")+"/Screenshot/ProjectName "+getCurrentDateTime()+".png";
		File src  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(screenShotPath));
		} catch (Exception e) {
		
		System.out.println("Unable to take screenshot "+e.getMessage());
		}
		return screenShotPath;
	}
	
	
	public static String getCurrentDateTime() {
		DateFormat customdate = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss"); 
		Date currentDate = new Date();
		return customdate.format(currentDate);
	}
	
}


