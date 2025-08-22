package com.weberp.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weberp.qa.base.TestBase1;


public class LoginPage  extends TestBase1{
		public WebDriver driver;
				
		//Constructor
		public LoginPage(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);//Initialize all web elements
				}
		//Locators
		
		
		 @FindBy(xpath = "//input[@placeholder='User name'and @type='text']")
		    WebElement txt_username;

		 @FindBy(xpath = "//input[@name='Password' and @type='password']")
		    WebElement txt_password;

		 @FindBy(xpath = "//input[@value='Login' and @type='submit']")
		    WebElement loginBtn;

		  @FindBy(id = "login_logo")
		    WebElement webErpLogo;
		  
		
		//Actions/Methods
		
		
		public boolean isWebErpLogoExist() {
			return webErpLogo.isDisplayed();
		}
		public void setUsername(String username) {
			txt_username.sendKeys(username);
			
		}
		public void setPassword(String password) {
			txt_password.sendKeys(password);
			
		}
		
		public void clickLoginButton(){
			loginBtn.click();
		}
		
		public void doLogin(String username, String password) {
			txt_username.sendKeys(username);
			txt_password.sendKeys(password);
			loginBtn.click();
			//return driver.getTitle();
		}
		 
		}


