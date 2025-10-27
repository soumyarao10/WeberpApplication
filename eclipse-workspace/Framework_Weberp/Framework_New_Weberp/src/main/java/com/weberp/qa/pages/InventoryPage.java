package com.weberp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

public class InventoryPage extends TestBase1{

	public WebDriver driver;
	//Constructor
			public InventoryPage(WebDriver driver)
			{
				this.driver= driver;
				PageFactory.initElements(driver, this);//Initialize all web elements
					}
			
			//Locators
			// under transaction tab
			
			@FindBy(linkText = "• Receive Purchase Orders")
		    WebElement link_ReceivePurchaseOrder;
			
			@FindBy(linkText = "• Inventory Transfer - Item Dispatch")
		    WebElement link_InventoryTransferItemDispatch;
			
			@FindBy(linkText = "• Bulk Inventory Transfer - Dispatch")
		    WebElement link_BulkTransferDispatch;
			
			@FindBy(linkText = "• Bulk Inventory Transfer - Receive")
		    WebElement link_InventoryTransferReceive;
			
			@FindBy(linkText = "• Inventory Adjustments")
		    WebElement link_InventoryAdjustments;
			
			@FindBy(linkText = "• Reverse Goods Received")
		    WebElement link_ReverseGoodsReceived;
			
			@FindBy(linkText = "• Enter Stock Counts")
		    WebElement link_EnterStockCounts;
			
			@FindBy(linkText = "• Create a New Internal Stock Request")
		    WebElement link_CreateNewInternalStockRequest;
			
			@FindBy(linkText = "• Authorise Internal Stock Requests")
		    WebElement link_AuthIntStockRequests;
			
			@FindBy(linkText = "• Fulfill Internal Stock Requests")
		    WebElement link_FulfillIntStockRequests;
			
			
			@FindBy(linkText = "• Serial Item Research Tool")
		    WebElement link_SerialItemResearchTool;
			
			@FindBy(linkText = "• Print Price Labels")
		    WebElement link_PrintPriceLabels;
			
			@FindBy(linkText = "• Reprint GRN")
		    WebElement link_ReprintGRN;
			
			@FindBy(linkText = "• Inventory Item Movements")
		    WebElement link_InventoryItemMovements;
			
			@FindBy(linkText = "• Inventory Item Status")
		    WebElement link_InventoryItemStatus;
			
			@FindBy(linkText = "• Inventory Item Usage")
		    WebElement link_InventoryItemUsage;
			
			@FindBy(linkText = "• Inventory Quantities")
		    WebElement link_InventoryQuantities;
			
			@FindBy(linkText = "• Reorder Level")
		    WebElement link_ReorderLevel;
			
			@FindBy(linkText = "• Stock Dispatch")
		    WebElement link_StockDispatch;
			
			@FindBy(linkText = "• Inventory Valuation Report")
		    WebElement link_InventoryValuationReport;
			
			@FindBy(linkText = "• Mail Inventory Valuation Report")
		    WebElement link_MailInventoryValuationReport;
			
			@FindBy(linkText = "• Inventory Planning Report")
		    WebElement link_InventoryPlanningReport;
			
			@FindBy(linkText = "• Inventory Planning Based On Preferred Supplier Data")
		    WebElement link_InventoryPlanningPreferredSupplierReport;
			
			@FindBy(linkText = "• Inventory Stock Check Sheets")
		    WebElement link_InventoryStockCheckSheets;
			
			@FindBy(linkText = "• Make Inventory Quantities CSV")
		    WebElement link_MakeInventoryQuantitiesCSV;
			
			@FindBy(linkText = "• Compare Counts Vs Stock Check Data")
		    WebElement link_CompareCountsVsStockCheckData;
			
			@FindBy(linkText = "• All Inventory Movements By Location/Date")
		    WebElement link_AllInventoryMovementsByLocationDate;
			
			@FindBy(linkText = "• List Inventory Status By Location/Category")
		    WebElement link_ListInventoryStatusByLocationCategory;
			
			@FindBy(linkText = "• Historical Stock Quantity By Location/Category")
		    WebElement link_HistoricalStockQuantityByLocationCategory;
			
