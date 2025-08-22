package com.Weberp.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.weberp.qa.base.TestBase1;
import com.weberp.qa.pages.LoginPage;


	@Listeners(com.weberp.qa.listener.ExtentReportListener.class)
	public class LoginPageTest extends TestBase1 {
	LoginPage loginpage;


	public LoginPageTest() {
		super();
	}


		@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new LoginPage(driver);
	}

		
		@Test(priority=1)
		public void isWebErpLogoExistTest() {
			boolean flag= loginpage.isWebErpLogoExist();
			Assert.assertTrue(flag);
		}
					
		@Test(priority=2)
		 public void doLoginTest() {
			String username = prop.getProperty("username");
	        String password = prop.getProperty("password");
	        loginpage.doLogin(username, password);
			}
		
				
		@AfterMethod
		public void tearDown() {
			driver.quit();
			
		}

	}


