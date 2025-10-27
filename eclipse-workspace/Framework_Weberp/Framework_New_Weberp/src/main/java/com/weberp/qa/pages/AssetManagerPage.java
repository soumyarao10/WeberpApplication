package com.weberp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.weberp.qa.base.TestBase1;

public class AssetManagerPage extends TestBase1{
public WebDriver driver;
	
	//Constructor
	public AssetManagerPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);//Initialize all web elements
			}
	
	//Locators

		//Elements under Transactions tab
		 

		 @FindBy(linkText = "• Add a new Asset")
		    WebElement link_AddaNewAsset;
		 
		 @FindBy(linkText = "• Select an Asset")
		    WebElement link_SelectanAsset;
		 
		 @FindBy(linkText = "• Change Asset Location")
		 WebElement link_ChangeAssetLocation;

		 @FindBy(linkText = "• Depreciation Journal")
		 WebElement link_DepreciationJournal;
		 
		//Elements under Inquiries and Reports tab
		 
		 @FindBy(linkText= "• Asset Register")
		 WebElement link_AssetRegister;

		 @FindBy(linkText = "• My Maintenance Schedule")
		 WebElement link_MyMaintenanceSchedule;

		 @FindBy(linkText = "• Maintenance Reminder Emails")
		 WebElement link_MaintenanceReminderEmails;
		 
		//Elements under Maintenance tab
		 
		 @FindBy(linkText = "• Fixed Asset Category Maintenance")
		 WebElement link_FixedAssetCategoryMaintenance;

		 @FindBy(linkText = "• Add or Maintain Asset Locations")
		 WebElement link_AddMaintainAssetLocations;
		 
		 @FindBy(linkText = "• Fixed Asset Maintenance Tasks")
		 WebElement link_FixedAssetmaintenanceTasks;

		 
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
			    
			  
			  public void clickAddaNewAsset() {
				  waitAndClick(link_AddaNewAsset, "Add a New Asset link");
				}
			   
			  public void clickSelectanAsset() {
				  waitAndClick(link_SelectanAsset, "Select an Asset Link");
				}
			  
			  public void clickChangeAssetLocation() {
				  waitAndClick(link_ChangeAssetLocation, "Change Asset Location Link");
				}
			   
			  public void clickDepreciationJournal() {
				  waitAndClick(link_DepreciationJournal, "Depreciation Journal Link");
				}
			  public void clickAssetRegister() {
				  waitAndClick(link_AssetRegister, "Asset Register Link");
				}
			  
			  public void clickMyMaintenanceSchedule() {
				  waitAndClick(link_MyMaintenanceSchedule, "My Maintenance Schedule Link");
				}
			   
			  public void clickMaintenanceReminderEmails() {
				  waitAndClick(link_MaintenanceReminderEmails, "Maintenance Reminder Link");
				}
			  public void clickFixedAssetCategoryMaintenance() {
				  waitAndClick(link_FixedAssetCategoryMaintenance, "Fixed Asset Category Maintenance Link");
				}
			  
			  public void clickAddMaintainAssetLocations() {
				  waitAndClick(link_AddMaintainAssetLocations, "Add or Maintain Asset Locations Link");
				}
			   
			  public void clickFixedAssetmaintenanceTasks() {
				  waitAndClick(link_FixedAssetmaintenanceTasks, "Fixed Asset maintenance Tasks Link");
				}
}
