package com.uiAutomatiom.pageObejects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiAutomatiom.helper.assertions.VerificationHelper;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.helper.wait.WaitHelper;

public class continuePage {
	private static Logger log = LogHelper.getLogger(continuePage.class);
	public static WebDriver driver ;
	public static WaitHelper waitHelper;
	
	 ////Continue  button 
		@FindBy (xpath="html/body/div[2]/div/div[5]/div/button")
		WebElement button_Continue;
		
	
	public continuePage(WebDriver driver)
			{
		PageFactory.initElements(driver, this);
		
		
			}
	
	///Object Verification 
	VerificationHelper vhObjects = new VerificationHelper(driver);

	public void clickOnContinueButton() {
		button_Continue.click();

	}
	public WorkItemsPageObjects successfullyOpenContinuePage() {
		
		return new WorkItemsPageObjects(driver);

	}

	/// verify Application Login Link
	public boolean verifyContinueButton() {
		boolean status = vhObjects.isDisplayed(button_Continue);
		return status;
	}

	
	public void clickContinueButton(){
		button_Continue.click();
	}
	

}