			@FindBy(linkText = "• List Negative Stocks")
		    WebElement link_ListNegativeStocks;
			
			
			@FindBy(linkText = "• Period Stock Transaction Listing")
		    WebElement link_PeriodStockTransactionListing;
			
			@FindBy(linkText = "• Stock Transfer Note")
		    WebElement link_StockTransferNote;
			
			@FindBy(linkText = "• Aged Controlled Stock Report")
		    WebElement link_AgedControlledStockReport;
			
			@FindBy(linkText = "• Internal stock request inquiry")
		    WebElement link_Internalstockrequestinquiry;
			
			
			// Locators under Maintenance tab
			
			@FindBy(linkText = "• Add A New Item")
		    WebElement link_AddANewItem;
			
			@FindBy(linkText = "• Select An Item")
		    WebElement link_SelectAnItem;
			
			@FindBy(linkText = "• Review Translated Descriptions")
		    WebElement link_ReviewTranslatedDescriptions;
			
			@FindBy(linkText = "• Sales Category Maintenance")
		    WebElement link_SalesCategoryMaintenance;
			
			@FindBy(linkText = "• Brands Maintenance")
		    WebElement link_BrandsMaintenance;
			
			@FindBy(linkText = "• Add or Update Prices Based On Costs")
		    WebElement link_AddorUpdatePricesBasedOnCosts;
			
			@FindBy(linkText = "• View or Update Prices Based On Costs")
		    WebElement link_VieworUpdatePricesBasedOnCosts;
			
			@FindBy(linkText = "• Reorder Level By Category/Location")
		    WebElement link_ReorderLevelByCategoryLocation;
			
			
			
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
			  
			  public void clickReceivePurchaseOrder() {
				  waitAndClick(link_ReceivePurchaseOrder, "Receive Purchase Orderlink");
				}
			   
			  public void clickInventoryTransferItemDispatch() {
				  waitAndClick(link_InventoryTransferItemDispatch, "Inventory Transfer Item Dispatch link");
				}
			  public void clickBulkTransferDispatch() {
				  waitAndClick(link_BulkTransferDispatch, "Bulk InventoryTransfer Dispatch link");
				}
			   
			  public void clickBulkInventoryTransferReceive() {
				  waitAndClick(link_InventoryTransferReceive, "Inventory Transfer Receive link");
				}
			  
			  public void clickInventoryAdjustments() {
				  waitAndClick(link_InventoryAdjustments, "Inventory Adjustments link");
				}
			   
			  public void clickReverseGoodsReceived() {
				  waitAndClick(link_ReverseGoodsReceived, "Reverse Goods Received link");
				}
			  public void clickEnterStockCounts() {
				  waitAndClick(link_EnterStockCounts, "Enter Stock Counts link");
				}
			   
			  public void clickCreateNewInternalStockRequest() {
				  waitAndClick(link_CreateNewInternalStockRequest, "Create New Internal Stock Request link");
				}
			  
			  public void clickAuthIntStockRequests() {
				  waitAndClick(link_AuthIntStockRequests, "Authorize Internal Stock Requestsd link");
				}
			  public void FulfillIntStockRequests() {
				  waitAndClick(link_FulfillIntStockRequests, "Fulfill Internal Stock Requests link");
				}
			   
			  public void clickSerialItemResearchTool() {
				  waitAndClick(link_SerialItemResearchTool, "Serial Item Research Tool link");
				}
			  public void clickPrintPriceLabels() {
				  waitAndClick(link_PrintPriceLabels, "Print Price Labels link");
				}
			  public void clickReprintGRN() {
				  waitAndClick(link_ReprintGRN, "Reprint GRN link");
				}
			  public void clickInventoryItemMovements() {
				  waitAndClick(link_InventoryItemMovements, "Inventory Item Movements link");
				}
			  public void clickInventoryItemStatus() {
				  waitAndClick(link_InventoryItemStatus, "Inventory Item Status link");
				}
			  
			  public void clickInventoryItemUsage() {
				  waitAndClick(link_InventoryItemUsage, "Inventory Item Usage link");
				}
			  
