package com.uiAutomatiom.pageObejects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.uiAutomatiom.helper.assertions.VerificationHelper;
import com.uiAutomatiom.helper.browerConfigurations.config.ObjectReader;
import com.uiAutomatiom.helper.excel.ExcelHelper;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.helper.select.DropDownHelper;
import com.uiAutomatiom.helper.wait.WaitHelper;
import com.uiAutomatiom.helper.window.WindowHelper;

public class FBHomePageObjects {

	private static Logger log = LogHelper.getLogger(FBHomePageObjects.class);
	public static WebDriver driver;
	public static WaitHelper waitHelper;
	
	
	//*********************Facebook Homa Page Objects *********************//
	
	/// Facebook Logo
	@FindBy(xpath = "//*[@id=\'blueBarDOMInspector\']/div/div/div/div[1]/h1/a/i")
	WebElement facebookLogoImg ;
	
	/// Facebook login user or phone
	@FindBy(name = "email")
	WebElement facebookLogingUserEditButton;
	
	/// Facebook login password
	@FindBy(name = "pass")
	WebElement facebookLoginPassEditButton;
	
	/// Facebook login submit
	@FindBy(xpath = "//*[@id=\'u_0_a\']")
	WebElement facebookLoginSubmitButton;
	

	//// Forgot link  
	@FindBy(linkText = "Forgotten account?")
	WebElement ForgotLinkOnHomePage;
	
	//// Facebook Sign up - Firstname 
	@FindBy(name = "firstname")
	WebElement FirstnameOnHomePage;
	

	//// Facebook Sign up - Lastname 
	@FindBy(name = "lastname")
	WebElement LastnameOnHomePage;
	
	/// Facebook Sign up - Email or Phone
	@FindBy(name = "reg_email__")
	WebElement regEmailOnHomePage;
	
	/// Facebook Sign up - Re-Type Email
	@FindBy(name = "reg_email_confirmation__")
	WebElement regReTypeEmailOnHomePage;
	
	/// Facebook Sign up - New Password
	@FindBy(name = "reg_passwd__")
	WebElement regPasswordOnHomePage;
	
	/// Facebook Sign up - Birth Day
	@FindBy(name = "birthday_day")
	WebElement birthDayOnHomePage;
	
	/// Facebook Sign up - Birth Month
	@FindBy(name = "birthday_month")
	WebElement birthMonthOnHomePage;
	
	/// Facebook Sign up - Birth Year
	@FindBy(name = "birthday_year")
	WebElement birthYearOnHomePage;
	
	/// Facebook Sign Up - Gender - Female
	@FindBy(xpath = "//input[@type = '1']")
	WebElement genderFemaleOnHomePage;

	/// Facebook Sign Up - Gender - Male
	@FindBy(xpath = "//input[@type = '2']")
	WebElement gendermaleOnHomePage;
	
	/// Facebook Sign Up - Gender - Custom
	@FindBy(xpath = "//input[@type = '-1']")
	WebElement genderCustomOnHomePage;
	
	/// Facebook Sign Up - Footer Link - People
	@FindBy(xpath = "//*[@id=\'js_0\']/ul/li[6]/a")
	WebElement peoplelinkonHomePage;
	
	/// Facebook Sign Up - Footer Link - Instagram
	@FindBy(xpath = "//*[@id=\'js_0\']/ul/li[16]/a")
	WebElement instagramLinkonHomePage;
		
		
	
	
	

	public FBHomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.pageloadTimeOut(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
	
	}

	////Object verification and  Operation of Homepage 
	
	//////enter Firstname   
	public void enterFirstNameOnHomePage() {
		FirstnameOnHomePage.clear();
		FirstnameOnHomePage.sendKeys(("tester").toUpperCase());
	}
///// Firstname  on HomePage 
	public boolean verifyFirstNameonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(FirstnameOnHomePage);
		return status;
	}	
	
	///// verify lastname  on HomePage 
	public boolean verifyLastNameonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(LastnameOnHomePage);
		return status;
	}
	
//////enter Lastname  
	public void enterLastNameOnHomePage() {
		LastnameOnHomePage.clear();
		LastnameOnHomePage.sendKeys(("manager").toUpperCase());
	}
	
///// verify Sign Up - Email on HomePage 
	public boolean verifyEmailonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(regEmailOnHomePage);
		return status;
	}
	
//////enter Sign Up Email  
	public void enterRegEmailOnHomePage() {
		regEmailOnHomePage.clear();
		regEmailOnHomePage.sendKeys(("Test@gmail.com").toUpperCase());
	}
		
///// verify Sign Up - Email on HomePage 
	public boolean verifyReTypeEmailonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(regReTypeEmailOnHomePage);
		return status;
	}
	
//////enter Sign Up - Email  
	public void enterReTypeEmailOnHomePage() {
		regReTypeEmailOnHomePage.clear();
		regReTypeEmailOnHomePage.sendKeys(("Test@gmail.com").toUpperCase());
	}
	
///// verify Sign Up - New Password on HomePage 
	public boolean verifyPasswordonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(regPasswordOnHomePage);
		return status;
	}
	
//////enter Sign Up - New Password on HomePage  
	public void enterPasswordOnHomePage() {
		regPasswordOnHomePage.clear();
		regPasswordOnHomePage.sendKeys(("Test@123").toUpperCase());
	}
	
///// verify Sign Up - Birth Day on HomePage 
	public boolean verifyBirthDayonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(birthDayOnHomePage);
		return status;
	}
	
//////Select Sign Up - Birth Day on HomePage
	public void selectBirthDayOnHomePage() {
	
		////select by index  
	DropDownHelper.selectUsingIndex(birthDayOnHomePage, 5);		
		
	}
	
///// verify Sign Up - Birth Day on HomePage 
	public boolean verifyBirthMonthonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(birthMonthOnHomePage);
		return status;
	}
	
//////Select Sign Up - Birth Month on HomePage
	public void selectBirthMonthOnHomePage() {
		DropDownHelper.selectUsingValue(birthMonthOnHomePage, "8");
		
		
	}
///// verify Sign Up - Birth Day on HomePage 
	public boolean verifyBirthYearonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(birthYearOnHomePage);
		return status;
	}
	
//////Select Sign Up - Birth Year on HomePage
	public void selectBirthYearOnHomePage() {
		DropDownHelper.selectUsingValue(birthYearOnHomePage, "1992");
	}
	
///// verify People Link on HomePage 
	public void clickPeopleLinkOnHomePage() {
		
		peoplelinkonHomePage.click();
	}
//////Click People Link on HomePage  
	public boolean verifyPeoplelinkonHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(peoplelinkonHomePage);
		return status;
	}
	
	
///// verify Instagram Link on HomePage 
	public boolean verifyInstagramLinkOnHomePage() {
		boolean status = new VerificationHelper(driver).isDisplayed(instagramLinkonHomePage);
		return status;
	}
	///Click Instagram Link on HomePage 
	public void clickInstagramLinkOnHomePage() {
		instagramLinkonHomePage.click();
	}
	/// Switch Windows 
	public void switchToWindow(int WCount) {
		 WindowHelper.switchToWindow(WCount);
	
	}
}
