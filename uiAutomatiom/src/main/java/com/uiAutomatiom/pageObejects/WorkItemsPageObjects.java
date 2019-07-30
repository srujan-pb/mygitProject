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

public class WorkItemsPageObjects {

	private static Logger log = LogHelper.getLogger(FBSignUpPageObject.class);
	private WebDriver driver;
	WaitHelper waitHelper;
	
	/////////Page Objects Define 

	//// Programme link
	@FindBy(linkText = "Programme")
	WebElement link_Programme;

	//// sites and jobs link
	@FindBy(linkText = "Sites and Jobs")
	WebElement link_SitesandJobs;

	//// RCTI link
	@FindBy(linkText = "RCTI")
	WebElement link_RCTI;

	//// Scheduling link
	@FindBy(linkText = "Scheduling")
	WebElement link_Scheduling;

	//// Commercial link
	@FindBy(linkText = "Commercial")
	WebElement link_Commercial;

	//// Administration link
	@FindBy(linkText = "Administration")
	WebElement link_Administration;


	//// Survey link
	@FindBy(linkText = "Survey")
	WebElement link_Survey;

	//// Design link
	@FindBy(linkText = "Design")
	WebElement link_Design;

	//// Construction link
	@FindBy(linkText = "Construction")
	WebElement link_Construction;

	//// Completions link
	@FindBy(linkText = "Completions")
	WebElement link_Completions;

	//// Defects link
	@FindBy(linkText = "Defects")
	WebElement link_Defects;

	//// Variations link
	@FindBy(linkText = "Variations")
	WebElement link_Variations;

	//// B2B link
	@FindBy(linkText = "B2B")
	WebElement link_B2B;

	//// Consent link
	@FindBy(linkText = "Consent")
	WebElement link_Consent;

	//// LIFD link

	@FindBy(linkText = "LIFD")
	WebElement link_LIFD;

	//// Quality Inspections link
	@FindBy(linkText = "Quality Inspections")
	WebElement link_QualityInspections;

	//// HSEQ link
	@FindBy(linkText = "HSEQ")
	WebElement link_HSEQ;

	//// Delivery Partners link

	@FindBy(linkText = "Delivery Partners")
	WebElement link_DeliveryPartners;

	//// Schedule of Rates link

	@FindBy(linkText = "Schedule of Rates")
	WebElement link_ScheduleOfRates;

	//// Materials link

	@FindBy(linkText = "Materials")
	WebElement link_Materials;

	////// Logout Option
	@FindBy(xpath = "html/body/div[2]/nav/div/div/div[4]/div[2]/div/button[2]")
	WebElement LogoutOption;
	
	//////Logout Option On Sub Page
	@FindBy(xpath = "html/body/div[2]/div/nav/div/div/div[4]/div[2]/div/button[2]/span")
	WebElement LogoutOptionOnSubPage;
	
	

	//// Logout Link
	@FindBy(linkText = "Log out")
	WebElement LogoutLink;

	//////// Sites and Jobs sub links

	////Dashboard link 
	@FindBy(linkText = "Dashboard")
	WebElement DashBoard_Link_SitesAndJobs;

	//// Site Search link
	@FindBy(linkText = "Site Search")
	WebElement SiteSearch_Link_SitesAndJobs;

	//// Job Search link
	@FindBy(linkText = "Job Search")
	WebElement JobSearch_Link_SitesAndJobs;

	//// Reporting link
	@FindBy(linkText = "Reporting")
	WebElement Reporting_Link_SitesAndJobs;

	//////// Commercial Page Objects

	//// Dashboard link
	@FindBy(linkText = "Dashboard")
	WebElement DashBoard_Link_Commercial;

	//// Awaiting Claim Condition link
	@FindBy(linkText = "Awaiting Claim Condition")
	WebElement AwaitingClaimCondition_Link_Commercial;

	//// Awaiting Claim link
	@FindBy(linkText = "Awaiting Claim")
	WebElement AwaitingClaim_Link_Commercial;

	//// Commercial Held link
	@FindBy(linkText = "Commercial Held")
	WebElement CommercialHeld_Link_Commercial;

	//// Claim Preview link
	@FindBy(linkText = "Claim Preview")
	WebElement ClaimPreview_Link_Commercial;

	//// Awaiting Claim Approval link
	@FindBy(linkText = "Awaiting Claim Approval")
	WebElement AwaitingClaimApproval_Link_Commercial;

	//// Approved Claims link
	@FindBy(linkText = "Approved Claims")
	WebElement ApprovedClaims_Link_Commercial;

	//// Awaiting Claim Payment link
	@FindBy(linkText = "Awaiting Claim Payment")
	WebElement AwaitingClaimPayment_Link_Commercial;

	//// Paid Claims link
	@FindBy(linkText = "Paid Claims")
	WebElement PaidClaims_Link_Commercial;

	//// Rejected Claims link
	@FindBy(linkText = "Rejected Claims")
	WebElement RejectedClaims_Link_Commercial;

