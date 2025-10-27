package com.Weberp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.InventoryPage;
import com.weberp.qa.pages.LoginPage;

import com.weberp.qa.pages.SalesPage;

@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
public class InventoryPageTest extends TestBase1{
	
	LoginPage loginPage;
	   SalesPage salesPage;
	   InventoryPage inventoryPage;
	   
	   public InventoryPageTest() {
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
	       
	        salesPage.clickInventoryLink();
	        
	        inventoryPage = new InventoryPage(driver);
	    }
	    
	    
	    @Test(priority = 1)
	    public void testReceivePurchaseOrder() {
	    	inventoryPage.clickReceivePurchaseOrder(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectOSPurchOrder"),
	                "Did not navigate to Search Outstanding Purchase Orders page");
	       
	    }

	    @Test(priority = 2)
	    public void testInventoryTransferItemDispatchNavigation() {
	    	inventoryPage.clickInventoryTransferItemDispatch(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockTransfers"),
	                "Did not navigate to Stock Transfers page");
	        
	    }

	    @Test(priority = 3)
	    public void testBulkTransferDispatchNavigation() {
	    	inventoryPage.clickBulkTransferDispatch(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockLocTransfer"),
	                "Did not navigate to Inventory Location Transfer Shipment page");
	       
	    }

	    @Test(priority = 4)
	    public void testBulkInventoryTransferReceiveNavigation() {
	    	inventoryPage.clickBulkInventoryTransferReceive(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockLocTransferReceive"),
	                "Did not navigate to Inventory Transfer - Receiving page");
	        
	    }
	    @Test(priority = 5)
	    public void testInventoryAdjustmentsNavigation() {
	    	inventoryPage.clickInventoryAdjustments(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("NewAdjustment"),
	                "Did not navigate to Stock Adjustments page");
	       
	    }

	    @Test(priority = 6)
	    public void testReverseGoodsReceivedNavigation() {
	    	inventoryPage.clickReverseGoodsReceived(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectSupplier"),
	                "Did not navigate to Search Vendors page");
	        
	    }

	    @Test(priority = 7)
	    public void testEnterStockCountsNavigation() {
	    	inventoryPage.clickEnterStockCounts(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockCounts"),
	                "Did not navigate to Stock Check Sheets Entry page");
	       
	    }

	    @Test(priority = 8)
	    public void testCreateNewInternalStockRequestNavigation() {
	    	inventoryPage.clickCreateNewInternalStockRequest(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("InternalStockRequest"),
	                "Did not navigate to Create an Internal Materials Request page");
	        
	    }
	    

	    @Test(priority = 9)
	    public void testAuthorizeIntStockRequestsNavigation() {
	    	inventoryPage.clickAuthIntStockRequests(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("InternalStockRequestAuthorisation"),
	                "Did not navigate to Authorise Internal Stock Requests page");
	       
	    }

	    @Test(priority = 10)
	    public void testFulfillIntStockRequestsNavigation() {
	    	inventoryPage.FulfillIntStockRequests(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("InternalStockRequestFulfill"),
	                "Did not navigate to Fulfill Stock Requests page");
	        
	    }
	    
	    @Test(priority = 11)
	    public void testSerialItemResearchToolNavigation() {
	    	inventoryPage.clickSerialItemResearchTool(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockSerialItemResearch"),
	                "Did not navigate to Serial Item Research page");
	       
	    }

	    @Test(priority = 12)
	    public void testPrintPriceLabelsNavigation() {
	    	inventoryPage.clickPrintPriceLabels(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFPrintLabel"),
	                "Did not navigate to Print Price Labels page");
	        
	    }
	    
	    @Test(priority = 13)
	    public void testReprintGRNNavigation() {
	    	inventoryPage.clickReprintGRN(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("ReprintGRN"),
	                "Did not navigate to Reprint a GRN page");
	       
	    }

	    @Test(priority = 14)
	    public void testInventoryItemMovementsNavigation() {
	    	inventoryPage.clickInventoryItemMovements(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockMovements"),
	                "Did not navigate to Stock Movements page");
	        
	    }
	    
	    @Test(priority = 15)
	    public void testInventoryItemStatusNavigation() {
	    	inventoryPage.clickInventoryItemStatus(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockStatus"),
	                "Did not navigate to  Stock Status page");
	       
	    }

	    @Test(priority = 16)
	    public void testInventoryItemUsageNavigation() {
	    	inventoryPage.clickInventoryItemUsage(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockUsage"),
	                "Did not navigate to Stock Usage page");
	        
	    }
	    
	    @Test(priority = 17)
	    public void testInventoryQuantitiesNavigation() {
	    	inventoryPage.clickInventoryQuantities(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("InventoryQuantities"),
	                "Did not navigate to  Inventory Quantities Reporting page");
	       
	    }

	    @Test(priority = 18)
	    public void testReorderLevelNavigation() {
	    	inventoryPage.clickReorderLevel(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("ReorderLevel"),
	                "Did not navigate to Reorder Level Reporting page");
	        
	    }
	   
	    @Test(priority = 19)
	    public void testStockDispatchNavigation() {
	    	inventoryPage.clickStockDispatch(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockDispatch"),
	                "Did not navigate to  Stock Dispatch Report page");
	       
	    }

	    @Test(priority = 20)
	    public void testInventoryValuationReportNavigation() {
	    	inventoryPage.clickInventoryValuationReport(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("InventoryValuation"),
	                "Did not navigate to Inventory Valuation Reporting page");
	        
	    }
	    
	    
	    @Test(priority = 21)
	    public void testMailInventoryValuationReportNavigation() {
	    	inventoryPage.clickMailInventoryValuationReport(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MailInventoryValuation"),
	                "Did not navigate to  Mail Inventory Valuation Report page");
	       
	    }

