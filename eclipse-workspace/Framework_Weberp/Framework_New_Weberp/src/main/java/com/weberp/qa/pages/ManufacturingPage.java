package com.weberp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

public class ManufacturingPage extends TestBase1 {
	
	
		public WebDriver driver;
			
			//Constructor
			public ManufacturingPage(WebDriver driver)
			{
				this.driver= driver;
				PageFactory.initElements(driver, this);//Initialize all web elements
					}


//Locators

//Elements under Transactions tab
 

 @FindBy(linkText = "• Work Order Entry")
    WebElement link_WorkOrderEntry;
 
 @FindBy(linkText = "• Select A Work Order")
    WebElement link_SelectAWorkOrder;
 
 @FindBy(linkText = "• QA Samples and Test Results")
 WebElement link_QASamplesandTestResults;

 @FindBy(linkText = "• Timesheet Entry")
 WebElement link_TimesheetEntry;
 
//Elements under Inquiries and Reports tab
 @FindBy(xpath ="/html/body/section/fieldset[2]/ul/li[1]/a")
 WebElement link_SelectAWorkOrder1;

 @FindBy(linkText = "• Costed Bill Of Material Inquiry")
 WebElement link_CostedBillOfMaterialInquiry;

 @FindBy(linkText = "• Where Used Inquiry")
 WebElement link_WhereUsedInquiry;

 @FindBy(linkText = "• Bill Of Material Listing")
 WebElement link_BillOfMaterialListing;
 
 @FindBy(linkText = "• Indented Bill Of Material Listing")
 WebElement link_IndentedBillOfMaterialListing;

 @FindBy(linkText = "• List Components Required")
 WebElement link_ListComponentsRequired;
 
 @FindBy(linkText = "• List Materials Not Used Anywhere")
 WebElement link_ListMaterialsNotUsedAnywhere;

 @FindBy(linkText = "• Indented Where Used Listing")
 WebElement link_IndentedWhereUsedListing;
 
 @FindBy(linkText = "• WO Items ready to produce")
 WebElement link_WOItemsreadytoproduce;

 @FindBy(linkText = "• MRP")
 WebElement link_MRP;
 
 @FindBy(linkText = "• MRP Shortages")
 WebElement link_MRPShortages;

 @FindBy(linkText = "• MRP Suggested Purchase Orders")
 WebElement link_MRPSuggestedPurchaseOrders;
 
 @FindBy(linkText = "• MRP Suggested Work Orders")
 WebElement link_MRPSuggestedWorkOrders;

 @FindBy(linkText = "• MRP Reschedules Required")
 WebElement link_MRPReschedulesRequired;
 
 @FindBy(linkText = "• Print Product Specification")
 WebElement link_PrintProductSpecification;

 @FindBy(linkText = "• Print Certificate of Analysis")
 WebElement link_PrintCertificateOfAnalysis;
  
 @FindBy(linkText = "• Historical QA Test Results")
 WebElement link_HistoricalQATestResults;

 @FindBy(linkText = "• Multiple Work Orders Total Cost Inquiry")
 WebElement link_MultipleWorkOrdersTotalCostInquiry;
 
//Elements under Maintenance tab
 
 @FindBy(linkText = "• Work Centre")
 WebElement link_WorkCentre;

 @FindBy(linkText = "• Bills Of Material")
 WebElement link_BillsOfMaterial;
 
 @FindBy(linkText = "• Copy a Bill Of Materials Between Items")
 WebElement link_CopyaBillOfMaterialsBetweenItems;

 @FindBy(linkText = "• Master Schedule")
 WebElement link_MasterSchedule;
 
 @FindBy(linkText = "• Auto Create Master Schedule")
 WebElement link_AutoCreateMasterSchedule;

 @FindBy(linkText = "• MRP Calculation")
 WebElement link_MRPCalculation;
 
 @FindBy(linkText = "• Quality Tests Maintenance")
 WebElement link_QualityTestsMaintenance;

 @FindBy(linkText = "• Product Specifications")
 WebElement link_ProductSpecifications;
 
 @FindBy(linkText = "• Employees")
 WebElement link_Employees;
 

 
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
    
  
  public void clickWorkOrderEntry() {
	  waitAndClick(link_WorkOrderEntry, "Work Order Entry link");
	}
   
  public void clickSelectAWorkOrder() {
	  waitAndClick(link_SelectAWorkOrder, "Select A Work Order link");
	}
  