	//// Write Offs link
	@FindBy(linkText = "Write Offs")
	WebElement WriteOffs_Link_Commercial;

	//// Reports link
	@FindBy(linkText = "Reports")
	WebElement Reports_Link_Commercial;

	//////// RCTI Page Objects

	//// Dashboard link
	@FindBy(linkText = "Dashboard")
	WebElement DashBoard_Link_RCTI;

	//// Awaiting Payment Condition link
	@FindBy(linkText = "Awaiting Payment Condition")
	WebElement AwaitingPaymentCondition_Link_RCTI;

	//// Awaiting Delivery Partner Confirmation link
	@FindBy(linkText = "Awaiting Delivery Partner Confirmation")
	WebElement AwaitingDeliveryPartnerConfirmation_Link_RCTI;

	//// Awaiting Invoice link
	@FindBy(linkText = "Awaiting Invoice")
	WebElement AwaitingInvoice_Link_RCTI;

	//// Invoice Preview link
	@FindBy(linkText = "Invoice Preview")
	WebElement InvoicePreview_Link_RCTI;

	//// Unpaid Invoices link
	@FindBy(linkText = "Unpaid Invoices")
	WebElement UnpaidInvoices_Link_RCTI;

	//// Paid Invoices link
	@FindBy(linkText = "Paid Invoices")
	WebElement PaidInvoices_Link_RCTI;

	////////Administration Page Objects

	//// Dashboard link
	@FindBy(linkText = "Dashboard")
	WebElement DashBoard_Link_Administration;

	////Manage Users link 
	@FindBy(linkText = "Manage Users")
	WebElement ManageUsers_Link_Administration;

	////Manage Companies link 
	@FindBy(linkText = "Manage Companies")
	WebElement ManageCompanies_Link_Administration;

	//// Manage Groups link
	@FindBy(linkText = "Manage Groups")
	WebElement ManageGroups_Link_Administration;

	//// Awaiting Registrations link
	@FindBy(linkText = "Awaiting Registrations")
	WebElement AwaitingRegistrations_Link_Administration;

	////////HSEQ Page Objects

	////Tool box Meetings link

	@FindBy(linkText = "Toolbox Meetings")
	WebElement ToolboxMeetings_Link_HSEQ;

	////Leadership Walks  link 
	@FindBy(linkText = "Leadership Walks")
	WebElement LeadershipWalks_Link_HSEQ;

	//// Safety Observations link
	@FindBy(linkText = "Safety Observations")
	WebElement SafetyObservations_Link_HSEQ;

	//// Environmental Inspection link
	@FindBy(linkText = "Environmental Inspection")
	WebElement EnvironmentalInspection_Link_HSEQ;

	//// Site Inspection link
	@FindBy(linkText = "Site Inspection")
	WebElement SiteInspection_Link_HSEQ;

	////Audit link
	@FindBy(linkText = "Audit")
	WebElement Audit_Link_HSEQ;

	//// Incident - Near Miss link
	@FindBy(linkText = "Incident - Near Miss")
	WebElement Incident_Near_Miss_Link_HSEQ;

	//// Incident - Hazard link
	@FindBy(linkText = "Incident - Hazard")
	WebElement IncidentHazard_Link_HSEQ;

	//// Quality Inspection link
	@FindBy(linkText = "Quality Inspection")
	WebElement QualityInspection_Link_HSEQ;

	//// Alert Management link
	@FindBy(linkText = "Alert Management")
	WebElement AlertManagement_Link_HSEQ;

	////Report link 
	@FindBy(linkText = "Report")
	WebElement Report_Link_HSEQ;

	////////Delivery Partners Page Objects

	////People Dash board link 
	@FindBy(linkText = "People Dashboard")
	WebElement PeopleDashboard_Link_DeliveryPartners;

	////Company Dash board link 

	@FindBy(linkText = "Company Dashboard")
	WebElement CompanyDashboard_Link_DeliveryPartners;

	//// People link
	@FindBy(linkText = "People")
	WebElement People_Link_DeliveryPartners;

	//// Crews link
	@FindBy(linkText = "Crews")
	WebElement Crews_Link_DeliveryPartners;

	//// Companies link
	@FindBy(linkText = "Companies")
	WebElement Companies_Link_DeliveryPartners;

	////////Schedule of Rates Page Objects

	////Dash board link
	@FindBy(linkText = "Dashboard")
	WebElement DashBoard_Link_ScheduleOfRates;

	////Manage link 
	@FindBy(linkText = "Manage")
	WebElement Manage_Link_ScheduleOfRates;

	////Reporting link
	@FindBy(linkText = "Reporting")
	WebElement Reporting_Link_ScheduleOfRates;

	////////Scheduling  Page Objects

	////Schedule Alerts link
	@FindBy(linkText = "Schedule Alerts")
	WebElement ScheduleAlerts_Link_Scheduling;