	    @Test(priority = 22)
	    public void testInventoryPlanningReportNavigation() {
	    	inventoryPage.clickInventoryPlanningReport(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("InventoryPlanning"),
	                "Did not navigate to Inventory Planning Reporting page");
	        
	    }
	   
	    @Test(priority = 23)
	    public void testInventoryPlanningPreferredSupplierDataNavigation() {
	    	inventoryPage.clickInventoryPlanningPreferredSupplierData(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("InventoryPlanningPrefSupplier"),
	                "Did not navigate to Preferred Supplier Inventory Planning page");
	       
	    }

	    @Test(priority = 24)
	    public void testInventoryStockCheckSheetsNavigation() {
	    	inventoryPage.clickInventoryStockCheckSheets(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockCheck"),
	                "Did not navigate to Inventory Check Sheets page");
	        
	    }
	   
	    @Test(priority = 25)
	    public void testMakeInventoryQuantitiesCSVNavigation() {
	    	inventoryPage.clickMakeInventoryQuantitiesCSV(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockQties_csv"),
	                "Did not navigate to Produce Stock Quantities CSV page");
	       
	    }

	    @Test(priority = 26)
	    public void testCompareCountsVsStockCheckDataNavigation() {
	    	inventoryPage.clickCompareCountsVsStockCheckData(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFStockCheckComparison"),
	                "Did not navigate to Inventory Comparison Report page");
	        
	    }
	    
	    @Test(priority = 27)
	    public void testAllInventoryMovementsByLocationDateNavigation() {
	    	inventoryPage.clickAllInventoryMovementsByLocationDate(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockLocMovements"),
	                "Did not navigate to All Inventory Movements By Location page");
	       
	    }

	    @Test(priority = 28)
	    public void testListInventoryStatusByLocationCategoryNavigation() {
	    	inventoryPage.clickListInventoryStatusByLocationCategory(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockLocStatus"),
	                "Did not navigate to All Stock Status By Location/Category page");
	        
	    }
	    
	    @Test(priority = 29)
	    public void testHistoricalStockQuantityByLocationCategoryNavigation() {
	    	inventoryPage.clickHistoricalStockQuantityByLocationCategory(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockQuantityByDate"),
	                "Did not navigate to Stock On Hand By Date page");
	       
	    }

	    @Test(priority = 30)
	    public void testListNegativeStocksNavigation() {
	    	inventoryPage.clickListNegativeStocks(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFStockNegatives"),
	                "Did not navigate to Stock Negatives page");
	        
	    }
	    
	   
	    @Test(priority = 31)
	    public void testPeriodStockTransactionListingNavigation() {
	    	inventoryPage.clickPeriodStockTransactionListing(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFPeriodStockTransListing"),
	                "Did not navigate to Stock Transaction Listing page");
	       
	    }

	    @Test(priority = 32)
	    public void testStockTransferNoteNavigation() {
	    	inventoryPage.clickStockTransferNote(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFStockNegatives"),
	                "Did not navigate to Stock Negatives page");
	        
	    }
	    
	    @Test(priority = 33)
	    public void testAgedControlledStockReportNavigation() {
	    	inventoryPage.clickAgedControlledStockReport(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("AgedControlledInventory"),
	                "Did not navigate to Aged Controlled Inventory page");
	       
	    }

	    @Test(priority = 34)
	    public void testInternalstockrequestinquiryNavigation() {
	    	inventoryPage.clickInternalstockrequestinquiry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("InternalStockRequestInquiry"),
	                "Did not navigate to Internal Stock Request Inquiry page");
	        
	    }
	    
	    @Test(priority = 35)
	    public void testAddANewItemNavigation() {
	    	inventoryPage.clickAddANewItem(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Stocks"),
	                "Did not navigate to Item Maintenance page");
	       
	    }

	    @Test(priority = 36)
	    public void testSelectAnItemNavigation() {
	    	inventoryPage.clickSelectAnItem(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectProduct"),
	                "Did not navigate to Search Inventory Items page");
	        
	    }
	    
	    @Test(priority = 37)
	    public void testReviewTranslatedDescriptionsNavigation() {
	    	inventoryPage.clickReviewTranslatedDescriptions(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("RevisionTranslations"),
	                "Did not navigate to Review Translated Descriptions page");
	       
	    }

	    @Test(priority = 38)
	    public void testSalesCategoryMaintenanceNavigation() {
	    	inventoryPage.clickSalesCategoryMaintenance(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesCategories"),
	                "Did not navigate to Sales Category Maintenance page");
	        
	    }
	    
	    @Test(priority = 39)
	    public void testBrandsMaintenanceNavigation() {
	    	inventoryPage.clickBrandsMaintenance(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Manufacturers"),
	                "Did not navigate to Brands Maintenance page");
	       
	    }

	    @Test(priority = 40)
	    public void testAddorUpdatePricesBasedOnCostsNavigation() {
	    	inventoryPage.clickAddorUpdatePricesBasedOnCosts(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PricesBasedOnMarkUp"),
	                "Did not navigate to Update Pricing page");
	        
	    }
	    
	    @Test(priority = 41)
	    public void testVieworUpdatePricesBasedOnCostsNavigation() {
	    	inventoryPage.clickVieworUpdatePricesBasedOnCosts(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PricesByCost"),
	                "Did not navigate to Update of Prices By A Multiple Of Cost page");
	       
	    }

	    @Test(priority = 42)
	    public void testReorderLevelByCategoryLocationNavigation() {
	    	inventoryPage.clickReorderLevelByCategoryLocation(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("ReorderLevelLocation"),
	                "Reorder Level Location Reporting");
	        
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
