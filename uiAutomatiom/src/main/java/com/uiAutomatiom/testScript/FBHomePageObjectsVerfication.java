package com.uiAutomatiom.testScript;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.beust.jcommander.Parameter;
import com.uiAutomatiom.TestBase.TestBase;
import com.uiAutomatiom.helper.browerConfigurations.config.ObjectReader;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.pageObejects.FBHomePageObjects;

public class FBHomePageObjectsVerfication extends TestBase {

	private final static Logger log = LogHelper.getLogger(FBHomePageObjectsVerfication.class);

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("FacebookHomePageObjectsVerfication");
	}

	@Test(description = "Facebook HomePage Objects Verfication")
	public static void FacebookHomePageObjectsVerfication() throws Exception {
		System.out.println("ready to execute");
		getApplicationUrl(ObjectReader.reader.getUrl());
		System.out.println("its worked");

	////// Facebook Homepage Objects  Link Checking
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
			
			
			
			
/*
		///// Programme Link Verification

		status = workItems.verifyProgramme();
		if (status) {
			test.log(Status.PASS, "Programme Link is Displayed");
			log.info("Programme Link is Displayed " + status);

		} else {
			test.log(Status.FAIL, "Programme Link is Not displayed");
			log.info("Programme Link is not displayed " + status);
		}

		///// Administration Link Verification

		status = workItems.verifyAdministration();
		if (status) {
			test.log(Status.PASS, "Administration Link is Displayed");
			log.info("Administration Link is Displayed " + status);
			workItems.clickAdministration();
			log.info("click on Administration");

		} else {
			test.log(Status.FAIL, "Administration Link is Not displayed");
			log.info("Administration Link is not displayed " + status);
		}

		///// Commercial Link Verification

		status = workItems.verifyCommercial();
		if (status) {
			test.log(Status.PASS, "Commercial Link is Displayed");
			log.info("Commercial Link is Displayed " + status);
			workItems.clickCommercial();
			log.info("click on Commercial");

		} else {
			test.log(Status.FAIL, "Commercial Link is Not displayed");
			log.info("Commercial Link is not displayed " + status);
		}

		///// RCTI Link Verification

		status = workItems.verifyRCTI();
		if (status) {
			test.log(Status.PASS, "RCTI Link is Displayed");
			log.info("RCTI Link is Displayed " + status);
			workItems.clickRCTI();
			log.info("click on RCTI");

		} else {
			test.log(Status.FAIL, "RCTI Link is Not displayed");
			log.info("RCTI Link is not displayed " + status);
		}
		///// HSEQ Link Verification

		status = workItems.verifyHSEQ();
		if (status) {
			test.log(Status.PASS, "HSEQ Link is Displayed");
			log.info("HSEQ Link is Displayed " + status);
			workItems.clickHSEQ();
			log.info("click on HSEQ");

		} else {
			test.log(Status.FAIL, "HSEQ Link is Not displayed");
			log.info("HSEQ Link is not displayed " + status);
		}

		///// Delivery Partners Link Verification

		status = workItems.verifyDeliveryPartners();
		if (status) {
			test.log(Status.PASS, "Delivery Partners Link is Displayed");
			log.info("Delivery Partners Link is Displayed " + status);
			workItems.clickDeliveryPartners();
			log.info("click on Delivery Partners");

		} else {
			test.log(Status.FAIL, "Delivery Partners Link is Not displayed");
			log.info("Delivery Partners Link is not displayed " + status);
		}

		///// Schedule Of Rates Link Verification

		status = workItems.verifyScheduleOfRates();
		if (status) {
			test.log(Status.PASS, "Schedule Of Rates  Link is Displayed");
			log.info("Schedule Of Rates  Link is Displayed " + status);
			workItems.clickScheduleOfRates();
			log.info("click on Schedule Of Rates ");

		} else {
			test.log(Status.FAIL, "Schedule Of Rates  Link is Not displayed");
			log.info("Schedule Of Rates  Link is not displayed " + status);
		}

		///// Scheduling Link Verification

		status = workItems.verifyScheduling();
		if (status) {
			test.log(Status.PASS, "Scheduling  Link is Displayed");
			log.info("Scheduling   Link is Displayed " + status);
			workItems.clickScheduling();
			log.info("click on Scheduling ");

		} else {
			test.log(Status.FAIL, "Scheduling Link is Not displayed");
			log.info("Scheduling Link is not displayed " + status);
		}

		///// Materials Link Verification

		status = workItems.verifyMaterials();
		if (status) {
			test.log(Status.PASS, "Materials  Link is Displayed");
			log.info("Materials   Link is Displayed " + status);
			workItems.clickMaterials();
			log.info("click on Materials ");
			test.log(Status.PASS, "click on Materials ");

		} else {
			test.log(Status.FAIL, "Materials Link is Not displayed");
			log.info("Materials Link is not displayed " + status);
		}
		
		
		///// Survey Link Verification

		status = workItems.verifySurvey();
		if (status) {
			test.log(Status.PASS, "Survey  Link is Displayed");
			log.info("Survey   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "Survey Link is Not displayed");
			log.info("Survey Link is not displayed " + status);
		}
		
		///// Design Link Verification

		status = workItems.verifyDesign();
		if (status) {
			test.log(Status.PASS, "Design  Link is Displayed");
			log.info("Design   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "Design Link is Not displayed");
			log.info("Design Link is not displayed " + status);
		}
		
		///// Construction Link Verification

		status = workItems.verifyConstruction();
		if (status) {
			test.log(Status.PASS, "Construction  Link is Displayed");
			log.info("Construction   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "Construction Link is Not displayed");
			log.info("Construction Link is not displayed " + status);
		}
		
		
		///// Completions Link Verification

		status = workItems.verifyCompletions();
		if (status) {
			test.log(Status.PASS, "Completions  Link is Displayed");
			log.info("Completions   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "Completions Link is Not displayed");
			log.info("Completions Link is not displayed " + status);
		}
		
		
		
		///// Defects Link Verification

		status = workItems.verifyDefects();
		if (status) {
			test.log(Status.PASS, "Defects  Link is Displayed");
			log.info("Defects   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "Defects Link is Not displayed");
			log.info("Defects Link is not displayed " + status);
		}
		
		
		///// Variations Link Verification

		status = workItems.verifyVariations();
		if (status) {
			test.log(Status.PASS, "Variations  Link is Displayed");
			log.info("Variations   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "Variations Link is Not displayed");
			log.info("Variations Link is not displayed " + status);
		}
		
		
		///// B2B Link Verification

		status = workItems.verifyB2B();
		if (status) {
			test.log(Status.PASS, "B2B  Link is Displayed");
			log.info("B2B   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "B2B Link is Not displayed");
			log.info("B2B Link is not displayed " + status);
		}
		
		
		///// Consent Link Verification

		status = workItems.verifyConsent();
		if (status) {
			test.log(Status.PASS, "Consent  Link is Displayed");
			log.info("Consent   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "Consent Link is Not displayed");
			log.info("Consent Link is not displayed " + status);
		}
		
		
		///// LIFD Link Verification

		status = workItems.verifyLIFD();
		if (status) {
			test.log(Status.PASS, "LIFD  Link is Displayed");
			log.info("LIFD   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "LIFD Link is Not displayed");
			log.info("LIFD Link is not displayed " + status);
		}
		
		///// Quality Inspections Link Verification

		status = workItems.verifyQualityInspections();
		if (status) {
			test.log(Status.PASS, "Quality Inspections  Link is Displayed");
			log.info("Quality Inspections   Link is Displayed " + status);
			
		} else {
			test.log(Status.FAIL, "Quality Inspections Link is Not displayed");
			log.info("Quality Inspections Link is not displayed " + status);
		}
		

		Thread.sleep(5000);

		/// Logout Option
		workItems.clickLogoutOption();
		log.info("Click on Logout Option ");
		workItems.clickLogoutLink();
		log.info("Click on Logout Link ");
		Thread.sleep(1000);

	}
}

public class FacebookHomePageObjectsVerfication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub */

	}

}
