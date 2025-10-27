package com.weberp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

public class PurchasesPage extends TestBase1 {
public WebDriver driver;
	
	//Constructor
	public PurchasesPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);//Initialize all web elements
			}
	//Locators
	
			//Elements under Transactions tab
			 

			 @FindBy(linkText = "• New Purchase Order")
			    WebElement link_NewPurchaseOrder;
			 
			 @FindBy(linkText = "• Purchase Orders")
			    WebElement link_PurchaseOrders;
			 
			 @FindBy(linkText = "• Purchase Order Grid Entry")
			    WebElement link_PurchaseOrderGridEntry;
			 
			 @FindBy(linkText = "• Create a New Tender")
			    WebElement link_CreateNewTender;
			 
			 @FindBy(linkText = "• Edit Existing Tenders")
			    WebElement link_EditExistingTenders;
			 
			 @FindBy(linkText = "• Process Tenders and Offers")
			    WebElement link_ProcessTendersOffers;
			 
			 @FindBy(linkText = "• Orders to Authorise")
			    WebElement link_OrderToAuthorise;
			 
			 @FindBy(linkText = "• Shipment Entry")
			    WebElement link_ShipmentEntry;
			 
			 @FindBy(linkText = "• Select A Shipment")
			    WebElement link_SelectShipment;
			 
			 
			 //Element under Inquiries and Reports
			 
			 @FindBy(linkText = "• Purchase Order Inquiry")
			    WebElement link_PurchaseOrderInquiry;
			 
			 @FindBy(linkText = "• Purchase Order Detail Or Summary Inquiries")
			    WebElement link_PurchaseOrderDetailOrSummaryInquiries;
			 
			 @FindBy(linkText = "• Vendor Price List")
			    WebElement link_VendorPriceList;
			 
			 @FindBy(linkText = "• Purchases from Suppliers")
			    WebElement link_PurchaseFromSuppliers;
			 
//Element under Maintenance
			 
			 @FindBy(linkText = "• Maintain Supplier Price Lists")
			    WebElement link_MaintainSupplierPriceLists;
			 
			 
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
				    
				  
				  public void clickNewPurchaseOrder() {
					  waitAndClick(link_NewPurchaseOrder, "new Purchase Order link");
					}
				   
				  public void clickPurchaseOrders() {
					  waitAndClick(link_PurchaseOrders, "Purchase Orders link");
					}
				  
				  public void clickNewPurchaseOrderGridEntry() {
					  waitAndClick(link_PurchaseOrderGridEntry, "Purchase Order Grid Entry link");
					}
				   
				  public void clickCreateNewTender() {
					  waitAndClick(link_CreateNewTender, "Create New Tender link");
					}
				  
				  public void clickEditExistingTenders() {
					  waitAndClick(link_EditExistingTenders, "Edit Existing Tenders link");
					}
				   
				  public void clickProcessTendersOffers() {
					  waitAndClick(link_ProcessTendersOffers, "Process tenders Offers link");
					}
				  
				  public void clickOrderToAuthorise() {
					  waitAndClick(link_OrderToAuthorise, " Order To Authorize link");
					}
				   
				  public void clickShipmentEntry() {
					  waitAndClick(link_ShipmentEntry, "Shipment Entry link");
					}
				  
				  public void clickSelectShipment() {
					  waitAndClick(link_SelectShipment, "Select Shipment link");
					}
				   
				  public void clickPurchaseOrderInquiry() {
					  waitAndClick(link_PurchaseOrderInquiry, "Purchase Order Inquiry link");
					}
				   
				  public void clickPurchaseOrdersDetailOrSummaryInquiries() {
					  waitAndClick(link_PurchaseOrderDetailOrSummaryInquiries, "Purchase Orders Details Summary Inquiries link");
					}
				  
				  public void clickVendorPriceList() {
					  waitAndClick(link_VendorPriceList, "Vendor Price List link");
					}
				   
				  public void clickPurchaseFromSuppliers() {
					  waitAndClick(link_PurchaseFromSuppliers, "Purchase From Suppliers link");
					}
				  
				  public void clickMaintainSupplierrPriceLists() {
					  waitAndClick(link_MaintainSupplierPriceLists, "Maintain Supplier Price Lists link");
					}
				  
}
