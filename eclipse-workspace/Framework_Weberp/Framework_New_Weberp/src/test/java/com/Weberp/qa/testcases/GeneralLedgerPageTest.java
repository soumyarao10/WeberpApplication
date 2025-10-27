package com.Weberp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.GeneralLedgerPage;
import com.weberp.qa.pages.LoginPage;
import com.weberp.qa.pages.SalesPage;


@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
public class GeneralLedgerPageTest extends TestBase1 {

	LoginPage loginPage;
	   SalesPage salesPage;
	   GeneralLedgerPage generalLedgerPage;
	   	    
	    public GeneralLedgerPageTest() {
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
	       
	        salesPage.clickGeneralLedgerLink();
	        
	        generalLedgerPage = new GeneralLedgerPage(driver);
	    }
	    

	    @Test(priority = 1)
	    public void testBankAccountPaymentsEntryNavigation() {
	    	generalLedgerPage.clickBankAccountPaymentsEntry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("NewPayment"),
	                "Did not navigate to Payment Entry page");
	       
	    }

	    @Test(priority = 2)
	    public void testBankAccountReceiptEntryNavigation() {
	    	generalLedgerPage.clickBankAccountReceiptEntry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("NewReceipt"),
	                "Did not navigate to Receipt Entry page");
	        
	    }	
	    
	    
	    @Test(priority = 3)
	    public void testImportBankTransactionsNavigation() {
	    	generalLedgerPage.clickImportBankTransactions(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("ImportBankTrans"),
	                "Did not navigate to Import Bank Transactions page");
	       
	    }

	    @Test(priority = 4)
	    public void testPaymentsMatchingNavigation() {
	    	generalLedgerPage.clickBankAccountPaymentsMatching();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BankMatching"),
	                "Did not navigate to Bank Matching page");
	        
	    }	
	   
	    @Test(priority = 5)
	    public void testBankAccountReceiptsMatchingNavigation() {
	    	generalLedgerPage.clickBankAccountReceiptsMatching(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BankMatching"),
	                "Did not navigate to Bank Matching page");
	       
	    }

	    @Test(priority = 6)
	    public void testJournalEntryNavigation() {
	    	generalLedgerPage.clickJournalEntry();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("NewJournal"),
	                "Did not navigate to Journal Entry page");
	        
	    }	
	    
	    
	    @Test(priority = 7)
	    public void testBankAccountBalancesNavigation() {
	    	generalLedgerPage.clickBankAccountBalances(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BankAccountBalances"),
	                "Did not navigate to List of Bank Account Balances page");
	       
	    }

	    @Test(priority = 8)
	    public void testBankAccountReconStatementNavigation() {
	    	generalLedgerPage.clickBankAccountReconStatement();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BankReconciliation"),
	                "Did not navigate to Bank Reconciliation page");
	        
	    }
	    @Test(priority = 9)
	    public void testCheckPaymentsListingNavigation() {
	    	generalLedgerPage.clickCheckPaymentsListing(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("PDFChequeListing"),
	                "Did not navigate to Payments Listing page");
	       
	    }

	    @Test(priority = 10)
	    public void testDailyBankTransactionsNavigation() {
	    	generalLedgerPage.clickDailyBankTransactions();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("DailyBankTransactions"),
	                "Did not navigate to Bank Transactions Inquiry page");
	        
	    }	
	    
	    
	    @Test(priority = 11)
	    public void testAccountInquiryNavigation() {
	    	generalLedgerPage.clickAccountInquiry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("SelectGLAccount"),
	                "Did not navigate to Search GL Accounts page");
	       
	    }

	    @Test(priority = 12)
	    public void testGraphOfAccountTransactionsNavigation() {
	    	generalLedgerPage.clickGraphOfAccountTransactions();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLAccountGraph"),
	                "Did not navigate to  GL Account Graph page");
	        
	    }    
	    @Test(priority = 13)
	    public void testAccountListingNavigation() {
	    	generalLedgerPage.clickAccountListing(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLAccountReport"),
	                "Did not navigate to  General Ledger Account Report page");
	       
	    }

	    @Test(priority = 14)
	    public void testAccountListingtoCSVFileNavigation() {
	    	generalLedgerPage.clickAccountListingtoCSVFile();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLAccountCSV"),
	                "Did not navigate to General Ledger Account Report page");
	        
	    }	
	    
	    
	    @Test(priority = 15)
	    public void testGeneralLedgerJournalInquiryNavigation() {
	    	generalLedgerPage.clickGeneralLedgerJournalInquiry(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLJournalInquiry"),
	                "Did not navigate to General Ledger Journal Inquiry page");
	       
	    }

	    @Test(priority = 16)
	    public void testTrialBalanceNavigation() {
	    	generalLedgerPage.clickTrialBalance();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLTrialBalance"),
	                "Did not navigate to  GL Trial Balance page");
	        
	    }  
	    @Test(priority = 17)
	    public void testBalanceSheetNavigation() {
	    	generalLedgerPage.clickBalanceSheet(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLBalanceSheet"),
	                "Did not navigate to Balance Sheet page");
	       
	    }

	    @Test(priority = 18)
	    public void testProfitandLossStatementNavigation() {
	    	generalLedgerPage.clickProfitandLossStatement();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLProfit_Loss"),
	                "Did not navigate to Profit and Loss page");
	        
	    }	
	    
	    
	    @Test(priority = 19)
	    public void testStatementofCashFlowsNavigation() {
	    	generalLedgerPage.clickStatementofCashFlows(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLCashFlowsIndirect"),
	                "Did not navigate to Statement of Cash Flows, Indirect Method page");
	       
	    }

	    @Test(priority = 20)
	    public void testFinancialStatementsNavigation() {
	    	generalLedgerPage.clickFinancialStatements();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLStatements"),
	                "Did not navigate to Financial Statements page");
	        
	    } 
	    @Test(priority = 21)
	    public void testHorizontalAnalFinancialPosNavigation() {
	    	generalLedgerPage.clickHorizontalAnalysisFinancialPosition(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("AnalysisHorizontalPosition"),
	                "Did not navigate to Horizontal Analysis Of Statement of  Financial Position page");
	       
	    }

	    @Test(priority = 22)
	    public void testHorizontalAnalysisComprehensiveIncomeNavigation() {
	    	generalLedgerPage.clickHorizontalAnalysisComprehensiveIncome();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("AnalysisHorizontalIncome"),
	                "Did not navigate to Horizontal Analysis Of Statement of Comprehensive Income page");
	        
	    }	
	    
	    
	    @Test(priority = 23)
	    public void testTagReportsNavigation() {
	    	generalLedgerPage.clickTagReports(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLTagProfit_Loss"),
	                "Did not navigate to Income and Expenditure By Tag page");
	       
	    }

	    @Test(priority = 24)
	    public void testTaxReportsNavigation() {
	    	generalLedgerPage.clickTaxReports();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("Tax"),
	                "Did not navigate to Tax Reporting page");
	        
	    } 
	    @Test(priority = 25)
	    public void testAccountSectionsNavigation() {
	    	generalLedgerPage.clickAccountSections(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("AccountSections"),
	                "Did not navigate to Account Sections page");
	       
	    }

	    @Test(priority = 26)
	    public void testAccountGroupsNavigation() {
	    	generalLedgerPage.clickAccountGroups();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("AccountGroups"),
	                "Did not navigate to Account Groups page");
	        
	    }	
	    
	    
	    @Test(priority = 27)
	    public void testGLAccountsNavigation() {
	    	generalLedgerPage.clickGLAccounts(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLAccounts"),
	                "Did not navigate to General Ledger Accounts page");
	       
	    }

	    @Test(priority = 28)
	    public void testGLAccountAuthUsersNavigation() {
	    	generalLedgerPage.clickGLAccountAuthUsers();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLAccountUsers"),
	                "Did not navigate to GL Account Authorized Users page");
	        
	    } 
	    
	    @Test(priority = 29)
	    public void testUserAuthGLAccountsNavigation() {
	    	generalLedgerPage.clickUserAuthGLAccounts(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("UserGLAccounts"),
	                "Did not navigate to User Authorized GL Accounts page");
	       
	    }

	    @Test(priority = 30)
	    public void testGLBudgetsNavigation() {
	    	generalLedgerPage.clickGLBudgets();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLBudgets"),
	                "Did not navigate to Create GL Budgets page");
	        
	    }	
	    
	    
	    @Test(priority = 31)
	    public void testGLTagsNavigation() {
	    	generalLedgerPage.clickGLTags(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLTags"),
	                "Did not navigate to Maintain General Ledger Tags page");
	       
	    }

	    @Test(priority = 32)
	    public void testBankAccountsNavigation() {
	    	generalLedgerPage.clickBankAcccounts();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BankAccounts"),
	                "Did not navigate to Bank Accounts page");
	        
	    } 
	    
	    @Test(priority = 33)
	    public void testBankAccountAuthUsersNavigation() {
	    	generalLedgerPage.clickBankAccountAuthUsers();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("BankAccountUsers"),
	                "Did not navigate to Bank Account Users page");
	        
	    }	
	    
	    
	    @Test(priority = 34)
	    public void testUserBankAccountsNavigation() {
	    	generalLedgerPage.clickUserAuthBankAccounts(); // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("UserBankAccounts"),
	                "Did not navigate to Bank Accounts Users page");
	       
	    }

	    @Test(priority = 35)
	    public void testMaintainJournalTemplatesNavigation() {
	    	generalLedgerPage.clickMaintainJournalTemplates();  // combines isDisplayed + click
	        Assert.assertTrue(driver.getCurrentUrl().contains("GLJournalTemplates"),
	                "Did not navigate to Maintain Journal Templates page");
	        
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
