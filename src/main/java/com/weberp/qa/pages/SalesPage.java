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
		
		@FindBy(linkText = "Receivables")
	    WebElement receivablesLink;
		
		//Elements under Transactions tab
		

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
		  
		 @FindBy(linkText = "• Sales By Category By Item Inquiry")
		    WebElement link_SalesByCategoryByItemInquiry;
		 
		 @FindBy(linkText = "• Sales Analysis Reports")
		    WebElement link_SalesByAnalysisReports;
		 
		 @FindBy(linkText = "• Sales Graphs")
		    WebElement link_SalesGraphs;
		 
		 @FindBy(linkText = "• Top Sellers Inquiry")
		    WebElement link_SellersInquiry;
		 
		 @FindBy(linkText = "• Order Delivery Differences Report")
		    WebElement link_OrderDeliveryReport;
		 
		 @FindBy(linkText = "• Delivery In Full On Time (DIFOT) Report")
		    WebElement link_DeliveryInFullOnTimeReport;
		 
		 @FindBy(linkText = "• Sales Order Detail Or Summary Inquiries")
		    WebElement link_SalesOrderDetailOrSummaryInquiries;
		 
		 @FindBy(linkText = "• Top Sales Items Inquiry")
		    WebElement link_TopSalesItemsInquiry;
		  
		 @FindBy(linkText = "• Top Customers Inquiry")
		    WebElement link_TopCustomersInquiry;
		 
		 @FindBy(linkText = "• Worst Sales Items Report")
		    WebElement link_WorstSalesItemsReport;
		  
		 @FindBy(linkText = "• Sales With Low Gross Profit Report")
		    WebElement link_SalesLowGrossProfitReport;
		 
		 @FindBy(linkText = "• Sell Through Support Claims Report")
		    WebElement link_SellSupportClaimsReport;
		 
		 @FindBy(linkText = "• Sales to Customers")
		    WebElement link_SalesToCustomers;
		 
		 //Elements under Maintenance 
		 
		 @FindBy(linkText = "• Create Contract")
		    WebElement link_CreateContract;
		 
		 @FindBy(linkText = "• Select Contract")
		    WebElement link_SelectContract;
		 
		 @FindBy(linkText = "• Sell Through Support Deals")
		    WebElement link_SellThroughSupportDeals;
		 
		//Actions/Methods
		
		 public void clickReceivablesLink() {
			  waitAndClick(receivablesLink, "Navigate to Receivables screen");
			}
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
		  
		  
		  //Methods for Inquiries and reports
		  
		  public void clickSalesOrderInquiry() {
			  waitAndClick(link_SalesOrderInquiry, "Sales Order Inquiry");
			}
		  
		  public void clickPrintPriceLists() {
			  waitAndClick(link_PrintPriceLists, "Print Price Lists");
			}
 	 
		  public void clickOrderStatusReport() {
			  waitAndClick(link_OrderStatusReport, "Order Status Report");
			}
		  
		  public void clickOrderInvoicedReport() {
			  waitAndClick(link_OrderInvoicedReport, "Order Invoiced Report");
			}
		  
		  public void clickDailySalesInquiry() {
			  waitAndClick(link_DailySalesInquiry, "Daily Sales Inquiry");
			}
		  
		  public void clickSalesBySalesTypeInquiry() {
			  waitAndClick(link_SalesTypeInquiry, "Sales By Sales Type Inquiry");
			}
		  
		  public void clickSalesByCategoryInquiry() {
			  waitAndClick(link_SalesByCategoryInquiry, "Sales By Category Inquiry");
			}
		  
		  public void clickSalesByCategoryByItemInquiry() {
			  waitAndClick(link_SalesByCategoryByItemInquiry, "Sales By Category By Item Inquiry");
			}
		  
		  public void clickSalesAnalysisReports() {
			  waitAndClick(link_SalesByAnalysisReports, "Sales Analysis Reports");
			 }
		  
		  public void clickSalesGraphs() {
			  waitAndClick(link_SalesGraphs, "Sales Graphs");
			}
		  
		  public void clickTopSellersInquiry() {
			  waitAndClick(link_SellersInquiry, "Top Sellers Inquiry");
			}
		  
		  public void clickOrderDeliveryDifferencesReport() {
			  waitAndClick(link_OrderDeliveryReport, "Order Delivery Differences Report");
			}
		  
		  public void clickDeliveryInFullOnTimeReport() {
			  waitAndClick(link_DeliveryInFullOnTimeReport, "Delivery In Full On Time (DIFOT) Report");
			}
		  
		  public void clickSalesOrderDetailOrSummaryInquiries() {
			  waitAndClick(link_SalesOrderDetailOrSummaryInquiries, "Sales Order Detail Or Summary Inquiries");
			}
		  
		  public void clickTopSalesItemsInquiry() {
			  waitAndClick(link_TopSalesItemsInquiry, " Top Sales Items Inquiry");
			}
		  
		  public void clickTopCustomersInquiry() {
			  waitAndClick(link_TopCustomersInquiry, " Top Customers Inquiry");
			}
		  
		  public void clickWorstSalesItemsReport() {
			  waitAndClick(link_WorstSalesItemsReport, " Worst Sales Items Report");
			}
	
		  public void clickSalesLowGrossProfitReport() {
			  waitAndClick(link_SalesLowGrossProfitReport, " Sales With Low Gross Profit Report");
			}
		 
		  public void clickSellThroughSupportClaimsReport() {
			  waitAndClick(link_SellSupportClaimsReport, " Sell Through Support Claims Report");
			}
		 
		  public void clickSalesToCustomers() {
			  waitAndClick(link_SalesToCustomers, "Sales to Customers");
			}
		  
		  //Methods for Maintenance
		  
		  public void clickCreateContract() {
			  waitAndClick(link_CreateContract, "Create Contract");
			}
		 
		  public void clickSelectContract() {
			  waitAndClick(link_SelectContract, " Select Contract");
			}
		 
		  public void clickSellThroughSupportDeals() {
			  waitAndClick(link_SellThroughSupportDeals, " Sell Through Support Deals");
			}
		  
			
	}
	
			
	
	 
	 
