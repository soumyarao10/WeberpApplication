package com.Weberp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.AssetManagerPage;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.SalesPage;


@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
public class AssetManagerPageTest extends TestBase1{

	LoginPage loginPage;
	   SalesPage salesPage;
	   AssetManagerPage assetManagerPage;
	   	    
	    public AssetManagerPageTest() {
	        super(); // calls TestBase constructor to load config.properties
	    }
	
	    @BeforeMethod
	    public void setUp() {
	        initialization(); // launches browser and URL
	//Login
	        loginPage = new LoginPage(driver);
	        loginPage.setUsername(prop.getProperty("username"));
	        loginPage.setPassword(prop.getProperty("password"));
	        loginPage.clickLoginButton();
	        salesPage = new SalesPage(driver);
	       
	        salesPage.clickAssetManagerLink();
	        
	        assetManagerPage = new AssetManagerPage(driver);
	    }
	    @Test(priority = 1)
	    public void testAddaNewAssetNavigation() {
	    	assetManagerPage.clickAddaNewAsset(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("FixedAssetItems"),
	                "Did not navigate to Fixed Assets page");
	       
	    }

	    @Test(priority = 2)
	    public void testSelectanAssetNavigation() {
	    	assetManagerPage.clickSelectanAsset();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectAsset"),
	                "Did not navigate to Select an Asset page");
	        
	    }	
	    
	    @Test(priority = 3)
	    public void testChangeAssetLocationNavigation() {
	    	assetManagerPage.clickChangeAssetLocation(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("FixedAssetTransfer"),
	                "Did not navigate to Change Asset Location page");
	       
	    }

	    @Test(priority = 4)
	    public void testDepreciationJournalNavigation() {
	    	assetManagerPage.clickDepreciationJournal();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("FixedAssetDepreciation"),
	                "Did not navigate to Depreciation Journal Entry page");
	        
	    }    
	
	    @Test(priority = 5)
	    public void testAssetRegisterNavigation() {
	    	assetManagerPage.clickAssetRegister();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("FixedAssetRegister"),
	                "Did not navigate to Fixed Asset Register page");
	        
	    }	
	    
	    
	    @Test(priority = 6)
	    public void testMyMaintenanceScheduleNavigation() {
	    	assetManagerPage.clickMyMaintenanceSchedule(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MaintenanceUserSchedule"),
	                "Did not navigate to Fixed Assets Maintenance Schedule page");
	       
	    }

	    @Test(priority = 7)
	    public void testMaintenanceReminderEmailsNavigation() {
	    	assetManagerPage.clickMaintenanceReminderEmails();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MaintenanceReminders"),
	                "Did not navigate to Maintenance Reminders page");
	        
	    } 

	    @Test(priority = 8)
	    public void testFixedAssetCategoryMaintenanceNavigation() {
	    	assetManagerPage.clickFixedAssetCategoryMaintenance();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("FixedAssetCategories"),
	                "Did not navigate to Fixed Asset Category Maintenance page");
	        
	    }	
	    
	    
	    @Test(priority = 9)
	    public void testAddMaintainAssetLocationsNavigation() {
	    	assetManagerPage.clickAddMaintainAssetLocations(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("FixedAssetLocations"),
	                "Did not navigate to Fixed Asset Locations page");
	       
	    }

	    @Test(priority = 10)
	    public void testFixedAssetmaintenanceTasksNavigation() {
	    	assetManagerPage.clickFixedAssetmaintenanceTasks();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MaintenanceTasks"),
	                "Did not navigate to Fixed Asset Maintenance Tasks page");
	        
	    } 
	    
	    @AfterMethod
	    public void tearDown() {
	        System.out.println("Quitting browser...");
	        try {
	            if (driver != null) {
	                driver.quit();
	            }
	        } catch (Exception e) {
	            System.out.println("Error quitting driver: " + e.getMessage());
	        }
	    }
}
