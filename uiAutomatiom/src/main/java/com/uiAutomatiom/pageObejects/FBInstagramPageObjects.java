package com.uiAutomatiom.pageObejects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiAutomatiom.helper.assertions.VerificationHelper;
import com.uiAutomatiom.helper.browerConfigurations.config.ObjectReader;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.helper.wait.WaitHelper;
import com.uiAutomatiom.helper.window.WindowHelper;

public class FBInstagramPageObjects {

	private static Logger log = LogHelper.getLogger(FBInstagramPageObjects.class);
	public static WebDriver driver;
	public static WaitHelper waitHelper;
	
	
	//*********************Facebook Instagram Link Page Objects *********************//
	
	/// Facebook - Instagram Page - Email 
	@FindBy(name = "emailOrPhone")
	WebElement emailOnInstagramPage ;
	
	/// Facebook - Instagram Page - Full Name
	@FindBy(name = "fullName")
	WebElement fullNameOnInstagramPage;
	
	/// Facebook - Instagram Page - User Name
	@FindBy(name = "username")
	WebElement userNameOnInstagramPage;
		
		
	/// Facebook - Instagram Page - User Name
	@FindBy(name = "password")
	WebElement passwordOnInstagramPage;
	
	
	public FBInstagramPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.pageloadTimeOut(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
	}

	
	//**************** Object verification and  Operation of Homepage *****************//
	
	///// Verify  - Email  on People Page 
		public boolean verifyEmailOnInstagramPage() {
			boolean status = new VerificationHelper(driver).isDisplayed(emailOnInstagramPage);
			return status;
		}
			
	//////enter Email   
			public void enterEmailOnPeoplePage() {
				emailOnInstagramPage.clear();
				emailOnInstagramPage.sendKeys(("Test@gmail.com").toUpperCase());
	}
		
			
	///// Verify  - Full Name  on People Page 
		public boolean verifyFullNameOnInstagramPage() {
			boolean status = new VerificationHelper(driver).isDisplayed(fullNameOnInstagramPage);
				return status;
			}
				
		//////enter Full Name   
				public void enterFullNameOnPeoplePage() {
					fullNameOnInstagramPage.clear();
					fullNameOnInstagramPage.sendKeys(("Automation Tester").toUpperCase());
		}
				
		///// Verify  - User Name  on People Page 
				public boolean verifyUserNameOnInstagramPage() {
					boolean status = new VerificationHelper(driver).isDisplayed(userNameOnInstagramPage);
						return status;
					}
						
		//////enter User Name   
				public void enterUserNameOnPeoplePage() {
					userNameOnInstagramPage.clear();
					userNameOnInstagramPage.sendKeys(("Tester_Automation").toUpperCase());
				}
						
		///// Verify  - Password  on People Page 
				public boolean verifyPasswordOnInstagramPage() {
					boolean status = new VerificationHelper(driver).isDisplayed(passwordOnInstagramPage);
						return status;
							}
								
		//////enter User Name   
				public void enterPasswordOnPeoplePage() {
					passwordOnInstagramPage.clear();
					passwordOnInstagramPage.sendKeys(("Tester@123").toUpperCase());
						}

}
