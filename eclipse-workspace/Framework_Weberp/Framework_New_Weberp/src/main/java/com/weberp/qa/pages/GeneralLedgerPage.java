package com.weberp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

public class GeneralLedgerPage extends TestBase1 {
	
	public WebDriver driver;
	
	//Constructor
	public GeneralLedgerPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);//Initialize all web elements
			}

	//Locators

	//Elements under Transactions tab
	 

	 @FindBy(linkText = "• Bank Account Payments Entry")
	    WebElement link_BankAccountPaymentsEntry;
	 
	 @FindBy(linkText = "• Bank Account Receipts Entry")
	    WebElement link_BankAccountReceiptsEntry;
	 
	 @FindBy(linkText = "• Import Bank Transactions")
	 WebElement link_ImportBankTransactions;

	 @FindBy(linkText = "• Bank Account Payments Matching")
	 WebElement link_BankAccountPaymentsMatching;
	 
	 @FindBy(linkText = "• Bank Account Receipts Matching")
	 WebElement link_BankAccountReceiptsMatching;

	 @FindBy(linkText = "• Journal Entry")
	 WebElement link_JournalEntry;
	
	//Elements under Inquiries and Reports tab
	 
	 @FindBy(linkText= "• Bank Account Balances")
	 WebElement link_BankAccountBalances;

	 @FindBy(linkText = "• Bank Account Reconciliation Statement")
	 WebElement link_BankAccountReconStatement;

	 @FindBy(linkText = "• Check Payments Listing")
	 WebElement link_CheckPaymentsListing;

	 @FindBy(linkText = "• Daily Bank Transactions")
	 WebElement link_DailyBankTransactions;
	 
	 @FindBy(linkText= "• Account Inquiry")
	 WebElement link_AccountInquiry;

	 @FindBy(linkText = "• Graph of Account Transactions")
	 WebElement link_GraphOfAccountTransactions;

	 @FindBy(linkText = "• Account Listing")
	 WebElement link_AccountListing;

	 @FindBy(linkText = "• Account Listing to CSV File")
	 WebElement link_AccountListingtoCSVFile;
	 
	 @FindBy(linkText= "• General Ledger Journal Inquiry")
	 WebElement link_GeneralLedgerJournalInquiry;

	 @FindBy(linkText = "• Trial Balance")
	 WebElement link_TrialBalance;

	 @FindBy(linkText = "• Balance Sheet")
	 WebElement link_BalanceSheet;

	 @FindBy(linkText = "• Profit and Loss Statement")
	 WebElement link_ProfitandLossStatement;
	 
	 @FindBy(linkText= "• Statement of Cash Flows")
	 WebElement link_StatementofCashFlows;

	 @FindBy(linkText = "• Financial Statements")
	 WebElement link_FinancialStatements;

	 @FindBy(linkText = "• Horizontal Analysis of Statement of Financial Position")
	 WebElement link_HorizontalAnalysisFinancialPosition;

	 @FindBy(linkText = "• Horizontal Analysis of Statement of Comprehensive Income")
	 WebElement link_HorizontalAnalysisComprehensiveIncome;

	 @FindBy(linkText= "• Tag Reports")
	 WebElement link_TagReports;

	 @FindBy(linkText = "• Tax Reports")
	 WebElement link_TaxReports;
	
	 
	//Elements under Maintenance tab
	 
	 @FindBy(linkText = "• Account Sections")
	 WebElement link_AccountSections;

	 @FindBy(linkText = "• Account Groups")
	 WebElement link_AccountGroups;
	 
	 @FindBy(linkText = "• GL Accounts")
	 WebElement link_GLAccounts;

	 @FindBy(linkText = "• GL Account Authorized Users")
	 WebElement link_GLAccountAuthUsers;
	 
	 @FindBy(linkText = "• User Authorized GL Accounts")
	 WebElement link_UserAuthGLAccounts;

	 @FindBy(linkText = "• GL Budgets")
	 WebElement link_GLBudgets;
	 
	 @FindBy(linkText = "• GL Tags")
	 WebElement link_GLTags;

	 @FindBy(linkText = "• Bank Accounts")
	 WebElement link_BankAccounts;
	 
	 @FindBy(linkText = "• Bank Account Authorized Users")
	 WebElement link_BankAccountAuthUsers;
	 
	 @FindBy(linkText = "• User Authorized Bank Accounts")
	 WebElement link_UserAuthBankAccounts;

	 @FindBy(linkText = "• Maintain Journal Templates")
	 WebElement link_MaintainJournalTemplates;
	 
	 
	 
	//Action /methods 

	// Visibility check and then click the link
	  
	  private void waitAndClick(WebElement element, String elementName) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    try {
		        wait.until(ExpectedConditions.visibilityOf(element));
		        element.click();
		        System.out.println("Clicked on: " + elementName);
		    } catch (Exception e) {
		        throw new RuntimeException("Failed to click on " + elementName + ": " + e.getMessage());
		    }
		}
	    
	  
	  public void clickBankAccountPaymentsEntry() {
		  waitAndClick(link_BankAccountPaymentsEntry, "Bank Account Payment Entry link");
		}
	   
	  public void clickBankAccountReceiptEntry() {
		  waitAndClick(link_BankAccountReceiptsEntry, "Bank Account Receipts Entry Link");
		}
	  
	  public void clickImportBankTransactions() {
		  waitAndClick(link_ImportBankTransactions, "Import Bank Transactions Link");
		}
	   
	  public void clickBankAccountPaymentsMatching() {
		  waitAndClick(link_BankAccountPaymentsMatching, "Bank Account Payments Matching Link");
		}
	  
	  public void clickBankAccountReceiptsMatching() {
		  waitAndClick(link_BankAccountReceiptsMatching, "Bank Account Receipts Matching Link");
		}
	  
	  public void clickJournalEntry() {
		  waitAndClick(link_JournalEntry, "Journal Entry Link");
		}
	  
	  public void clickBankAccountBalances() {
		  waitAndClick(link_BankAccountBalances, "Bank Account Balances Link");
		}
	   
	  public void clickBankAccountReconStatement() {
		  waitAndClick(link_BankAccountReconStatement, "Bank Account Reconciliation Statement Link");
		}
	  
	  public void clickCheckPaymentsListing() {
		  waitAndClick(link_CheckPaymentsListing, "Check Payments Listing Link");
		}
	  
	  public void clickDailyBankTransactions() {
		  waitAndClick(link_DailyBankTransactions, "Daily Bank Transactions Link");
		}
	  
	  public void clickAccountInquiry() {
		  waitAndClick(link_AccountInquiry, "Account Inquiry Link");
		}
	   
	  public void clickGraphOfAccountTransactions() {
		  waitAndClick(link_GraphOfAccountTransactions, "Graph Of Account Transactions Link");
		}
	  
	  public void clickAccountListing() {
		  waitAndClick(link_AccountListing, "Account Listing Link");
		}
	  
	  public void clickAccountListingtoCSVFile() {
		  waitAndClick(link_AccountListingtoCSVFile, "Account Listing to CSV File Link");
		}
	  
	  public void clickGeneralLedgerJournalInquiry() {
		  waitAndClick(link_GeneralLedgerJournalInquiry, "General Ledger Journal Inquiry Link");
		}
	   
	  public void clickTrialBalance() {
		  waitAndClick(link_TrialBalance, "Trial Balance Link");
		}
	  
	  public void clickBalanceSheet() {
		  waitAndClick(link_BalanceSheet, "Balance Sheet Link");
		}
	  public void clickProfitandLossStatement() {
		  waitAndClick(link_ProfitandLossStatement, "Profit and Loss Statement Link");
		}
	  
	  public void clickStatementofCashFlows() {
		  waitAndClick(link_StatementofCashFlows, "Statement of Cash Flows Link");
		}
	   
	  public void clickFinancialStatements() {
		  waitAndClick(link_FinancialStatements, "Financial Statements Link");
		}
	  
	  public void clickHorizontalAnalysisFinancialPosition() {
		  waitAndClick(link_HorizontalAnalysisFinancialPosition, "Horizontal Analysis Financial Position Link");
		} 
	  public void clickHorizontalAnalysisComprehensiveIncome() {
		  waitAndClick(link_HorizontalAnalysisComprehensiveIncome, "Horizontal Analysis Comprehensive Income Link");
		}
	  
	  public void clickTagReports() {
		  waitAndClick(link_TagReports, "Tag Reports Link");
		}
	   
	  public void clickTaxReports() {
		  waitAndClick(link_TaxReports, "Tax Reports Link");
		}
	  
	  public void clickAccountSections() {
		  waitAndClick(link_AccountSections, "Account Sections Link");
		} 
	  
	  public void clickAccountGroups() {
		  waitAndClick(link_AccountGroups, "Account Groups Link");
		}
	  
	  	  
	  public void clickGLAccounts() {
		  waitAndClick(link_GLAccounts, "GL Accounts Link");
		} 
	  
	  public void clickGLAccountAuthUsers() {
		  waitAndClick(link_GLAccountAuthUsers, "GL Account Authorized Users Link");
		}
	  
	  public void clickUserAuthGLAccounts() {
		  waitAndClick(link_UserAuthGLAccounts, "User Authorized GL Accounts Link");
		}
	   
	  public void clickGLBudgets() {
		  waitAndClick(link_GLBudgets, "GL Budgets Link");
		}
	  
	  public void clickGLTags() {
		  waitAndClick(link_GLTags, "GL Tags Link");
		} 
	  public void clickBankAcccounts() {
		  waitAndClick(link_BankAccounts, "Bank Accounts Link");
		}
	  
	  public void clickBankAccountAuthUsers() {
		  waitAndClick(link_BankAccountAuthUsers, "Bank Account Authorized Users Link");
		}
	   
	  public void clickUserAuthBankAccounts() {
		  waitAndClick(link_UserAuthBankAccounts, "User Authorized Bank Accounts Link");
		}
	  
	  public void clickMaintainJournalTemplates() {
		  waitAndClick(link_MaintainJournalTemplates, "Maintain Journal Templates Link");
		} 
	  
}
