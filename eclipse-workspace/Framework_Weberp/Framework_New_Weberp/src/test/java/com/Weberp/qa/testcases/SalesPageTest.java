package com.Weberp.qa.testcases;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.SalesPage;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;

import java.time.Duration;
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

