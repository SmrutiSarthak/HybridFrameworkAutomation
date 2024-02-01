package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

public class LoginTestHrm extends BaseClass{
	
	@Test
	public void loginApp() {
		logger = report.createTest("loginToOrangeHRM");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		//loginpage.loginToHrm("Admin", "admin123");
		String username = excel.getStringData(0, 0, 0);
		String password = excel.getStringData(0, 0, 1);
		logger.info("Insering username & password");
		loginpage.loginToHrm(username,password);
		logger.pass("loggin successful");
		
	}
	

}
