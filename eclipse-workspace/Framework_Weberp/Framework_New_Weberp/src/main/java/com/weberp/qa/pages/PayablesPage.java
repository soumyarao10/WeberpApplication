package com.weberp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

public class PayablesPage extends TestBase1{
	public WebDriver driver;
	//Constructor
			public PayablesPage(WebDriver driver)
			{
				this.driver= driver;
				PageFactory.initElements(driver, this);//Initialize all web elements
					}
			
			//Locators
			// under transaction tab
			
			@FindBy(linkText = "• Select Vendor")
		    WebElement link_SelectVendor;
			
			@FindBy(linkText = "• Vendor Allocations")
		    WebElement link_VendorAllocations;
			
			// under Inquiries and Reports tab
			
						@FindBy(linkText = "• Where Allocated Inquiry")
					    WebElement link_WhereAllocatedInquiry;
						
						@FindBy(linkText = "• Aged Vendor Report")
					    WebElement link_AgedVendorReport;
						
						@FindBy(linkText = "• Payment Run Report")
					    WebElement link_PaymentRunReport;
						
						@FindBy(linkText = "• Remittance Advices")
					    WebElement link_RemittanceAdvices;
						
						@FindBy(linkText = "• Outstanding GRNs Report")
					    WebElement link_OutstandingGRNsReport;
						
						@FindBy(linkText = "• Vendor Balances At A Prior Month End")
					    WebElement link_VendorBalances;
						
						@FindBy(linkText = "• List Daily Transactions")
					    WebElement link_ListDailyTransactions;
						
						@FindBy(linkText = "• Vendor Transaction Inquiries")
					    WebElement link_VendorTransactionInquiries;
						
						//under Maintenance
						
						@FindBy(linkText = "• Add Vendor")
					    WebElement link_AddVendor;
						
						@FindBy(xpath = "/html/body/section/fieldset[3]/ul/li[2]/a")
					    WebElement link_SelectVendor1;
						
						@FindBy(linkText = "• Maintain Factor Companies")
					    WebElement link_MaintainFactorCompanies;
						
			//Methods/actions
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
			  
			  public void clickSelectVendor() {
				  waitAndClick(link_SelectVendor, "Select Vendorlink");
				}
			   
			  public void clickVendorAllocations() {
				  waitAndClick(link_VendorAllocations, "Vendor Allocations link");
				}
			  public void clickWhereAllocatedInquiry() {
				  waitAndClick(link_WhereAllocatedInquiry, "Where Allocated Inquiry link");
				}
			   
			  public void clickAgedVendorReport() {
				  waitAndClick(link_AgedVendorReport, "Aged Vendor Report link");
				}
			  public void clickPaymentRunReport() {
				  waitAndClick(link_PaymentRunReport, "Payment Run Report link");
				}
			   
			 
			  public void clickRemittanceAdvices() {
				  waitAndClick(link_RemittanceAdvices, "Remittance Advices link");
				}
			   
			  public void clickOutstandingGRNsReport() {
				  waitAndClick(link_OutstandingGRNsReport, "Outstanding GRNs Report link");
				}
			  
			  public void clickVendorBalances() {
				  waitAndClick(link_VendorBalances, "Vendor Balances at Prior Month End link");
				}
			   
			  public void clickListDailyTransactions() {
				  waitAndClick(link_ListDailyTransactions, "List Daily Transactions link");
				}
			  
			  public void clickVendorTransactionInquiries() {
				  waitAndClick(link_VendorTransactionInquiries, "Vendor Transactions Inquiries link");
				}
			   
			  public void clickAddVendor() {
				  waitAndClick(link_AddVendor, "Add Vendor link");
				}
			  
			  public void clickSelectVendorMaintenancetab() {
				  waitAndClick(link_SelectVendor1, "Select Vendor link");
				}
			   
			  public void clickMaintainFactorCompanies() {
				  waitAndClick(link_MaintainFactorCompanies, "Maintain Factor Companies link");
				}
}
