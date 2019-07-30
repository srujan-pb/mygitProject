
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

public class OpenPage {

	private static Logger log = LogHelper.getLogger(OpenPage.class);
	public static WebDriver driver;
	public static WaitHelper waitHelper;

	//// Application button
	@FindBy(linkText = "Application Log In")
	WebElement appLogin;

	

	public OpenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.pageloadTimeOut(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
	}

	public void clickAppLogin() {
		appLogin.click();
	}

	
	VerificationHelper vhObjects = new VerificationHelper(driver);

	public FBSignUpPageObject successfullyPageOpen() {
		clickAppLogin();
		return new FBSignUpPageObject(driver);

	}

	/// verify Application Login Link
	public boolean verifyAppLoginLink() {
		boolean status = vhObjects.isDisplayed(appLogin);
		return status;
	}


}
