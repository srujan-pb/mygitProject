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
import com.uiAutomatiom.testScript.FBHomePageObjectsVerfication;

public class FBPeoplePageObjects {

	private static Logger log = LogHelper.getLogger(FBPeoplePageObjects.class);
	public static WebDriver driver;
	public static WaitHelper waitHelper;
	
	
	//*********************Facebook People Link Page Objects *********************//
	
	/// Facebook - People Page - Email 
	@FindBy(name = "email")
	WebElement peopleEmailOnPeoplePage ;
	
	
	/// Facebook - People Page - Password 
		@FindBy(name = "pass")
		WebElement peoplePasswordOnPeoplePage ;
		
		@FindBy(name = "//*[@id=\'captcha_submit\']")
		WebElement peopleCaptchaSubmitOnPeoplePage ;
		
		
		public FBPeoplePageObjects(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			waitHelper = new WaitHelper(driver);
			waitHelper.pageloadTimeOut(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		}

		
		//**************** Object verification and  Operation on People's Page *****************//
		
	///// Verify  - Email  on People Page 
			public boolean verifyPeopleEmailonHomePage() {
				boolean status = new VerificationHelper(driver).isDisplayed(peopleEmailOnPeoplePage);
				return status;
			}
				
		//////enter Email   
				public void enterEmailOnPeoplePage() {
					peopleEmailOnPeoplePage.clear();
					peopleEmailOnPeoplePage.sendKeys(("Test@gmail.com").toUpperCase());
		}
	
			///// Verify  - Password  on People Page 
				public boolean verifyPasswordEmailonHomePage() {
					boolean status = new VerificationHelper(driver).isDisplayed(peoplePasswordOnPeoplePage);
					return status;
				}
					
			//////enter Email   
					public void enterPasswordOnPeoplePage() {
						peoplePasswordOnPeoplePage.clear();
						peoplePasswordOnPeoplePage.sendKeys(("Test@123").toUpperCase());
			}
				
				
			/// Navigate to FB Home Page
					public void navigateBackToFBHomePage() throws Exception {
						 WindowHelper.navigateBack();	
			}
			
					
}