	////Todays Job link
	@FindBy(linkText = "Todays Job")
	WebElement TodaysJob_Link_Scheduling;

	////Next 7 Days Job link
	@FindBy(linkText = "Next 7 Days Job")
	WebElement Next7DaysJob_Link_Scheduling;

	////Not Scheduled link 
	@FindBy(linkText = "Not Scheduled")
	WebElement NotScheduled_Link_Scheduling;

	////Delayed Sites link 
	@FindBy(linkText = "Delayed Sites")
	WebElement DelayedSites_Link_Scheduling;

	////Missed Jobs link 
	@FindBy(linkText = "Missed Jobs")
	WebElement MissedJobs_Link_Scheduling;

	//// Slipped Jobs link 
	@FindBy(linkText = "Slipped Jobs")
	WebElement SlippedJobs_Link_Scheduling;

	////Sites Calendar link 
	@FindBy(linkText = "Sites Calendar")
	WebElement SitesCalendar_Link_Scheduling;

	////Crews Calendar link 
	@FindBy(linkText = "Crews Calendar")
	WebElement CrewsCalendar_Link_Scheduling;

	////Dashboard link 
	@FindBy(linkText = "Dashboard")
	WebElement Dashboard_Link_Scheduling;

	//// Schedulers View link
	@FindBy(linkText = "Schedulers View")
	WebElement SchedulersView_Link_Scheduling;

	
	
	
	//////// Material Page Objects

	//// Locations link

	@FindBy(linkText = "Locations")
	WebElement Locations_Link_Material;

	//// Products link
	@FindBy(linkText = "Products")
	WebElement Products_Link_Material;

	//// Items link
	@FindBy(linkText = "Items")
	WebElement Items_Link_Material;

	//// Transactions link
	@FindBy(linkText = "Transactions")
	WebElement Transactions_Link_Material;

	//// Purchase Orders link
	@FindBy(linkText = "Purchase Orders")
	WebElement PurchaseOrders_Link_Material;

	public WorkItemsPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.pageloadTimeOut(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
	}
	
	
	///////////////////Click Operation Objects

	//// Sites And Jobs
	public void clickSitesAndJobs() {
		link_SitesandJobs.click();
	}

	/////// DashBoard On Sites And Jobs
	public void clickDashBoardOnSitesAndJobs() {
		DashBoard_Link_SitesAndJobs.click();
	}

	/////// Site Search On Sites And Jobs
	public void clickSiteSearchOnSitesAndJobs() {
		SiteSearch_Link_SitesAndJobs.click();
	}

	/////// Job Search On Sites And Jobs
	public void clickJobSearchOnSitesAndJobs() {
		JobSearch_Link_SitesAndJobs.click();
	}

	/////// Reporting On Sites And Jobs
	public void clickReportigOnSitesAndJobs() {
		Reporting_Link_SitesAndJobs.click();
	}

	//// RCTI link
	public void clickRCTI() {
		link_RCTI.click();
	}

	//// Dash Board On RCTI link
	public void clickDashBoardOnRCTI() {
		DashBoard_Link_RCTI.click();
	}

	//// Awaiting Payment Condition On RCTI link
	public void clickAwaitingPaymentConditionOnRCTI() {
		AwaitingPaymentCondition_Link_RCTI.click();
	}

	//// Awaiting Delivery Partner Confirmation On RCTI link
	public void clickAwaitingDeliveryPartnerConfirmationOnRCTI() {
		AwaitingDeliveryPartnerConfirmation_Link_RCTI.click();
	}

	//// Awaiting Invoice On RCTI link
	public void clickAwaitingInvoiceOnRCTI() {
		AwaitingInvoice_Link_RCTI.click();
	}

	//// Invoice Preview On RCTI link
	public void clickInvoicePreviewOnRCTI() {
		InvoicePreview_Link_RCTI.click();
	}

	//// Unpaid Invoice On RCTI link
	public void clickUnpaidInvoicesOnRCTI() {
		UnpaidInvoices_Link_RCTI.click();
	}

	//// Paid Invoice On RCTI link
	public void clickPaidInvoicesOnRCTI() {
		PaidInvoices_Link_RCTI.click();
	}

	//// Scheduling link
	public void clickScheduling() {
		link_Scheduling.click();
	}
	
	////Scheduling Alerts on Scheduling link
	public void clickSchedualingAlertsOnScheduling() {
		ScheduleAlerts_Link_Scheduling.click();		
	}
	
	////Todays Job on Scheduling link
	public void clickTodaysJobOnScheduling() {
		TodaysJob_Link_Scheduling.click();		
	}

	////Next 7 days Jobs on Scheduling link
	public void clickNext7DaysJobsOnScheduling() {
		Next7DaysJob_Link_Scheduling.click();		
	}
	
	////Not Scheduled on Scheduling link
	public void clickNotScheduledOnScheduling() {
		NotScheduled_Link_Scheduling.click();		
	}
	
