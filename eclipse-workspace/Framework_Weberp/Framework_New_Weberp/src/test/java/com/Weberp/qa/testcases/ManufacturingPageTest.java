package com.Weberp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.ManufacturingPage;
import com.weberp.qa.pages.SalesPage;


@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
public class ManufacturingPageTest extends TestBase1{

	LoginPage loginPage;
	   SalesPage salesPage;
	   ManufacturingPage manufacturingPage;
	   	    
	    public ManufacturingPageTest() {
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
	       
	        salesPage.clickManufacturingLink();
	        
	        manufacturingPage = new ManufacturingPage(driver);
	    }
	    
	    
	    @Test(priority = 1)
	    public void testWorkOrderEntryNavigation() {
	    	manufacturingPage.clickWorkOrderEntry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("WorkOrderEntry"),
	                "Did not navigate to Work Order Entry page");
	       
	    }

	    @Test(priority = 2)
	    public void testSelectAWorkOrderNavigation() {
	    	manufacturingPage.clickSelectAWorkOrder();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectWorkOrder"),
	                "Did not navigate to Select A Work Order page");
	        
	    }	
	    
	    
	    @Test(priority = 3)
	    public void testSelectQASamplesNavigation() {
	    	manufacturingPage.clickQASamplesandTestResults(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectQASamples"),
	                "Did not navigate to Select QA Samples page");
	       
	    }

	    @Test(priority = 4)
	    public void testTimesheetEntryNavigation() {
	    	manufacturingPage.clickTimesheetEntry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Timesheets"),
	                "Did not navigate to Timesheet Entry page");
	        
	    }	
	    
	    @Test(priority = 5)
	    public void testSelectAWorkOrder1Navigation() {
	    	manufacturingPage.clickSelectAWorkOrder1(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectWorkOrder"),
	                "Did not navigate to Select Work Order page");
	       
	    }

	    @Test(priority = 6)
	    public void testCostedBillOfMaterialInquiryNavigation() {
	    	manufacturingPage.clickCostedBillOfMaterialInquiry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BOMInquiry"),
	                "Did not navigate to Costed Bill Of Material page");
	        
	    }	
	    
	    
	    @Test(priority = 7)
	    public void testWhereUsedInquiryNavigation() {
	    	manufacturingPage.clickWhereUsedInquiry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("WhereUsedInquiry"),
	                "Did not navigate to Where Used Inquiry page");
	       
	    }

	    @Test(priority = 8)
	    public void testBillOfMaterialListingNavigation() {
	    	manufacturingPage.clickBillOfMaterialListing();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BOMListing"),
	                "Did not navigate to Bill Of Material Listing page");
	        
	    }  
	   
	    @Test(priority = 9)
	    public void testIndentedBillOfMaterialListingNavigation() {
	    	manufacturingPage.clickIndentedBillOfMaterialListing(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BOMIndented"),
	                "Did not navigate to Indented BOM Listing page");
	       
	    }

	    @Test(priority = 10)
	    public void testListComponentsRequiredNavigation() {
	    	manufacturingPage.clickListComponentsRequired(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BOMExtendedQty"),
	                "Did not navigate to Quantity Extended BOM Listing page");
	        
	    }	
	    
	    
	    @Test(priority = 11)
	    public void testListMaterialsNotUsedAnywhereNavigation() {
	    	manufacturingPage.clickListMaterialsNotUsedAnywhere(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MaterialsNotUsed"),
	                "Did not navigate to Raw Materials Not Used Anywhere page");
	       
	    }

	    @Test(priority = 12	)
	    public void testIndentedWhereUsedListingNavigation() {
	    	manufacturingPage.clickIndentedWhereUsedListing();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BOMIndentedReverse"),
	                "Did not navigate to Reverse Indented BOM Listing page");
	        
	    }  

	    @Test(priority = 13)
	    public void testWOItemsreadytoproduceNavigation() {
	    	manufacturingPage.clickWOItemsreadytoproduce(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("WOCanBeProducedNow"),
	                "Did not navigate to WO items can be produced with available stock page");
	       
	    }

	    @Test(priority = 14)
	    public void testMRPNavigation() {
	    	manufacturingPage.clickMRP(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MRPReport"),
	                "Did not navigate to MRP Report page");
	        
	    }	
	    
	    
	    @Test(priority = 15)
	    public void testMRPShortagesNavigation() {
	    	manufacturingPage.clickMRPShortages(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MRPShortages"),
	                "Did not navigate to MRP Error page");
	       
	    }

	    @Test(priority = 16)
	    public void testMRPSuggestedPurchaseOrdersNavigation() {
	    	manufacturingPage.clickMRPSuggestedPurchaseOrders();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MRPPlannedPurchaseOrders"),
	                "Did not navigate to MRP Error page");
	        
	    }
	  
	    @Test(priority = 17)
	    public void testMRPSuggestedWorkOrdersNavigation() {
	    	manufacturingPage.clickMRPSuggestedWorkOrders(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MRPPlannedWorkOrders"),
	                "Did not navigate to MRP Error page");
	       
	    }

	    @Test(priority = 18)
	    public void testMRPReschedulesRequiredNavigation() {
	    	manufacturingPage.clickMRPReschedulesRequired();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MRPReschedules"),
	                "Did not navigate to MRP Error page");
	        
	    }
	    
	    @Test(priority = 19)
	    public void testPrintProductSpecificationNavigation() {
	    	manufacturingPage.clickPrintProductSpecification(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFProdSpec"),
	                "Did not navigate to Select Product Specification to Print page");
	       
	    }

	    @Test(priority = 20)
	    public void testPrintCertificateOfAnalysisNavigation() {
	    	manufacturingPage.clickPrintCertificateOfAnalysis();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFCOA"),
	                "Did not navigate to Select Certificate Of Analysis to Print page");
	        
	    }
	  
	    @Test(priority = 21)
	    public void testHistoricalQATestResultsNavigation() {
	    	manufacturingPage.clickHistoricalQATestResults(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("HistoricalTestResults"),
	                "Did not navigate to Historical Test Results page");
	       
	    }

	    @Test(priority = 22)
	    public void testMultipleWorkOrdersTotalCostInquiryNavigation() {
	    	manufacturingPage.clickMultipleWorkOrdersTotalCostInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("CollectiveWorkOrderCost"),
	                "Did not navigate to Search Work Orders page");
	        
	    }
	    
	    @Test(priority = 23)
	    public void testWorkCentreNavigation() {
	    	manufacturingPage.clickWorkCentre(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("WorkCentres"),
	                "Did not navigate to Work Centres page");
	       
	    }

	    @Test(priority = 24)
	    public void testBillsOfMaterialNavigation() {
	    	manufacturingPage.clickBillsOfMaterial();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BOMs"),
	                "Did not navigate to Multi Level Bill Of Materials Maintenance page");
	        
	    }
	  
	    @Test(priority = 25)
	    public void testCopyaBillOfMaterialsBetweenItemsNavigation() {
	    	manufacturingPage.clickCopyaBillOfMaterialsBetweenItems(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("CopyBOM"),
	                "Did not navigate to Copy a BOM to New Item Code page");
	       
	    }

	    @Test(priority = 26)
	    public void testMasterScheduleNavigation() {
	    	manufacturingPage.clickMasterSchedule();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MRPDemands"),
	                "Did not navigate to MRP Demands page");
	        
	    }
	  
	    @Test(priority = 27)
	    public void testAutoCreateMasterScheduleNavigation() {
	    	manufacturingPage.clickAutoCreateMasterSchedule(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MRPCreateDemands"),
	                "Did not navigate to MRP Create Demands page");
	       
	    }

	    @Test(priority = 28)
	    public void testMRPCalculationNavigation() {
	    	manufacturingPage.clickMRPCalculation();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("MRP"),
	                "Did not navigate to Run MRP Calculation page");
	        
	    }
	  
	    @Test(priority = 29)
	    public void testQualityTestsMaintenanceNavigation() {
	    	manufacturingPage.clickQualityTestsMaintenance(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("QATests"),
	                "Did not navigate to QA Tests Maintenance page");
	       
	    }

	    @Test(priority = 30)
	    public void testProductSpecificationsNavigation() {
	    	manufacturingPage.clickProductSpecifications();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("ProductSpecs"),
	                "Did not navigate to Product Specifications Maintenance page");
	        
	    }
	    
	    @Test(priority = 31)
	    public void testEmployeesNavigation() {
	    	manufacturingPage.clickEmployees();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Employees"),
	                "Did not navigate to Employee Maintenance page");
	        
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
