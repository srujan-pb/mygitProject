package com.uiAutomatiom.testScript;

import org.testng.annotations.Test;
import java.util.ArrayList;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.uiAutomatiom.TestBase.TestBase;
import com.uiAutomatiom.helper.browerConfigurations.config.ObjectReader;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.helper.window.WindowHelper;
import com.uiAutomatiom.pageObejects.FBHomePageObjects;
import com.uiAutomatiom.pageObejects.FBInstagramPageObjects;
import com.uiAutomatiom.pageObejects.FBHomePageObjects;

public class FBInstagramPageObjectsVerfication extends TestBase{
	
private final Logger log = LogHelper.getLogger(FBInstagramPageObjectsVerfication.class);
	

@BeforeMethod
public void beforeMethod() {
	System.out.println("FBInstagramPageObjectsVerfication");
}

@Test(description = "FBInstagramPageObjectsVerfication")
public void FacebookHomePageObjectsVerfication() throws Exception {
	System.out.println("ready to execute");
	getApplicationUrl(ObjectReader.reader.getUrl());
	System.out.println("its worked");

////// Facebook Homepage Objects  Link Checking
FBHomePageObjects  FaceBookPageObj = new FBHomePageObjects(driver);

///// Click on Instagram Link on Home Page
boolean status =  FaceBookPageObj.verifyInstagramLinkOnHomePage();
	if (status) {
		test.log(Status.PASS, "Instagram is Displayed");
		log.info("Instagram  is Displayed " + status);
	
		
		FaceBookPageObj.clickInstagramLinkOnHomePage();
		log.info("clicked  Instagram ");

	} else {
		test.log(Status.FAIL, "Instagram  is not displayed");
		log.info("Instagram   is not displayed " + status);
	}
	
	////////working with multiple tabs
	ArrayList<String> mytabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(mytabs.get(1));
	//WindowHelper.switchToTabsUsingIndex(1);
	
	log.info("Switched to Instagram Window");
	
	
/// Facebook Instagram Object Verification
	FBInstagramPageObjects InstagramPageObj = new FBInstagramPageObjects(driver);
	
///// Enter Email on Instagram  Page
	status =  InstagramPageObj.verifyEmailOnInstagramPage();
	if (status) {
		test.log(Status.PASS, "Email is Displayed");
		log.info("Email  is Displayed " + status);
	
		
		InstagramPageObj.enterEmailOnPeoplePage();
		log.info("Entered  Email ");

	} else {
		test.log(Status.FAIL, "Email  is not displayed");
		log.info("Email   is not displayed " + status);
	}
	
///// Enter Full Name on Instagram  Page
	status =  InstagramPageObj.verifyFullNameOnInstagramPage();
	if (status) {
		test.log(Status.PASS, "Full Name is Displayed");
		log.info("Full Name  is Displayed " + status);
	
		
		InstagramPageObj.enterFullNameOnPeoplePage();
		log.info("Entered  Full Name ");

	} else {
		test.log(Status.FAIL, "Full Name  is not displayed");
		log.info("Full Name is not displayed " + status);
	}
///// Enter Username on Instagram  Page
	status =  InstagramPageObj.verifyUserNameOnInstagramPage();
	if (status) {
		test.log(Status.PASS, "Username is Displayed");
		log.info("Username is Displayed " + status);
	
		
		InstagramPageObj.enterUserNameOnPeoplePage();
		log.info("Entered  Username ");

	} else {
		test.log(Status.FAIL, "Username  is not displayed");
		log.info("Username is not displayed " + status);
	}
	
///// Enter Password on Instagram  Page
	status =  InstagramPageObj.verifyPasswordOnInstagramPage();
	if (status) {
		test.log(Status.PASS, "Password is Displayed");
		log.info("Password is Displayed " + status);
	
		
		InstagramPageObj.enterPasswordOnPeoplePage();
		log.info("Entered  Password ");

	} else {
		test.log(Status.FAIL, "Password is not displayed");
		log.info("Password is not displayed " + status);
	}
	
	
	driver.switchTo().window(mytabs.get(0));
	log.info("Switched to Facebook Home Page");
	
	
	Thread.sleep(2000);
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