	////Delayed Sites on Scheduling link
	public void clickDelayedSitesOnScheduling() {
		DelayedSites_Link_Scheduling.click();		
	}
	
	////Missed Jobs on Scheduling link
	public void clickMissedJobsOnScheduling() {
		MissedJobs_Link_Scheduling.click();		
	}
	
	////Slipped Jobs on Scheduling link
	public void clickSlippedJobsOnScheduling() {
		SlippedJobs_Link_Scheduling.click();		
	}
	////Sites Calendar on Scheduling link
	public void clickSitesCalendarOnScheduling() {
		SitesCalendar_Link_Scheduling.click();		
	}
	////Crews Calendar on Scheduling link
	public void clickCrewsCalendarOnScheduling() {
		CrewsCalendar_Link_Scheduling.click();		
	}
	
	////Dash Board on Scheduling link
	public void clickDashBoardOnScheduling() {
		Dashboard_Link_Scheduling.click();		
	}
	
	////Schedulers View on Scheduling link
	public void clickSchedulersViewOnScheduling() {
		SchedulersView_Link_Scheduling.click();		
	}
	

	//// Commercial link
	public void clickCommercial() {
		link_Commercial.click();
	}

	/////// DashBoard On Commercial
	public void clickDashBoardOnCommercial() {
		DashBoard_Link_Commercial.click();
	}

	/////// Awaiting Claim Condition On Commercial
	public void clickAwaitingClaimConditionOnCommercial() {
		AwaitingClaimCondition_Link_Commercial.click();
	}

	/////// Awaiting Claim On Commercial
	public void clickAwaitingClaimOnCommercial() {
		AwaitingClaim_Link_Commercial.click();
	}

	/////// Commercial Held On Commercial
	public void clickCommercialHeldOnCommercial() {
		CommercialHeld_Link_Commercial.click();
	}

	/////// Claim Preview On Commercial
	public void clickClaimPreviewOnCommercial() {
		ClaimPreview_Link_Commercial.click();
	}

	/////// Awaiting Claim Approval On Commercial
	public void clickAwaitingClaimApprovalOnCommercial() {
		AwaitingClaimApproval_Link_Commercial.click();
	}

	/////// Approved Claim On Commercial
	public void clickApprovedClaimsOnCommercial() {
		ApprovedClaims_Link_Commercial.click();
	}

	/////// Awaiting Claim Payment On Commercial
	public void clickAwaitingCliamPaymentOnCommercial() {
		AwaitingClaimPayment_Link_Commercial.click();
	}

	/////// Paid Claims On Commercial
	public void clickPaidCliamsOnCommercial() {
		AwaitingClaimPayment_Link_Commercial.click();
	}

	/////// Rejected Claims On Commercial
	public void clickRejectedCliamsOnCommercial() {
		RejectedClaims_Link_Commercial.click();
	}

	/////// Write Offs On Commercial
	public void clickWriteOffsOnCommercial() {
		WriteOffs_Link_Commercial.click();
	}

	/////// Reports On Commercial
	public void clickReportsOnCommercial() {
		Reports_Link_Commercial.click();
	}

	//// Administration link
	public void clickAdministration() {
		link_Administration.click();
	}
	
	////DashBoard on Administration link
	public void clickDashBoardOnAdministration() {
		DashBoard_Link_Administration.click();
	}
	
	////Manage Users on Administration link
	public void clickManageUsersOnAdministration() {
		ManageUsers_Link_Administration.click();
	}
	
	
	////Manage Companies on Administration link
	public void clickManageCompaniesOnAdministration() {
		ManageCompanies_Link_Administration.click();
	}

	////Manage Groups on Administration link
	public void clickManageGroupsOnAdministration() {
		ManageGroups_Link_Administration.click();
	}
	
	////Awaiting Registration on Administration link
	public void clickAwaitingRegistrationOnAdministration() {
		AwaitingRegistrations_Link_Administration.click();
	}
	
	

	//// Programme link
	public void clickProgramme() {
		link_Programme.click();
	}

	//// Survey link
	public void clickSurvey() {
		link_Survey.click();
	}

	//// Design link
	public void clickDesign() {
		link_Design.click();
	}

	//// Construction link
	public void clickConstruction() {
		link_Construction.click();
	}

	//// Completions link

	public void clickCompletions() {
		link_Completions.click();
	}

	//// Defects link
	public void clickDefects() {
		link_Defects.click();
	}

	//// Variations link

	public void clickVariations() {
		link_Variations.click();
	}

	//// B2B link
	public void clickB2B() {
		link_B2B.click();
	}

	//// Consent link
	public void clickConsent() {
		link_Consent.click();
	}

	//// LIFD link
	public void clickLIFD() {
		link_LIFD.click();
	}

	//// Quality Inspections link
	public void clickQualityInspections() {
		link_QualityInspections.click();
	}

	//// HSEQ link
	public void clickHSEQ() {
		link_HSEQ.click();
	}
	
