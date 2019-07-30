package com.uiAutomatiom.testScript;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.uiAutomatiom.TestBase.TestBase;
import com.uiAutomatiom.helper.browerConfigurations.config.ObjectReader;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.helper.window.WindowHelper;
import com.uiAutomatiom.pageObejects.FBHomePageObjects;
import com.uiAutomatiom.pageObejects.FBPeoplePageObjects;

public class FBPeoplePageObjectsVerfication  extends TestBase{

	private final Logger log = LogHelper.getLogger(FBPeoplePageObjectsVerfication.class);
	
	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("FacebookHomePageObjectsVerfication");
	}

	@Test(description = "FacebookHomePageObjectsVerfication")
	public void FacebookHomePageObjectsVerfication() throws Exception {
		System.out.println("ready to execute");
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("its worked");
		
		FBHomePageObjects FacebookPageObj = new FBHomePageObjects(driver);
		
		boolean status =  FacebookPageObj.verifyPeoplelinkonHomePage();
		if (status) {
			test.log(Status.PASS, "People Link is Displayed");
			log.info("People Link  is Displayed " + status);
		
			
			FacebookPageObj.clickPeopleLinkOnHomePage();
			log.info("Clicked  People Link ");

		} else {
			test.log(Status.FAIL, "People Link is not displayed");
			log.info("People Link is not displayed " + status);
		}

	////// Facebook Homepage Objects  Link Checking
	FBPeoplePageObjects  PeoplePageObj = new FBPeoplePageObjects(driver);

	///// Email edit box exist or not  
	status =  PeoplePageObj.verifyPeopleEmailonHomePage();
		if (status) {
			test.log(Status.PASS, "Email is Displayed");
			log.info("Email  is Displayed " + status);
		
			
			PeoplePageObj.enterEmailOnPeoplePage();
			log.info("enter  Email ");

		} else {
			test.log(Status.FAIL, "Email is not displayed");
			log.info("Email is not displayed " + status);
		}

	///// Password edit box exist or not 
		status =  PeoplePageObj.verifyPasswordEmailonHomePage();
		if (status) {
			test.log(Status.PASS, "Password is Displayed");
			log.info("Password is Displayed " + status);
		
			
			PeoplePageObj.enterPasswordOnPeoplePage();
			log.info("Password  Email ");

		} else {
			test.log(Status.FAIL, "Password is not displayed");
			log.info("Password is not displayed " + status);
		}
		
		Thread.sleep(1000);
		driver.navigate().back();
		log.info("Navigated Back to Facebook Home Page");
		Thread.sleep(4000);
		
		
			String BTitle = driver.getTitle();
			if (BTitle.equalsIgnoreCase("Facebook – log in or sign up")==true) {
				test.log(Status.PASS, "Navigate Back is Successful");
				log.info("Browser Title " + BTitle);
			
				
				FBHomePageObjectsVerfication.FacebookHomePageObjectsVerfication();
				log.info("FaceBook  Details Entered ");

			} else {
				test.log(Status.FAIL, "Navigate Back is not Successful");
				log.info("Browser Title " + BTitle);
			}
		

	}
}
	
	

