package com.Weberp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.PurchasesPage;
import com.weberp.qa.pages.SalesPage;

@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
public class PurchasePageTest extends TestBase1{

	LoginPage loginPage;
	   SalesPage salesPage;
	   PurchasesPage purchasesPage;
	   	    
	    public PurchasePageTest() {
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
	       
	        salesPage.clickPurchasesLink();
	        
	        purchasesPage = new PurchasesPage(driver);
	    }
	    
	    
	    @Test(priority = 1)
	    public void testNewPurchaseOrderNavigation() {
	    	purchasesPage.clickNewPurchaseOrder(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("NewOrder"),
	                "Did not navigate to Purchase Order Entry page");
	       
	    }

	    @Test(priority = 2)
	    public void testPurchaseOrdersNavigation() {
	    	purchasesPage.clickPurchaseOrders();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectOSPurchOrder"),
	                "Did not navigate to Search Outstanding Purchase Orders page");
	        
	    }	
	    
	    
	    @Test(priority = 3)
	    public void testNewPurchaseOrderGridEntryNavigation() {
	    	purchasesPage.clickNewPurchaseOrderGridEntry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PurchaseByPrefSupplier"),
	                "Did not navigate to Preferred Vendor Purchasing page");
	       
	    }

	    @Test(priority = 4)
	    public void testCreateNewTenderNavigation() {
	    	purchasesPage.clickCreateNewTender();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SupplierTenderCreate"),
	                "Did not navigate to Create a New Supplier Tender Request page");
	        
	    }	
	    
	    @Test(priority = 5)
	    public void testEditExistingTendersNavigation() {
	    	purchasesPage.clickEditExistingTenders(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SupplierTenderCreate"),
	                "Did not navigate to Edit an Existing Supplier Tender Request page");
	       
	    }

	    @Test(priority = 6)
	    public void testProcessTendersOfferssNavigation() {
	    	purchasesPage.clickProcessTendersOffers();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("OffersReceived"),
	                "Did not navigate to Supplier Offers page");
	        
	    }	
	    
	    @Test(priority = 7)
	    public void testOrderToAuthorizeNavigation() {
	    	purchasesPage.clickOrderToAuthorise(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("AuthoriseMyOrders"),
	                "Did not navigate to Authorize Purchase Orders page");
	       
	    }

	    @Test(priority = 8)
	    public void testShipmentEntryNavigation() {
	    	purchasesPage.clickShipmentEntry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectSupplier"),
	                "Did not navigate to Search Vendors page");
	        
	    }	
	    
	    @Test(priority = 9)
	    public void testSelectShipmentNavigation() {
	    	purchasesPage.clickSelectShipment(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Shipt_Select"),
	                "Did not navigate to Search Shipments page");
	       
	    }

	    @Test(priority = 10)
	    public void testPurchaseOrderInquiryNavigation() {
	    	purchasesPage.clickPurchaseOrderInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectPurchOrder"),
	                "Did not navigate to Search Purchase Orders page");
	        
	    }	
	    
	    @Test(priority = 11)
	    public void testNewPurchaseOrderDetailsNavigation() {
	    	purchasesPage.clickPurchaseOrdersDetailOrSummaryInquiries(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("POReport"),
	                "Did not navigate to Purchase Order Report page");
	       
	    }

	    @Test(priority = 12)
	    public void testVendorPriceListNavigation() {
	    	purchasesPage.clickVendorPriceList();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SuppPriceList"),
	                "Did not navigate to Vendor Price List page");
	        
	    }	
	    
	    @Test(priority = 13)
	    public void testNewPurchaseFromSuppliersNavigation() {
	    	purchasesPage.clickPurchaseFromSuppliers(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PurchasesReport"),
	                "Did not navigate to Purchases from Suppliers page");
	       
	    }

	    @Test(priority = 14)
	    public void testMaintainSupplierPriceListsNavigation() {
	    	purchasesPage.clickMaintainSupplierrPriceLists();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SupplierPriceList"),
	                "Did not navigate to Vendor Purchasing Data page");
	        
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
