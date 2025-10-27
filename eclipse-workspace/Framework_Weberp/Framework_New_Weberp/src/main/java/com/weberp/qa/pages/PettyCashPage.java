package com.weberp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

public class PettyCashPage extends TestBase1 {
public WebDriver driver;
	
	//Constructor
	public PettyCashPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);//Initialize all web elements
			}
	
	//Locators

			//Elements under Transactions tab
			 

			 @FindBy(linkText = "• Assign Cash to PC Tab")
			    WebElement link_AssignCashtoPCTab;
			 
			 @FindBy(linkText = "• Transfer Assigned Cash Between PC Tabs")
			    WebElement link_TransferAssignedCashBetweenPCTabs;
			 
			 @FindBy(linkText = "• Claim Expenses From PC Tab")
			 WebElement link_ClaimExpensesFromPCTab;

			 @FindBy(linkText = "• Authorise Expenses")
			 WebElement link_AuthorizeExpenses;
			 
			 @FindBy(linkText = "• Authorise Assigned Cash")
			 WebElement link_AuthorizeAssignedCash;
	
			//Elements under Inquiries and Reports tab
			 
			 @FindBy(linkText= "• PC Tab General Report")
			 WebElement link_PCTabGeneralReport;

			 @FindBy(linkText = "• PC Expense General Report")
			 WebElement link_PCExpenseGeneralReport;

			 @FindBy(linkText = "• PC Tab Expenses List")
			 WebElement link_PCTabExpensesList;
			 
			 @FindBy(linkText = "• PC Expenses Analysis")
			 WebElement link_PCExpensesAnalysis;
			 
			//Elements under Maintenance tab
			 
			 @FindBy(linkText = "• Types of PC Tabs")
			 WebElement link_TypesofPCTabs;

			 @FindBy(linkText = "• PC Tabs")
			 WebElement link_PCTabs;
			 
			 @FindBy(linkText = "• PC Expenses")
			 WebElement link_PCExpenses;
			 
			 @FindBy(linkText = "• Expenses for Type of PC Tab")
			 WebElement link_ExpensesforTypeofPCTab;
			 
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
				    
				  
				  public void clickAssignCashtoPCTab() {
					  waitAndClick(link_AssignCashtoPCTab, "Assign Cash to PC Tab link");
					}
				   
				  public void clickTransferAssignedCashBetweenPCTabs() {
					  waitAndClick(link_TransferAssignedCashBetweenPCTabs, "Transfer Assigned Cash Between PC Tabs Link");
					}
				  
				  public void clickClaimExpensesFromPCTab() {
					  waitAndClick(link_ClaimExpensesFromPCTab, "Claim Expenses From PC Tab Link");
					}
				   
				  public void clickAuthorizeExpenses() {
					  waitAndClick(link_AuthorizeExpenses, "Authorize Expenses Link");
				  }
					  
					  public void clickAuthorizeAssignedCash() {
						  waitAndClick(link_AuthorizeAssignedCash, "Authorize Assigned Cash link");
						}
					   
					  public void clickPCTabGeneralReport() {
						  waitAndClick(link_PCTabGeneralReport, "PC Tab General Report Link");
						}
					  
					  public void clickPCExpenseGeneralReport() {
						  waitAndClick(link_PCExpenseGeneralReport, "PC Expense General Report Link");
						}
					   
					  public void clickPCTabExpensesList() {
						  waitAndClick(link_PCTabExpensesList, "PC Tab Expenses List Link");
					  }
						  
						  public void clickPCExpensesAnalysis() {
							  waitAndClick(link_PCExpensesAnalysis, "PC Expenses Analysis Link");
						  }
							  
							  public void clickTypesofPCTabs() {
								  waitAndClick(link_TypesofPCTabs, "A Types of PC Tabs link");
								}
							   
							  public void clickPCTabs() {
								  waitAndClick(link_PCTabs, "PC Tabs Link");
								}
							  
							  public void clickPCExpenses() {
								  waitAndClick(link_PCExpenses, "PC Expenses Link");
								}
							   
							  public void clickExpensesforTypeofPCTab() {
								  waitAndClick(link_ExpensesforTypeofPCTab, "Expenses for Type of PC Tab Link");
			 
}
}
