package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	 WebDriver driver;
	 
public LoginPage(WebDriver ldriver) {
	this.driver=ldriver;
	}
	

	@FindBy(xpath="//input[@name='username']")
	WebElement username;
		
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	
	public void loginToHrm(String usernamedata, String passworddata) {
		username.sendKeys(usernamedata);
		password.sendKeys(passworddata);
		loginButton.click();
		
		
	}

}