  public void clickQASamplesandTestResults() {
	  waitAndClick(link_QASamplesandTestResults, "QASamples and Test Results link");
	}
   
  public void clickTimesheetEntry() {
	  waitAndClick(link_TimesheetEntry, "Timesheet Entry link");
	}
  
  public void clickSelectAWorkOrder1() {
	  waitAndClick(link_SelectAWorkOrder1, "Select A Work Order link");
	}
   
  public void clickCostedBillOfMaterialInquiry() {
	  waitAndClick(link_CostedBillOfMaterialInquiry, "Costed Bill Of Material Inquiry link");
	}
  
  public void clickWhereUsedInquiry() {
	  waitAndClick(link_WhereUsedInquiry, "Where Used Inquiry link");
	}
   
  public void clickBillOfMaterialListing() {
	  waitAndClick(link_BillOfMaterialListing, "Bill Of Material Listing link");
	}
  
  public void clickIndentedBillOfMaterialListing() {
	  waitAndClick(link_IndentedBillOfMaterialListing, "Indented Bill Of Material Listing link");
	}
   
  public void clickListComponentsRequired() {
	  waitAndClick(link_ListComponentsRequired, "List Components Required link");
	}
   
  public void clickListMaterialsNotUsedAnywhere() {
	  waitAndClick(link_ListMaterialsNotUsedAnywhere, "List Materials Not Used Anywhere link");
	}
  
  public void clickIndentedWhereUsedListing() {
	  waitAndClick(link_IndentedWhereUsedListing, "Indented Where Used Listing link");
	}
   
  public void clickWOItemsreadytoproduce() {
	  waitAndClick(link_WOItemsreadytoproduce, "WO Items ready to produce link");
	}
  
  public void clickMRP() {
	  waitAndClick(link_MRP, "MRP link");
	}
  
  public void clickMRPShortages() {
	  waitAndClick(link_MRPShortages, "MRP Shortages link");
	}
  
  public void clickMRPSuggestedPurchaseOrders() {
	  waitAndClick(link_MRPSuggestedPurchaseOrders, "MRP Suggested Purchase Orders link");
	}
  
  public void clickMRPSuggestedWorkOrders() {
	  waitAndClick(link_MRPSuggestedWorkOrders, "MRP Suggested Work Orders link");
	}
  
  public void clickMRPReschedulesRequired() {
	  waitAndClick(link_MRPReschedulesRequired, "MRP Reschedules Required link");
	}
  
  public void clickPrintProductSpecification() {
	  waitAndClick(link_PrintProductSpecification, "Print Product Specification link");
  }
 
  public void clickPrintCertificateOfAnalysis() {
	  waitAndClick(link_PrintCertificateOfAnalysis, "Print Certificate Of Analysis link");
	}
  
  public void clickHistoricalQATestResults() {
	  waitAndClick(link_HistoricalQATestResults, "Historical QA Test Results link");
	}
  
  public void clickMultipleWorkOrdersTotalCostInquiry() {
	  waitAndClick(link_MultipleWorkOrdersTotalCostInquiry, "Multiple Work Orders Total Cost Inquiry link");
	}
  
  
  public void clickWorkCentre() {
	  waitAndClick(link_WorkCentre, "Work Centre link");
	}
  
  public void clickBillsOfMaterial() {
	  waitAndClick(link_BillsOfMaterial, "Bills Of Material link");
  }
  
	  public void clickCopyaBillOfMaterialsBetweenItems() {
		  waitAndClick(link_CopyaBillOfMaterialsBetweenItems, "Copy a Bill Of Materials Between Items link");
		}
	  
	  public void clickMasterSchedule() {
		  waitAndClick(link_MasterSchedule, "Master Schedule link");
		 
	  }
	  
	  public void clickAutoCreateMasterSchedule() {
		  waitAndClick(link_AutoCreateMasterSchedule, "Auto Create Master Schedule link");
		}
	  
	  public void clickMRPCalculation() {
		  waitAndClick(link_MRPCalculation, "MRP Calculation link");
	  }
	  
	  public void clickQualityTestsMaintenance() {
		  waitAndClick(link_QualityTestsMaintenance, "Quality Tests Maintenance link");
		}
	  
	  public void clickProductSpecifications() {
		  waitAndClick(link_ProductSpecifications, "Product Specifications link");
	  }
	  
	  public void clickEmployees() {
		  waitAndClick(link_Employees, "Employees link");
	  }
	  
}
