package com.uiAutomatiom.testScript;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.uiAutomatiom.TestBase.TestBase;
import com.uiAutomatiom.helper.browerConfigurations.config.ObjectReader;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.pageObejects.FBHomePageObjects;
import com.uiAutomatiom.pageObejects.FBSignUpPageObject;
import com.uiAutomatiom.pageObejects.OpenPage;
import com.uiAutomatiom.pageObejects.WorkItemsPageObjects;
import com.uiAutomatiom.pageObejects.continuePage;

public class FBSignUpPageObjectsVerification  extends TestBase {
	
	private final Logger log = LogHelper.getLogger(FBSignUpPageObjectsVerification.class);
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("FBSignUpPageObjectsVerification before method");
	}
	
	@Test(description= "FBSignUpPageObjectsVerification")
	public void  LoginTest() throws Exception{
		System.out.println("ready to execute");
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("its worked");

	////// Facebook Sign Up Test Objects  Link Checking
	FBHomePageObjects  FaceBookPageObj = new FBHomePageObjects(driver);

	///// firstname edit box exist or not  
	boolean status =  FaceBookPageObj.verifyFirstNameonHomePage();
		if (status) {
			test.log(Status.PASS, "Firstname is Displayed");
			log.info("Firstname  is Displayed " + status);
		
			
			FaceBookPageObj.enterFirstNameOnHomePage();
			log.info("enter  firstname ");

		} else {
			test.log(Status.FAIL, "Firstname  is not displayed");
			log.info("Firstname   is not displayed " + status);
		}

		
		///// lastname edit box exist or not  

		 status =  FaceBookPageObj.verifyLastNameonHomePage();
		if (status) {
			test.log(Status.PASS, "Lastname is Displayed");
			log.info("Lastname  is Displayed " + status);
		
			
			FaceBookPageObj.enterLastNameOnHomePage();
			log.info("enter  Lastname ");

		} else {
			test.log(Status.FAIL, "Lastname  is not displayed");
			log.info("Lastname   is not displayed " + status);
		}
		
		/// Email Edit Box Exist or not
		 status =  FaceBookPageObj.verifyEmailonHomePage();
			if (status) {
				test.log(Status.PASS, "Email is Displayed");
				log.info("Email  is Displayed " + status);
			
				
				FaceBookPageObj.enterRegEmailOnHomePage();
				log.info("enter  Email ");

			} else {
				test.log(Status.FAIL, "Email  is not displayed");
				log.info("Email   is not displayed " + status);
			}
			
			
			Thread.sleep(1000);
			
			/// Retype Edit Box Exist or not
			status =  FaceBookPageObj.verifyReTypeEmailonHomePage();
			if (status) {
				test.log(Status.PASS, "ReType Email is Displayed");
				log.info("ReType Email  is Displayed " + status);
			
				
				FaceBookPageObj.enterReTypeEmailOnHomePage();
				log.info("enter  ReType Email ");

			} else {
				test.log(Status.FAIL, "ReType Email  is not displayed");
				log.info("ReType Email   is not displayed " + status);
			}
			
			
			/// Password Edit Box Exist or not
			status =  FaceBookPageObj.verifyPasswordonHomePage();
			if (status) {
				test.log(Status.PASS, "Password is Displayed");
				log.info("Password is Displayed " + status);
			
				
				FaceBookPageObj.enterRegEmailOnHomePage();
				log.info("enter  Password ");

			} else {
				test.log(Status.FAIL, "Password is not displayed");
				log.info("Password is not displayed " + status);
			}
			
			
			///select day  
			status =  FaceBookPageObj.verifyBirthDayonHomePage();
			if (status) {
				test.log(Status.PASS, "Day is Displayed");
				log.info("Day is Displayed " + status);
			
				
				FaceBookPageObj.selectBirthDayOnHomePage();
				log.info("Selected Day ");

			} else {
				test.log(Status.FAIL, "Day is not displayed");
				log.info("Day is not displayed " + status);
			}
			
			
			/// Select Month
			status =  FaceBookPageObj.verifyBirthMonthonHomePage();
			if (status) {
				test.log(Status.PASS, "Month is Displayed");
				log.info("Month is Displayed " + status);
			
				
				FaceBookPageObj.selectBirthMonthOnHomePage();
				log.info("Selected  Month ");

			} else {
				test.log(Status.FAIL, "Month is not displayed");
				log.info("Month is not displayed " + status);
			}
			
			
			///Select Year
			status =  FaceBookPageObj.verifyBirthYearonHomePage();
			if (status) {
				test.log(Status.PASS, "Year is Displayed");
				log.info("Year is Displayed " + status);
			
				
				FaceBookPageObj.selectBirthYearOnHomePage();
				log.info("Selected  Year ");

			} else {
				test.log(Status.FAIL, "Year is not displayed");
				log.info("Year is not displayed " + status);
			}
		
		
		
	}
		
		
		
	
	

}