	////ToolBox Meetings on HSEQ link
	public void clickToolBoxMeetingsOnHSEQ() {
		ToolboxMeetings_Link_HSEQ.click();
	}
	////Leadership Walks on HSEQ link
	public void clickLeadershipWalksOnHSEQ() {
		LeadershipWalks_Link_HSEQ.click();
	}
	////Safety Observations on HSEQ link
	public void clickSafetyObservationsOnHSEQ() {
		SafetyObservations_Link_HSEQ.click();
	}
	////Environmental Inspection on HSEQ link
	public void clickEnvironmentalInspectionOnHSEQ() {
		EnvironmentalInspection_Link_HSEQ.click();
	}

	////Site Inspection on HSEQ link
	public void clickSiteInspectionOnHSEQ() {
		SiteInspection_Link_HSEQ.click();
	}
	////Audit on HSEQ link
	public void clickAuditOnHSEQ() {
		Audit_Link_HSEQ.click();
	}
	////Incident -Near Miss On HSEQ link
	public void clickIncidentNearMissOnHSEQ() {
		Incident_Near_Miss_Link_HSEQ.click();
	}

	////Incident Hazard On HSEQ link
	public void clickIncidentHazardOnHSEQ() {
		IncidentHazard_Link_HSEQ.click();
	}

	////Quality Inspection On HSEQ link
	public void clickQualityInspectionOnHSEQ() {
		QualityInspection_Link_HSEQ.click();
	}


	////Alert Management On HSEQ link
	public void clickAlertManagementOnHSEQ() {
		AlertManagement_Link_HSEQ.click();
	}


	////Report On HSEQ link
	public void clickReportOnHSEQ() {
		Report_Link_HSEQ.click();
	}

	//// Delivery Partners link
	public void clickDeliveryPartners() {
		link_DeliveryPartners.click();
	}

	//// People DashBoard on Delivery Partners link
	public void clickPeopleDashBoardOnDeliveryPartners() {
		PeopleDashboard_Link_DeliveryPartners.click();
	}

	//// Company DashBoard on Delivery Partners link
	public void clickCompanyDashBoardOnDeliveryPartners() {
		CompanyDashboard_Link_DeliveryPartners.click();
	}

	//// People on Delivery Partners link
	public void clickPeopleOnDeliveryPartners() {
		People_Link_DeliveryPartners.click();
	}


	//// Crews on Delivery Partners link
	public void clickCrewsOnDeliveryPartners() {
		Crews_Link_DeliveryPartners.click();
	}


	//// Companies on Delivery Partners link
	public void clickCompaniesOnDeliveryPartners() {
		Companies_Link_DeliveryPartners.click();
	}

	//// Schedule of Rates link
	public void clickScheduleOfRates() {
		link_ScheduleOfRates.click();
	}
	
	////DashBoard on Schedule of Rates link
	public void clickDashBoardOnScheduleOfRates() {
		DashBoard_Link_ScheduleOfRates.click();
	}
	
	////Manage on Schedule of Rates link
	public void clickManageOnScheduleOfRates() {
		Manage_Link_ScheduleOfRates.click();
	}

	
	////Reporting on Schedule of Rates link
	public void clickReportingOnScheduleOfRates() {
		Reporting_Link_ScheduleOfRates.click();
	}

	//// Materials link
	public void clickMaterials() {
		link_Materials.click();
	}
	
	////Locations on Materials link
	public void clickLocationsOnMaterials() {
		Locations_Link_Material.click();
	}
	////Products on Materials link
	public void clickProductsOnMaterials() {
		Products_Link_Material.click();
	}
	////Items on Materials link
	public void clickItemsOnMaterials() {
		Items_Link_Material.click();
	}
	////Transactions on Materials link
	public void clickTransactionsOnMaterials() {
		Transactions_Link_Material.click();
	}
	////Purchase Orders on Materials link
	public void clickPurchaseOrdersOnMaterials() {
		PurchaseOrders_Link_Material.click();
	}

	//// Logout Option link
	public void clickLogoutOption() {
		LogoutOption.click();
	}
	
	////Logout Option link on Sub page
	public void clickLogoutOptionOnSubPage() {
		LogoutOptionOnSubPage.click();
	}

	//// Logout link
	public void clickLogoutLink() {
		LogoutLink.click();
	}

	/// Objects Verifications

