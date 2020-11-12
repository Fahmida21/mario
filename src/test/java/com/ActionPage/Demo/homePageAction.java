package com.ActionPage.Demo;

import org.testng.Assert;

import com.LocatorPage.demo.homePageLocator;
import com.TestUtil.testBase;
import com.TestUtil.utility;

public class homePageAction extends testBase {

	homePageLocator HomePageLocator = new homePageLocator();
		
	public void ClickonSigninLink()  {
		HomePageLocator.SigninLink.click();	
		
	}
	
	public void ClickonSigninButton() {
		HomePageLocator.SigninButton.click();
		
	}
	
	public void userCredential(String u, String p)  {
		HomePageLocator.Username.sendKeys(u);
		HomePageLocator.Password.sendKeys(p);
		HomePageLocator.Loginbutton.click();
		
	}
	public void Verifyuserloginsuccessfully() {
		boolean verifyresult= HomePageLocator.VerifyLogin.isDisplayed();
		Assert.assertTrue(verifyresult);
		utility.takescreenshot(driver, "ProfilePage");
	}
	
	public void Typeproductname() {
		HomePageLocator.SearchField.sendKeys("XPS");
		
	}
	public void Clicksearch() {
		
		HomePageLocator.Clicksearch.click();
		
	}	
	public void VerifySearchresult() {
		boolean VerifySearchresult= HomePageLocator.VerifySearchREsult.isDisplayed();
		Assert.assertTrue(VerifySearchresult);
		utility.takescreenshot(driver, "SearchPage");
		
	}
	
	public void Clickonproduct() {
		HomePageLocator.Clickonproduct.click();
	}
	
	public void ClickonEletronicsandAccessories(){
		HomePageLocator.ClickonEletronicsandAccessories.click();
		
	}
	public void SelectHomebutton() {
		HomePageLocator.SelectHomebutton.click();
		
	}
	public void Verifythesearchpage() {
		
		boolean VerifySearchresult1= HomePageLocator.Verifythesearchpage.isDisplayed();
		Assert.assertTrue(VerifySearchresult1);
		utility.takescreenshot(driver, "ProductsPage");
		
	}

	}
	
	
	
	
	
	
	
	

