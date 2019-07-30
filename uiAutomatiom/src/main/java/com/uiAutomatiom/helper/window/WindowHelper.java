package com.uiAutomatiom.helper.window;

import java.util.ArrayList;
import java.util.Set;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.uiAutomatiom.TestBase.TestBase;
import com.uiAutomatiom.helper.browerConfigurations.config.ObjectReader;
import com.uiAutomatiom.helper.logger.LogHelper;
import com.uiAutomatiom.pageObejects.FBHomePageObjects;
import com.uiAutomatiom.testScript.FBHomePageObjectsVerfication;

public class WindowHelper extends TestBase{

	private static Logger log = LogHelper.getLogger(WindowHelper.class);
	private static WebDriver driver;

	public WindowHelper(WebDriver driver) {
		this.driver = driver;
	}
	/*
	 * This method will switch to parent window
	 */

	public static void switchToParentWindow() {
		log.info(" switching to parent window ");
		try {
			driver.switchTo().defaultContent();
			log.info(" switched to parent window ");
		} catch (Exception e) {
			log.info("Unable to locate parent window " + e.getStackTrace());
		}
	}

	public static boolean swithToWindowUsingTitle(String title){
		 Set<String> handles = driver.getWindowHandles(); // Gets all the available windows
		 for(String handle : handles)
		 {
		   driver.switchTo().window(handle); // switching back to each window in loop
		   if(driver.getTitle().equals(title)) // Compare title and if title matches stop loop and return true
		    return true; // We switched to window, so stop the loop and come out of funcation with positive response
		 }
		 return false; // Return false as failed to find window with given title.
		}

	/*
	 * This method switch to child window based on index
	 */
	public static void switchToWindow(int index) {
		try {
			Set<String> windows = driver.getWindowHandles();
			int i = 1;
			for (String window : windows) {
				if (i == index) {
					log.info("switched to " + index + " window");
					driver.switchTo().window(window);
				} else {
					i++;
				}
			}
		} catch (NoSuchWindowException e) {
			log.info("Unable to locate window with index " + index + e.getStackTrace());
		} catch (Exception e) {
			log.info("Unable to locate window with id " + index + e.getStackTrace());
		}
	}
	
	/*
	 * This method Switching between Tabs based on index
	 */
	public static void switchToTabsUsingIndex(int index) {
		
		try {
			ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(windows.get(index));
			log.info("switched to " + index + " window");
		}catch (Exception e) {
			log.info("Unable to locate Tabs with index " + index + e.getStackTrace());
		}
	}
	

	/*
	 * 
	 * This method will close all tabbed window and switched to main window.
	 */
	public static void closeAllTabsSwitchToTheMainWindow() {
		String mainWindow = "";
		try {

			mainWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				if (!window.equalsIgnoreCase(mainWindow)) {
					driver.close();
				}
			}
			driver.switchTo().window(mainWindow);
			log.info("switched to main window");
		} catch (NoSuchWindowException e) {

			log.info("Unable to locate  " + mainWindow + "or child window " + e.getStackTrace());
		} catch (Exception e) {
			log.info("unable to locate element " + e.getStackTrace());
		}
	}

	public static void navigateBack() throws Exception{
		log.info("Navigating browser back");
		driver.navigate().back();
	}

	public static void navigateForword() {
		log.info("Navigating browser forword");
		driver.navigate().forward();
	}

	public static void pageRefresh() {
		log.info("Re freshing the page");
		driver.navigate().refresh();
	}
	

}
