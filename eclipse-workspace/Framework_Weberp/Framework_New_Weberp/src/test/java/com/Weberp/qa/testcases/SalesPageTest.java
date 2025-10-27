package com.Weberp.qa.testcases;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.SalesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
	public class SalesPageTest extends TestBase1{

		LoginPage loginPage;
	   SalesPage salesPage;
	   	    
	    public SalesPageTest() {
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

	               
	       	    }

	    @Test(priority = 1)
	    public void testNewSalesOrderNavigation() {
	        salesPage.clickNewSalesOrder();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("NewOrder"),
	                "Did not navigate to New Sales Order page");
	       
	    }

	    @Test(priority = 2)
	    public void testEnterCounterSalesNavigation() {
	        salesPage.clickEnterCounterSales();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("CounterSales"),
	                "Did not navigate to Enter Counter Sales page");
	        
	    }

	    @Test(priority = 3)
	    public void testEnterCounterReturnsNavigation() {
	        salesPage.clickEnterCounterReturns();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("CounterReturns"),
	                "Did not navigate to Enter Counter Returns page");
	       
	    }
	    
	    @Test(priority = 4)
	    public void testGeneratePickingListsNavigation() {
	        salesPage.clickGeneratePickingLists();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GeneratePickingList"),
	                "Did not navigate to Generate Picking Lists page");
	       
	    }
	    
	    @Test(priority = 5)
	    public void testOutstandingSalesOrdersNavigation() {
	        salesPage.clickOutstandingSalesOrders();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectSalesOrder"),
	                "Did not navigate to Outstanding Sales Orders page");
	       
	    }
	    
	    @Test(priority = 6)
	    public void testSpecialOrderNavigation() {
	        salesPage.clickSpecialOrder();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SpecialOrder"),
	                "Did not navigate to Special Order page");
	       
	    }
	    
	    @Test(priority = 7)
	    public void testRecurringOrderTemplateNavigation() {
	        salesPage.clickRecurringOrderTemplate();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectRecurringSalesOrder"),
	                "Did not navigate to Recurring Order Template page");
	       
	    }
	    
	    @Test(priority = 8)
	    public void testProcessRecurringOrderNavigation() {
	        salesPage.clickProcessRecurringOrder();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("RecurringSalesOrdersProcess"),
	                "Did not navigate to Process Recurring Order page");
	       
	    }
	    
	    @Test(priority = 9)
	    public void testMaintainPickingListavigation() {
	        salesPage.clickMaintainPickingList();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectPickingLists"),
	                "Did not navigate to Maintain Picking List page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 10)
	    public void testSalesOrderInquiryavigation() {
	        salesPage.clickSalesOrderInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectCompletedOrder"),
	                "Did not navigate to Sales Order Inquiry page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 11)
	    public void testPrintPriceListsavigation() {
	        salesPage.clickPrintPriceLists();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFPriceList"),
	                "Did not navigate to Print Price Lists page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 12)
	    public void testOrderStatusReportavigation() {
	        salesPage.clickOrderStatusReport();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("OrderStatus"),
	                "Did not navigate to Order Status Report page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 13)
	    public void testOrderInvoicedReportavigation() {
	        salesPage.clickOrderInvoicedReport();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("OrdersInvoiced"),
	                "Did not navigate to Order Invoiced Report page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 14)
	    public void testDailySalesInquirynavigation() {
	        salesPage.clickDailySalesInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("DailySalesInquiry"),
	                "Did not navigate to Daily Sales Inquiry page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }

	    @Test(priority = 15)
	    public void testSalesBySalesTypeInquirynavigation() {
	        salesPage.clickSalesBySalesTypeInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesByTypePeriodInquiry"),
	                "Did not navigate to Sales By Sales Type Inquiry page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 16)
	    public void testSalesByCategoryInquirynavigation() {
	        salesPage.clickSalesByCategoryInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesCategoryPeriodInquiry"),
	                "Did not navigate to Sales By Category Inquiry page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 17)
	    public void testSalesByCategoryByItemInquirynavigation() {
	        salesPage.clickSalesByCategoryByItemInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("StockCategorySalesInquiry"),
	                "Did not navigate to Sales By Category By Item Inquiry page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 18)
	    public void testclickSalesAnalysisReportsnavigation() {
	        salesPage.clickSalesAnalysisReports();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesAnalRepts"),
	                "Did not navigate to Sales Analysis Reports page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 19)
	    public void testSalesGraphsnavigation() {
	        salesPage.clickSalesGraphs();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesGraph"),
	                "Did not navigate to Sales Graphs page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 20)
	    public void testTopSellersInquirynavigation() {
	        salesPage.clickTopSellersInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesTopItemsInquiry"),
	                "Did not navigate to Top Sellers Inquiry page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 21)
	    public void testOrderDeliveryDifferencesReportnavigation() {
	        salesPage.clickOrderDeliveryDifferencesReport();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFDeliveryDifferences"),
	                "Did not navigate to Order Delivery Differences Report page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 22)
	    public void testDeliveryInFullOnTimeReportnavigation() {
	        salesPage.clickDeliveryInFullOnTimeReport();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFDIFOT"),
	                "Did not navigate to Delivery In Full On Time Report page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 23)
	    public void testSalesOrderDetailOrSummaryInquiriesnavigation() {
	        salesPage.clickSalesOrderDetailOrSummaryInquiries();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesInquiry"),
	                "Did not navigate to Sales Order Detail Or Summary Inquiries page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 24)
	    public void testTopSalesItemsInquirynavigation() {
	        salesPage.clickTopSalesItemsInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("TopItems"),
	                "Did not navigate to Top Sales Items Inquiry page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 25)
	    public void testTopCustomersInquirynavigation() {
	        salesPage.clickTopCustomersInquiry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesTopCustomersInquiry"),
	                "Did not navigate to Top Customers Inquiry page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }

	    @Test(priority = 26)
	    public void testWorstSalesItemsReportnavigation() {
	        salesPage.clickWorstSalesItemsReport();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("NoSalesItems"),
	                "Did not navigate to Worst Sales Items Report page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    
	    @Test(priority = 27)
	    public void testSalesLowGrossProfitReportnavigation() {
	        salesPage.clickSalesLowGrossProfitReport();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFLowGP"),
	                "Did not navigate to Sales Low Gross Profit Report page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    
	    @Test(priority = 28)
	    public void testSellThroughSupportClaimsReportnavigation() {
	        salesPage.clickSellThroughSupportClaimsReport();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFSellThroughSupportClaim"),
	                "Did not navigate to Sell Through Support Claims Report page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 29)
	    public void testSalesToCustomersnavigation() {
	        salesPage.clickSalesToCustomers();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SalesReport"),
	                "Did not navigate to Sales To Customers page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 30)
	    public void testCreateContractnavigation() {
	        salesPage.clickCreateContract();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Contracts"),
	                "Did not navigate to Create Contract page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 31)
	    public void testSelectContractnavigation() {
	        salesPage.clickSelectContract();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectContract"),
	                "Did not navigate to Select Contract page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    @Test(priority = 32)
	    public void testSellThroughSupportDealsnavigation() {
	        salesPage.clickSellThroughSupportDeals();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SellThroughSupport"),
	                "Did not navigate to Sell Through Support Deals page");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    @Test(priority = 33)
	   public void testCommonlyUsedScripts() throws InterruptedException {
	   //Gets the total number of options in the "Commonly Used Scripts" dropdown.
	    int optionCount = salesPage.getDropdownOptions().size();
//Loop through the dropdown options starting at index 1
        for (int i = 1; i < optionCount; i++) { // start from 1 to skip "--Select--"
            try {
            	//Logs which dropdown option index is currently being selected.
            	System.out.println("Selecting option index: " + i);
            	 // Captures the current URL before selection.
                String oldUrl = driver.getCurrentUrl();
               // Calls the Page Object method to select the dropdown option at index i.
                //It re-locates the dropdown fresh every time (to avoid StaleElementReferenceException)

                	//Then selects the desired option.
                salesPage.selectOptionByIndex(i);
              //Waits until the browser has navigated to a new page (i.e., the URL is no longer equal to oldUrl).

              //Prevents the next step from running too early, before the page has loaded.
                salesPage.waitForNavigation(oldUrl);
                //Gets the new URL after selection and prints it.

               // Good for validating that:

                //The expected navigation happened

               // The right page was loaded
                String newUrl = driver.getCurrentUrl();
                System.out.println("Navigated to: " + newUrl);

                // Navigate back to dashboard for next selection
             
                driver.get("http://etestingplatform.com/webERP/index.php?Application=Sales");

            } catch (org.openqa.selenium.StaleElementReferenceException stale) {
                System.err.println("Stale element! Retrying index: " + i);
                i--; // Retry the same option
            } catch (Exception e) {
                System.err.println("Error selecting option at index " + i + ": " + e.getMessage());
            }
        }
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

