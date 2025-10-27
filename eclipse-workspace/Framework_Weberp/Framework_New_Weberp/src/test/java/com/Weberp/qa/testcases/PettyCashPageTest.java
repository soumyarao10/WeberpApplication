package com.Weberp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.PettyCashPage;
import com.weberp.qa.pages.SalesPage;

@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
public class PettyCashPageTest extends  TestBase1{

	
	
		LoginPage loginPage;
		   SalesPage salesPage;
		   PettyCashPage pettyCashPage;
		   	    
		    public PettyCashPageTest() {
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
		       
		        salesPage.clickPettyCashLink();
		        
		        pettyCashPage = new PettyCashPage(driver);
		    }
		    @Test(priority = 1)
		    public void testAssignCashtoPCTabNavigation() {
		    	pettyCashPage.clickAssignCashtoPCTab(); // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcAssignCashToTab"),
		                "Did not navigate to Assignment of Cash to Petty Cash Tab page");
		       
		    }

		    @Test(priority = 2)
		    public void testTransferAssignedCashBetweenPCTabsNavigation() {
		    	pettyCashPage.clickTransferAssignedCashBetweenPCTabs();  // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcAssignCashTabToTab"),
		                "Did not navigate to Assignment of Cash from Tab to Tab page");
		        
		    }
		    
		    @Test(priority = 3)
		    public void testClaimExpensesFromPCTabNavigation() {
		    	pettyCashPage.clickClaimExpensesFromPCTab(); // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcClaimExpensesFromTab"),
		                "Did not navigate to Claim Petty Cash Expenses From Tab page");
		       
		    }

		    @Test(priority = 4)
		    public void testAuthorizeExpensesNavigation() {
		    	pettyCashPage.clickAuthorizeExpenses();  // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcAuthorizeExpenses"),
		                "Did not navigate to  Authorization of Petty Cash Expenses page");
		        
		    }
		    @Test(priority = 5)
		    public void testAuthorizeAssignedCashNavigation() {
		    	pettyCashPage.clickAuthorizeAssignedCash(); // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcAuthorizeCash"),
		                "Did not navigate to Assignment of Authorisation of Assigned Cash page");
		       
		    }

		    @Test(priority = 6)
		    public void testPCTabGeneralReportNavigation() {
		    	pettyCashPage.clickPCTabGeneralReport();  // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcReportTab"),
		                "Did not navigate to Petty Cash Management Report page");
		        
		    }
		    
		    @Test(priority = 7)
		    public void testPCExpenseGeneralReportNavigation() {
		    	pettyCashPage.clickPCExpenseGeneralReport(); // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcReportExpense"),
		                "Did not navigate to Petty Cash Expense Management Report page");
		       
		    }

		    @Test(priority = 8)
		    public void testPCTabExpensesListNavigation() {
		    	pettyCashPage.clickPCTabExpensesList();  // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcTabExpensesList"),
		                "Did not navigate to Pc Tab Expenses List page");
		        
		    }
		    
		    @Test(priority = 9)
		    public void testPCExpensesAnalysisNavigation() {
		    	pettyCashPage.clickPCExpensesAnalysis();  // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcAnalysis"),
		                "Did not navigate to  Authorization of Pc Expenses Analysis page");
		        
		    }
		    @Test(priority = 10)
		    public void testTypesofPCTabsNavigation() {
		    	pettyCashPage.clickTypesofPCTabs(); // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcTypeTabs"),
		                "Did not navigate to Maintenance Of Petty Cash Type of Tabs page");
		       
		    }

		    @Test(priority = 11)
		    public void testPCTabsNavigation() {
		    	pettyCashPage.clickPCTabs();  // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcTabs"),
		                "Did not navigate to Maintenance Of Petty Cash Tabs page");
		        
		    }
		    
		    @Test(priority = 12)
		    public void testPCExpensesNavigation() {
		    	pettyCashPage.clickPCExpenses(); // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcExpenses"),
		                "Did not navigate to Maintenance Of Petty Cash Of Expenses page");
		       
		    }

		    @Test(priority = 13)
		    public void testExpensesforTypeofPCTabNavigation() {
		    	pettyCashPage.clickExpensesforTypeofPCTab();  // combines isDisplayed + click
		        Assert.assertTrue(driver.getCurrentUrl().contains("PcExpensesTypeTab"),
		                "Did not navigate to Maintenance Of Petty Cash Expenses For a Type Tab page");
		        
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