	////////////////////////// Programme Objects
	///// Programme Link
	public boolean verifyProgramme() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Programme);
		return status;
	}
	
	
	/////////////// Sites and Jobs Objects ///////////
	///// Sites and Jobs
	public boolean verifySiteandJobs() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_SitesandJobs);
		return status;
	}

	///// Dash Board on Sites and Jobs
	public boolean verifyDashBoardOnSiteandJobs() {
		boolean status = new VerificationHelper(driver).isDisplayed(DashBoard_Link_SitesAndJobs);
		return status;
	}

	///// Site Search on Sites and Jobs
	public boolean verifySiteSearchOnSiteandJobs() {
		boolean status = new VerificationHelper(driver).isDisplayed(SiteSearch_Link_SitesAndJobs);
		return status;
	}

	///// Job Search on Sites and Jobs
	public boolean verifyJobSearchOnSiteandJobs() {
		boolean status = new VerificationHelper(driver).isDisplayed(JobSearch_Link_SitesAndJobs);
		return status;
	}

	///// Reporting on Sites and Jobs
	public boolean verifyReportingOnSiteandJobs() {
		boolean status = new VerificationHelper(driver).isDisplayed(Reporting_Link_SitesAndJobs);
		return status;
	}

	/////////////// Survey Objects//////////
	///// Survey Link
	public boolean verifySurvey() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Survey);
		return status;
	}

	/////////////////////// Design Objects ////////////
	///// Design Link
	public boolean verifyDesign() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Design);
		return status;
	}
	//////////////////// Construction Objects //////////////
	///// Construction Link
	public boolean verifyConstruction() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Construction);
		return status;
	}

	/////////////// Completions Objects///////////////////////
	///// Completions Link
	public boolean verifyCompletions() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Completions);
		return status;
	}

	////////////////////////////// Commercial  Objects /////////
	///// Commercial Link
	public boolean verifyCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Commercial);
		return status;
	}

	///// Dash Board on Commercial
	public boolean verifyDashBoardOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(DashBoard_Link_Commercial);
		return status;
	}

	///// Awaiting Claim Condition on Commercial
	public boolean verifyAwaitingClaimConditionOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(AwaitingClaimCondition_Link_Commercial);
		return status;
	}

	///// Awaiting Claim on Commercial
	public boolean verifyAwaitingClaimOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(AwaitingClaim_Link_Commercial);
		return status;
	}

	///// Commercial Held on Commercial
	public boolean verifyCommercialHeldOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(CommercialHeld_Link_Commercial);
		return status;
	}

	///// Claim Preview on Commercial
	public boolean verifyClaimPreviewOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(ClaimPreview_Link_Commercial);
		return status;
	}

	///// Awaiting Claim Approval on Commercial
	public boolean verifyAwaitingClaimApprovalOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(AwaitingClaimApproval_Link_Commercial);
		return status;
	}

	///// Approved Claims on Commercial
	public boolean verifyApprovedClaimsOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(ApprovedClaims_Link_Commercial);
		return status;
	}

	///// Awaiting Claim Payment on Commercial
	public boolean verifyAwaitingClaimPaymentOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(AwaitingClaimPayment_Link_Commercial);
		return status;
	}

	///// Paid Claims on Commercial
	public boolean verifyPaidClaimsOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(PaidClaims_Link_Commercial);
		return status;
	}

	///// Rejected Claims on Commercial
	public boolean verifyRejectedClaimsOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(RejectedClaims_Link_Commercial);
		return status;
	}

	///// Write Offs on Commercial
	public boolean verifyWriteOffsOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(WriteOffs_Link_Commercial);
		return status;
	}

	///// Reports on Commercial
	public boolean verifyReportsOnCommercial() {
		boolean status = new VerificationHelper(driver).isDisplayed(Reports_Link_Commercial);
		return status;
	}

	////////////////////////// RCTI Objects/////////////////
	///// RCTI Link
	public boolean verifyRCTI() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_RCTI);
		return status;
	}

	///// DashBoard On RCTI Link
	public boolean verifyDashBoardOnRCTI() {
		boolean status = new VerificationHelper(driver).isDisplayed(DashBoard_Link_RCTI);
		return status;
	}

	///// Awaiting Payment Condition On RCTI Link
	public boolean verifyAwaitingPaymentConditionOnRCTI() {
		boolean status = new VerificationHelper(driver).isDisplayed(AwaitingPaymentCondition_Link_RCTI);
		return status;
	}

	///// Awaiting Payment Condition On RCTI Link
	public boolean verifyAwaitingDeliveryPartnerConfirmationOnRCTI() {
		boolean status = new VerificationHelper(driver).isDisplayed(AwaitingDeliveryPartnerConfirmation_Link_RCTI);
		return status;
	}

	///// Awaiting Invoice On RCTI Link
	public boolean verifyAwaitingInvoiceOnRCTI() {
		boolean status = new VerificationHelper(driver).isDisplayed(AwaitingInvoice_Link_RCTI);
		return status;
	}

	///// Awaiting Invoice On RCTI Link
	public boolean verifyInvoicePreviewOnRCTI() {
		boolean status = new VerificationHelper(driver).isDisplayed(InvoicePreview_Link_RCTI);
		return status;
	}

	///// Unpaid Invoices On RCTI Link
	public boolean verifyUnpaidInvoicesOnRCTI() {
		boolean status = new VerificationHelper(driver).isDisplayed(UnpaidInvoices_Link_RCTI);
		return status;
	}

	///// Paid Invoices On RCTI Link
	public boolean verifyPaidInvoicesOnRCTI() {
		boolean status = new VerificationHelper(driver).isDisplayed(PaidInvoices_Link_RCTI);
		return status;
	}

	////////////////////// Defects Objects //////////
	///// Defects Link
	public boolean verifyDefects() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Defects);
		return status;
	}

	////////////////////// Variations Objects ///////////////
	///// Variations Link
	public boolean verifyVariations() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Variations);
		return status;
	}

	//////////////////////////// B2B Link Objects////////////
	///// B2B Link
	public boolean verifyB2B() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_B2B);
		return status;
	}
	
	/////////////////////////////// Consent Link Objects /////////////////
	///// Consent Link
	public boolean verifyConsent() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Consent);
		return status;
	}

	///////////////////////////// LIFD Link Objects ///////////////
	///// LIFD Link
	public boolean verifyLIFD() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_LIFD);
		return status;
	}

	////////////// Quality Inspections Link Objects
	///// Quality Inspections Link
	public boolean verifyQualityInspections() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_QualityInspections);
		return status;
	}


	/////////////////////// Administration Link Objects ////////////////
	///// Administration Link
	public boolean verifyAdministration() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Administration);
		return status;
	}
	
	///// DashBoard on Administration Link
	public boolean verifyDashBoardOnAdministration() {
		boolean status = new VerificationHelper(driver).isDisplayed(DashBoard_Link_Administration);
		return status;
	}
	
	///// Manage users on Administration Link
	public boolean verifyManageUsersOnAdministration() {
		boolean status = new VerificationHelper(driver).isDisplayed(ManageUsers_Link_Administration);
		return status;
	}
	
	///// Manage Companies on Administration Link
	public boolean verifyManageCompaniesOnAdministration() {
		boolean status = new VerificationHelper(driver).isDisplayed(ManageCompanies_Link_Administration);
		return status;
	}

	///// Manage Groups on Administration Link
	public boolean verifyManageGroupsOnAdministration() {
		boolean status = new VerificationHelper(driver).isDisplayed(ManageGroups_Link_Administration);
		return status;
	}

	///// Awaiting Registration on Administration Link
	public boolean verifyAwaitingRegistrationOnAdministration() {
		boolean status = new VerificationHelper(driver).isDisplayed(AwaitingRegistrations_Link_Administration);
		return status;
	}

	
	////////////////////////////// HSEQ Objects ///////////////////
	///// HSEQ Link
	public boolean verifyHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_HSEQ);
		return status;
	}
	
	///// ToolBox Meetings on HSEQ Link
	public boolean verifyToolBoxMeetingsOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(ToolboxMeetings_Link_HSEQ);
		return status;
	}
	
	///// Leadership Walks on HSEQ Link
	public boolean verifyLeaderShipWalksOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(LeadershipWalks_Link_HSEQ);
		return status;
	}
	
	///// Safety Observations on HSEQ Link
	public boolean verifySafetyObservationsOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(SafetyObservations_Link_HSEQ);
		return status;
	}
	
	///// Environmental Inspection on HSEQ Link
	public boolean verifyEnvironmentalInspectionOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(EnvironmentalInspection_Link_HSEQ);
		return status;
	}

	///// Site Inspection on HSEQ Link
	public boolean verifySiteInspectionOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(SiteInspection_Link_HSEQ);
		return status;
	}
	

	///// Audit on HSEQ Link
	public boolean verifyAuditOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(Audit_Link_HSEQ);
		return status;
	}
	

	///// Incident - Near Miss on HSEQ Link
	public boolean verifyIncidentNearMissOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(Incident_Near_Miss_Link_HSEQ);
		return status;
	}
	
	

	///// Incident Hazard on HSEQ Link
	public boolean verifyIncidentHazardOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(IncidentHazard_Link_HSEQ);
		return status;
	}
	
	///// Quality Inspection on HSEQ Link
	public boolean verifyQualityInspectionOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(QualityInspection_Link_HSEQ);
		return status;
	}
	
	
	///// Alert Management on HSEQ Link
	public boolean verifyAlertManagementOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(AlertManagement_Link_HSEQ);
		return status;
	}

	///// Report on HSEQ Link
	public boolean verifyReportOnHSEQ() {
		boolean status = new VerificationHelper(driver).isDisplayed(Report_Link_HSEQ);
		return status;
	}
	

	///////////// Delivery Partners Objects /////////////////
	///// Delivery Partners Link
	public boolean verifyDeliveryPartners() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_DeliveryPartners);
		return status;
	}
	///// People DashBoard on Delivery Partners Link
	public boolean verifyPeopleDashBoardOnDeliveryPartners() {
		boolean status = new VerificationHelper(driver).isDisplayed(PeopleDashboard_Link_DeliveryPartners);
		return status;
	}
	///// Company DashBoard on Delivery Partners Link
	public boolean verifyCompanyDashBoardOnDeliveryPartners() {
		boolean status = new VerificationHelper(driver).isDisplayed(CompanyDashboard_Link_DeliveryPartners);
		return status;
	}
	///// People on Delivery Partners Link
	public boolean verifyPeopleOnDeliveryPartners() {
		boolean status = new VerificationHelper(driver).isDisplayed(People_Link_DeliveryPartners);
		return status;
	}
	
	///// Crews on Delivery Partners Link
	public boolean verifyCrewsOnDeliveryPartners() {
		boolean status = new VerificationHelper(driver).isDisplayed(Crews_Link_DeliveryPartners);
		return status;
	}
	
	///// Companies Delivery Partners Link
	public boolean verifyCompaniesOnDeliveryPartners() {
		boolean status = new VerificationHelper(driver).isDisplayed(Companies_Link_DeliveryPartners);
		return status;
	}

	
	///////////////// Schedule Of Rates  Objects ///////// 
	///// Schedule Of RatesLink
	public boolean verifyScheduleOfRates() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_ScheduleOfRates);
		return status;
	}
	///// DashBoard on Schedule Of RatesLink
	public boolean verifyDashBoardOnScheduleOfRates() {
		boolean status = new VerificationHelper(driver).isDisplayed(DashBoard_Link_ScheduleOfRates);
		return status;
	}
	///// Manage on Schedule Of RatesLink
	public boolean verifyManageOnScheduleOfRates() {
		boolean status = new VerificationHelper(driver).isDisplayed(Manage_Link_ScheduleOfRates);
		return status;
	}
	///// Reporting on Schedule Of RatesLink
	public boolean verifyReportingOnScheduleOfRates() {
		boolean status = new VerificationHelper(driver).isDisplayed(Reporting_Link_ScheduleOfRates);
		return status;
	}

	
	//////////////////// Scheduling Objects ///////////
	///// Scheduling Link
	public boolean verifyScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Scheduling);
		return status;
	}
	///// Schedule Alerts on Scheduling Link
	public boolean verifyScheduleAlertsOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(ScheduleAlerts_Link_Scheduling);
		return status;
	}
	
	///// Todays Job on Scheduling Link
	public boolean verifyTodaysJobOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(TodaysJob_Link_Scheduling);
		return status;
	}
	
	///// Next 7 Days Jobs on Scheduling Link
	public boolean verifyNext7DaysJobsOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(Next7DaysJob_Link_Scheduling);
		return status;
	}
	
	///// Not Scheduled on Scheduling Link
	public boolean verifyNotScheduledOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(NotScheduled_Link_Scheduling);
		return status;
	}
	
	///// Delayed Sites on Scheduling Link
	public boolean verifyDelayedSitesOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(DelayedSites_Link_Scheduling);
		return status;
	}

	///// Missed Jobs on Scheduling Link
	public boolean verifyMissedJobsOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(MissedJobs_Link_Scheduling);
		return status;
	}
	

	///// Slipped Jobs on Scheduling Link
	public boolean verifySlippedJobsOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(SlippedJobs_Link_Scheduling);
		return status;
	}


	///// Sites Calendar on Scheduling Link
	public boolean verifySitesCalendarOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(SitesCalendar_Link_Scheduling);
		return status;
	}

	///// Crews Calendar on Scheduling Link
	public boolean verifyCrewsCalendarOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(CrewsCalendar_Link_Scheduling);
		return status;
	}

	///// Dash Board on Scheduling Link
	public boolean verifyDashBoardOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(Dashboard_Link_Scheduling);
		return status;
	}

	///// Schedulers View on Scheduling Link
	public boolean verifySchedulersViewOnScheduling() {
		boolean status = new VerificationHelper(driver).isDisplayed(SchedulersView_Link_Scheduling);
		return status;
	}
	
	
	
	////////////////////////////////////Material Objects /////////////////////

	///// Materials Link
	public boolean verifyMaterials() {
		boolean status = new VerificationHelper(driver).isDisplayed(link_Materials);
		return status;
	}

	///// Locations on Materials Link
	public boolean verifyLocationsOnMaterials() {
		boolean status = new VerificationHelper(driver).isDisplayed(Locations_Link_Material);
		return status;
	}

	///// Items on Materials Link
	public boolean verifyProductsOnMaterials() {
		boolean status = new VerificationHelper(driver).isDisplayed(Products_Link_Material);
		return status;
	}

	///// Items on Materials Link
	public boolean verifyItemsOnMaterials() {
		boolean status = new VerificationHelper(driver).isDisplayed(Items_Link_Material);
		return status;
	}

	///// Transactions on Materials Link
	public boolean verifyTransactionsOnMaterials() {
		boolean status = new VerificationHelper(driver).isDisplayed(Transactions_Link_Material);
		return status;
	}

	///// Purchase Orders on Materials Link
	public boolean verifyPurchaseOrdersOnMaterials() {
		boolean status = new VerificationHelper(driver).isDisplayed(PurchaseOrders_Link_Material);
		return status;
	}

}