			  public void clickInventoryQuantities() {
				  waitAndClick(link_InventoryQuantities, "Inventory Quanatities Link");
				}
			  
			  public void clickReorderLevel() {
				  waitAndClick(link_ReorderLevel, "Reorder Level Link");
				}
			  
			  public void clickStockDispatch() {
				  waitAndClick(link_StockDispatch, "Stock Dispatch Link");
				}
			  
			  public void clickInventoryValuationReport() {
				  waitAndClick(link_InventoryValuationReport, "Inventory Valuation Report Link");

			  }
			  
			  public void clickMailInventoryValuationReport() {
				  waitAndClick(link_MailInventoryValuationReport, "Mail Inventory Valuation Report Link");
				}

			  public void clickInventoryPlanningReport() {
				  waitAndClick(link_InventoryPlanningReport, "Inventory Planning Report Link");
				}
			  
			  public void clickInventoryPlanningPreferredSupplierData() {
				  waitAndClick(link_InventoryPlanningPreferredSupplierReport, " Inventory Planning Based On Preferred Supplier Data Link");
				}
			  
				public void clickInventoryStockCheckSheets() {
					  waitAndClick(link_InventoryStockCheckSheets, "Inventory Stock Check Sheets Link");
					}

				public void clickMakeInventoryQuantitiesCSV() {
					  waitAndClick(link_MakeInventoryQuantitiesCSV, "Make Inventory Quantities CSV Link");
					}
				
				public void clickCompareCountsVsStockCheckData() {
					  waitAndClick(link_CompareCountsVsStockCheckData, "Compare Counts Vs Stock Check Data Link");
					}
				
				public void clickAllInventoryMovementsByLocationDate() {
					  waitAndClick(link_AllInventoryMovementsByLocationDate, "All Inventory Movements By Location/Date Link");
					}
				public void clickListInventoryStatusByLocationCategory() {
					  waitAndClick(link_ListInventoryStatusByLocationCategory, "List Inventory Status By LocationCategory Link");
					}

				public void clickHistoricalStockQuantityByLocationCategory() {
					  waitAndClick(link_HistoricalStockQuantityByLocationCategory, "Historical Stock Quantity By LocationCategory Link");
					}
			
				public void clickListNegativeStocks() {
					  waitAndClick(link_ListNegativeStocks, "List Negative Stocks Link");
					}
			
				public void clickPeriodStockTransactionListing() {
					  waitAndClick(link_PeriodStockTransactionListing, "Period Stock Transaction Listing Link");
					}
				
				public void clickStockTransferNote() {
					  waitAndClick(link_StockTransferNote, "Stock Transfer Note Link");
					}
			
				public void clickAgedControlledStockReport() {
					  waitAndClick(link_AgedControlledStockReport, "Aged Controlled Stock Report link");
					}
				
				public void clickInternalstockrequestinquiry() {
					  waitAndClick(link_Internalstockrequestinquiry, "Internal stock request inquiry link");
					}		
				public void clickAddANewItem() {
					  waitAndClick(link_AddANewItem, "Add A New Item link");
					}
				public void clickSelectAnItem() {
					  waitAndClick(link_SelectAnItem, "Select An Item link");
					}
				public void clickReviewTranslatedDescriptions() {
					  waitAndClick(link_ReviewTranslatedDescriptions, "Review Translated Descriptions link");
					}
				public void clickSalesCategoryMaintenance() {
					  waitAndClick(link_SalesCategoryMaintenance, "Sales Category Maintenance link");
					}
				
				public void clickBrandsMaintenance() {
					  waitAndClick(link_BrandsMaintenance, "Brands Maintenance link");
					}
				public void clickAddorUpdatePricesBasedOnCosts() {
					  waitAndClick(link_AddorUpdatePricesBasedOnCosts, "Add or Update Prices Based On Costs link");
					}	
				public void clickVieworUpdatePricesBasedOnCosts() {
					  waitAndClick(link_VieworUpdatePricesBasedOnCosts, "View or Update Prices Based On Costs link");
					}
				public void clickReorderLevelByCategoryLocation() {
					  waitAndClick(link_ReorderLevelByCategoryLocation, "Reorder Level By Category or Location link");
					}
				
				
}
