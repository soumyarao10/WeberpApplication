package com.weberp.qa.pages;

	import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

	public class SalesPage extends TestBase1{
		public WebDriver driver;
		
		//Constructor
		public SalesPage(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);//Initialize all web elements
				}
		//Locators
		
		//Elements under Transactions tab
		 @FindBy(linkText = "Sales")
		    WebElement salesLink;

		 @FindBy(linkText = "• New Sales Order or Quotation")
		    WebElement link_NewSalesOrder;

		 @FindBy(linkText = "• Enter Counter Sales")
		    WebElement link_EnterCounterSales;

		  @FindBy(linkText = "• Enter Counter Returns")
		    WebElement link_EnterCounterReturns;
		  
		  @FindBy(linkText = "• Generate/Print Picking Lists")
		    WebElement link_GeneratePickingLists;
		  
		  @FindBy(linkText = "• Outstanding Sales Orders/Quotations")
		    WebElement link_OutstandingSalesOrders;
		  
		  @FindBy(linkText = "• Special Order")
		    WebElement link_SpecialOrder;
		  
		  @FindBy(linkText = "• Recurring Order Template")
		    WebElement link_RecurringOrder;
		  
		  @FindBy(linkText = "• Process Recurring Orders")
		    WebElement link_ProcessRecurringOrder;
		  
		  @FindBy(linkText = "• Maintain Picking Lists")
		    WebElement link_MaintainPickingLists;
		  
		  //Elements under Inquiries and Reports
		  
		  @FindBy(linkText = "• Sales Order Inquiry")
		    WebElement link_SalesOrderInquiry;
		  
		  @FindBy(linkText = "• Print Price Lists")
		    WebElement link_PrintPriceLists;
		  
		  @FindBy(linkText = "• Order Status Report")
		    WebElement link_OrderStatusReport;
		  
		  @FindBy(linkText = "• Orders Invoiced Reports")
		    WebElement link_OrderInvoicedReport;
		  
		  @FindBy(linkText = "• Daily Sales Inquiry")
		    WebElement link_DailySalesInquiry;
		  
		  @FindBy(linkText = "• Sales By Sales Type Inquiry")
		    WebElement link_SalesTypeInquiry;
		  
		  @FindBy(linkText = "• Sales By Category Inquiry")
		    WebElement link_SalesByCategoryInquiry;
		  
		//  @FindBy(linkText = "• Sales By Category Inquiry")
		  //  WebElement link_SalesByCategoryInquiry;
		  
		  
		//Actions/Methods
		
		
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
		  
		  public void clickNewSalesOrder() {
			  waitAndClick(link_NewSalesOrder, "New Sales Order link");
			}
		   
		  public void clickEnterCounterSales() {
			  waitAndClick(link_EnterCounterSales, "Enter Counter Sales link");
			}
		  		  
		  public void clickEnterCounterReturns() {
			  waitAndClick(link_EnterCounterReturns, "Enter Counter Returns link");
			}

		  public void clickGeneratePickingLists() {
			  waitAndClick(link_GeneratePickingLists, "Generate Picking Lists link");
			}

		  public void clickOutstandingSalesOrders() {
			  waitAndClick(link_OutstandingSalesOrders, "Outstanding Sales Orderslink");
			}

		  public void clickSpecialOrder() {
			  waitAndClick(link_SpecialOrder, "Special Order link");
			}
		   
		    
		  public void clickRecurringOrderTemplate() {
			  waitAndClick(link_RecurringOrder, "Recurring Order Template link");
			}
		    
		  public void clickProcessRecurringOrder() {
			  waitAndClick(link_ProcessRecurringOrder, "Process Recurring Order link");
			}
		  
		  public void clickMaintainPickingList() {
			  waitAndClick(link_MaintainPickingLists, "Maintain Picking Lists link");
			}
		    
 	 
		}




