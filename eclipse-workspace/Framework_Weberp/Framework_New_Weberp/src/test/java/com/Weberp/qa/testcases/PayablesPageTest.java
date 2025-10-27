package com.Weberp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.PayablesPage;
import com.weberp.qa.pages.PurchasesPage;
import com.weberp.qa.pages.SalesPage;

@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
public class PayablesPageTest extends TestBase1{
	
	LoginPage loginPage;
	   SalesPage salesPage;
	   PayablesPage payablesPage;
	   
	   public PayablesPageTest() {
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
	       
	        salesPage.clickPayablesLink();
	        
	        payablesPage = new PayablesPage(driver);
	    }
	    
	    
	    @Test(priority = 1)
	    public void testSelectOrderNavigation() {
	    	payablesPage.clickSelectVendor(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectSupplier"),
	                "Did not navigate to Search Vendors page");
	       
	    }

	    @Test(priority = 2)
	    public void testVendorAllocationsNavigation() {
	    	payablesPage.clickVendorAllocations(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SupplierAllocations"),
	                "Did not navigate to Vendor Payment/Credit Note Allocations page");
	        
	    }
	    
	    @Test(priority = 3)
	    public void testWhereAllocatedInquiryNavigation() {
	    	payablesPage.clickWhereAllocatedInquiry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SuppWhereAlloc"),
	                "Did not navigate to Supplier How Paid Inquiry page");
	       
	    }

	    @Test(priority = 4)
	    public void testAgedVendorReportNavigation() {
	    	payablesPage.clickAgedVendorReport(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("AgedSuppliers"),
	                "Did not navigate to Aged Vendor Analysis page");
	        
	    }
	    
	    @Test(priority = 5)
	    public void testPaymentRunNavigation() {
	    	payablesPage.clickPaymentRunReport(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SuppPaymentRun"),
	                "Did not navigate to Payment Run page");
	       
	    }

	    @Test(priority = 6)
	    public void testRemittanceAdvicesNavigation() {
	    	payablesPage.clickRemittanceAdvices(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFRemittanceAdvice"),
	                "Did not navigate to Remittance Advices page");
	        
	    }
	    
	    @Test(priority = 7)
	    public void testOutstandingGRNsReportNavigation() {
	    	payablesPage.clickOutstandingGRNsReport(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("OutstandingGRNs"),
	                "Did not navigate to Outstanding GRNs Report page");
	       
	    }

	    @Test(priority = 8)
	    public void testVendorBalancesNavigation() {
	    	payablesPage.clickVendorBalances(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SupplierBalsAtPeriodEnd"),
	                "Did not navigate to Supplier Balances At A Period End page");
	        
	    }
	    @Test(priority = 9)
	    public void testListDailyTransactionsNavigation() {
	    	payablesPage.clickListDailyTransactions(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFSuppTransListing"),
	                "Did not navigate to Supplier Transaction Listing page");
	       
	    }

	    @Test(priority = 10)
	    public void testVendorTransactionInquiriesNavigation() {
	    	payablesPage.clickVendorTransactionInquiries(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SupplierTransInquiry"),
	                "Did not navigate to Supplier Transactions Inquiry page");
	       
	    }
	    @Test(priority = 11)
	    public void testAddVendorNavigation() {
	    	payablesPage.clickAddVendor(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Suppliers"),
	                "Did not navigate to Vendor Maintenance page");
	       
	    }

	    @Test(priority = 12)
	    public void testSelectVendorMaintenanceTabNavigation() {
	    	payablesPage.clickSelectVendorMaintenancetab(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectSupplier"),
	                "Did not navigate to Search Vendors page");
	       
	    }
	    @Test(priority = 13)
	    public void testMaintainFactorCompaniesNavigation() {
	    	payablesPage.clickMaintainFactorCompanies(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Factors"),
	                "Did not navigate to Factor Company Maintenance page");
	       
	    }
}
