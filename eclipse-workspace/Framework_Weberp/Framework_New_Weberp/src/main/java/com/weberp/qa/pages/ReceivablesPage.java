package com.weberp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

public class ReceivablesPage extends TestBase1{

	public WebDriver driver;
	
	//Constructor
	public ReceivablesPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);//Initialize all web elements
			}
	//Locators
	
			//Elements under Transactions tab
			 

			 @FindBy(linkText = "• Select Order to Invoice")
			    WebElement link_SelectOrderInvoice;
			 
			 @FindBy(linkText = "• Create A Credit Note")
			    WebElement link_CreateCreditNote;
			 
			 @FindBy(linkText = "• Enter Customer Payments")
			    WebElement link_EnterCustomerPayments;
			 
			 @FindBy(linkText = "• Allocate Customer Payments or Credit Memos" 	)
			    WebElement link_AllocateCustomerPayments;
			 
			 
			//Elements under Inquiries and Reports tab
			 
			 @FindBy(linkText = "• Where Allocated Inquiry")
			    WebElement link_AllocatedInquiry;
			 
			 @FindBy(linkText = "• Print Invoices or Credit Notes")
			    WebElement link_CreditNotes;
			 
			 @FindBy(linkText = "• Print Statements")
			    WebElement link_PrintStatements;
			 
			 @FindBy(linkText = "• Aged Customer Balances/Overdues Report")
			    WebElement link_AgedCustomerBalances;
			 
			 @FindBy(linkText = "• Re-Print A Deposit Listing")
			    WebElement link_ReprintDepositListing;
			 
			 @FindBy(linkText = "• Debtor Balances At A Prior Month End")
			    WebElement link_DebtorBalances;
			 
			 @FindBy(linkText = "• Customer Listing By Area/Salesperson")
			    WebElement link_CustomerListingByArea;
			 
			 @FindBy(linkText = "• List Daily Transactions")
			    WebElement link_ListDailyTransactions;
			 
			 @FindBy(linkText = "• Customer Transaction Inquiries")
			    WebElement link_CustomerTransactionInquiries;

			 @FindBy(linkText = "• Customer Activity and Balances")
			    WebElement link_CustomerActivityBalances;
			 
			//Elements under Maintenance tab
			 
			 @FindBy(linkText = "• Add Customer")
			    WebElement link_AddCustomer;

			 @FindBy(linkText = "• Select Customer")
			    WebElement link_SelectCustomer;
			 //Action /methods under Transactions
			 
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
			  
			 			  
			  
			  public void clickSelectOrderToInvoice() {
				  waitAndClick(link_SelectOrderInvoice, "Select Order to Invoice link");
				}
			   
			  public void clickCreateCreditNote() {
				  waitAndClick(link_CreateCreditNote, "Create Credit Note link");
				}
			  
			  public void clickEnterCustomerPayments() {
				  waitAndClick(link_EnterCustomerPayments, "Enter Customer Payments link");
				}
			  
			  public void clickAllocateCustomerPayments() {
				  waitAndClick(link_AllocateCustomerPayments, "Allocate Customer Payments or Credit Memos link");
				}
			  
			  // Actions/Methods under Inquiries and Reports tab
			  
			  public void clickWhereAllocatedInquiry() {
				  waitAndClick(link_AllocatedInquiry, "Where Allocated Inquiry link");
				}
			   
			  public void clickPrintInvoicesOrCreditNotes() {
				  waitAndClick(link_CreditNotes, "Print  Invoices Or Credit Notes link");
				}
			  
			  public void clickPrintStatements() {
				  waitAndClick(link_PrintStatements, "Print Statements link");
				}
			  
			  public void clickAgedCustomerBalancesOverdueReport() {
				  waitAndClick(link_AgedCustomerBalances, "Aged Customer Balances/Overdues Report");
				}
			  public void clickReprintDepositListing() {
				  waitAndClick(link_ReprintDepositListing, "Reprint Deposit Listing link");
				}
			
			  
			  public void clickDebtorBalancesAtPriorMonthEnd() {
				  waitAndClick(link_DebtorBalances, "Enter Debtor Balances At A Month End link");
				}
			  
			  public void clickCustomerListingByAreaSalesperson() {
				  waitAndClick(link_CustomerListingByArea, "Customer Listing By Area Salesperson link");
				}
			  public void clickListDailyTransactions() {
				  waitAndClick(link_ListDailyTransactions, "List Daily Transactions link");
				}
			  public void clickCustomerTransactionInquiries() {
				  waitAndClick(link_CustomerTransactionInquiries, "Customer Transaction Inquiries link");
				}
			  
			  public void clickCustomerActivityBalances() {
				  waitAndClick(link_CustomerActivityBalances, "Customer Activity And Balances link");
				}

			  // Actions/Methods under Maintenance tab
			  
			  public void clickAddCustomer() {
				  waitAndClick(link_AddCustomer, "Add Customer link");
				}
			  
			  public void clickSelectCustomer() {
				  waitAndClick(link_SelectCustomer, "Select Customer link");
				}  
}








