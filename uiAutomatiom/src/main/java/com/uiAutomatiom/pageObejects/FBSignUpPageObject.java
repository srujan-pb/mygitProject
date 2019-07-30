package com.uiAutomatiom.pageObejects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiAutomatiom.helper.assertions.VerificationHelper;
import com.uiAutomatiom.helper.browerConfigurations.config.ObjectReader;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.helper.wait.WaitHelper;

public class FBSignUpPageObject {

	private static Logger log = LogHelper.getLogger(FBSignUpPageObject.class);
	public static WebDriver driver;
	public static WaitHelper waitHelper;

	//// Application LogIn button
	@FindBy(linkText = "loginbutton")
	WebElement appLoginButton;

	@FindBy(name = "email")
	WebElement userNameLogin;

	@FindBy(name = "pass")
	WebElement passwordLogin;

	//// Log in to Facebook - Forgot Account Link
	@FindBy(linkText = "Forgotten account?")
	WebElement forgotAccountLink;
	
	/// Log in to Facebook - Create New Account
	@FindBy(xpath = "//*[@id=\'login_link\']/div[3]/a")
	WebElement createNewAccountLink ;
	
	public FBSignUpPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.pageloadTimeOut(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
	}

	public void enterUserName() {
		userNameLogin.sendKeys(ObjectReader.reader.getUserName());
	}

	public void enterPassword() {
		passwordLogin.sendKeys(ObjectReader.reader.getPassWord());
	}

	public void clickAppLoginButton() {
		appLoginButton.click();

	}
	VerificationHelper vhObjects = new VerificationHelper(driver);

	public continuePage successfullLogin() {
		
		enterUserName();
		enterPassword();
		clickAppLoginButton();
		return new continuePage(driver);

	}

	/// verify Application Login Link
	public boolean verifyAppLoginLink() {
		boolean status = vhObjects.isDisplayed(appLoginButton);
		return status;
	}

	/// verify User name
	public boolean verifyUserName() {
		boolean status = vhObjects.isDisplayedInput(userNameLogin);
		return status;
	}

	/// verify password
	public boolean verifyPassword() {
		boolean status = vhObjects.isDisplayedInput(passwordLogin);
		return status;
	}

	/// verify login on Login Screen 
	public boolean verifyLogin() {
		boolean status = vhObjects.isDisplayed(appLoginButton);
		return status;
	}
}
