package com.Weberp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.ReceivablesPage;
import com.weberp.qa.pages.SalesPage;

@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
public class ReceivablesPageTest extends TestBase1{
	

	LoginPage loginPage;
   SalesPage salesPage;
   ReceivablesPage receivablesPage;
   	    
    public ReceivablesPageTest() {
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
       
        salesPage.clickReceivablesLink();
        
        receivablesPage = new ReceivablesPage(driver);
    }
    
    
    @Test(priority = 1)
    public void testSelectOrderToInvoiceNavigation() {
        receivablesPage.clickSelectOrderToInvoice(); // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("SelectSalesOrder"),
                "Did not navigate to Sales Order to Invoice page");
       
    }

    @Test(priority = 2)
    public void testCreateCreditNoteNavigation() {
    	receivablesPage.clickCreateCreditNote();  // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("NewCredit"),
                "Did not navigate to Create Credit Note page");
        
    }
    
    @Test(priority = 3)
    public void testEnterCustomerPaymentsNavigation() {
        receivablesPage.clickEnterCustomerPayments(); // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("CustomerReceipt"),
                "Did not navigate to Enter Customer Payments page");
       
    }

    @Test(priority = 4)
    public void testAllocateCustomerPaymentsNavigation() {
    	receivablesPage.clickAllocateCustomerPayments();  // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("CustomerAllocations"),
                "Did not navigate to Customer Receipt/Credit Note Allocations page");
        
    }
    
    
    @Test(priority = 5)
    public void testWhereAllocatedInquiryNavigation() {
        receivablesPage.clickWhereAllocatedInquiry(); // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("CustWhereAlloc"),
                "Did not navigate to Customer How Paid Inquiry page");
       
    }

    @Test(priority = 6)
    public void testPrintInvoicesOrCreditNotesNavigation() {
    	receivablesPage.clickPrintInvoicesOrCreditNotes();  // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("PrintCustTrans"),
                "Did not navigate to Select Invoices/Credit Notes To Print page");
        
    }
    
    @Test(priority = 7)
    public void testPrintStatementsNavigation() {
        receivablesPage.clickPrintStatements(); // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("PrintCustStatements"),
                "Did not navigate to Select Statements to Print page");
       
    }

    @Test(priority = 8)
    public void testAgedCustomerBalancesOverdueReportNavigation() {
    	receivablesPage.clickAgedCustomerBalancesOverdueReport();  // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("AgedDebtors"),
                "Did not navigate to Aged Debtor Analysis page");
        
    }
    
    @Test(priority = 9)
    public void testReprintDepositListingNavigation() {
        receivablesPage.clickReprintDepositListing(); // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("PDFBankingSummary"),
                "Did not navigate to Create PDF Print Out For A Batch Of Receipts page");
       
    }

    @Test(priority = 10)
    public void testDebtorBalancesAtPriorMonthEndNavigation() {
    	receivablesPage.clickDebtorBalancesAtPriorMonthEnd();  // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("DebtorsAtPeriodEnd"),
                "Did not navigate to Debtor Balances page");
        
    }
    
    @Test(priority = 11)
    public void testCustomerListingByAreaSalespersonNavigation() {
        receivablesPage.clickCustomerListingByAreaSalesperson(); // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("PDFCustomerList"),
                "Did not navigate to Customer Details Listing page");
       
    }

    @Test(priority = 12)
    public void testListDailyTransactionsNavigation() {
    	receivablesPage.clickListDailyTransactions();  // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("PDFCustTransListing"),
                "Did not navigate to Customer Transaction Listing page");
        
    }
    
    @Test(priority = 13)
    public void testCustomerTransactionInquiriesNavigation() {
        receivablesPage.clickCustomerTransactionInquiries(); // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("CustomerTransInquiry"),
                "Did not navigate to Customer Transactions Inquiry page");
       
    }

    @Test(priority = 14)
    public void testCustomerActivityBalancesNavigation() {
    	receivablesPage.clickCustomerActivityBalances();  // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("CustomerBalancesMovement"),
                "Did not navigate to Customer Activity and Balances page");
        
    }
    

    @Test(priority = 15)
    public void testAddCustomerNavigation() {
    	receivablesPage.clickAddCustomer();  // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("Customers"),
                "Did not navigate to Customer Maintenance page");
        
    }
    
    @Test(priority = 16)
    public void testSelectCustomerNavigation() {
        receivablesPage.clickSelectCustomer(); // combines isDisplayed + click
        Assert.assertTrue(driver.getCurrentUrl().contains("SelectCustomer"),
                "Did not navigate to Search Customers page");
       
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
