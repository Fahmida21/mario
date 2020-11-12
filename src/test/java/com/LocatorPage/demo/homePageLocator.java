package com.LocatorPage.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestUtil.testBase;

public class homePageLocator extends testBase{

	public homePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Sign In']")
	public WebElement SigninLink;
	
	@FindBy(how=How.XPATH,using="//a[text()='Sign In']")
	public WebElement SigninButton;
	
	@FindBy(how=How.ID,using="EmailAddress")
	public WebElement Username;
	
	@FindBy(how=How.ID,using="Password")
	public WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@id='sign-in-button']")
	public WebElement Loginbutton;
	
	@FindBy(how=How.XPATH,using="//span[text()='Fahmida Nahar']")
	public WebElement VerifyLogin;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@class='mh-search-input']")
	public WebElement SearchField;
	
	@FindBy(how=How.XPATH,using="//span[@class='mh-search-button-label']")
	public WebElement Clicksearch;
	
	@FindBy(how=How.XPATH,using="//a[text()='Designed to be the best.']")
	public WebElement VerifySearchREsult;
	
	
	
	
	@FindBy(how=How.XPATH,using="//button[@id='l1']")
	public WebElement Clickonproduct;
	
	@FindBy(how=How.XPATH,using="//span[text()=' Electronics & Accessories']")
	public WebElement ClickonEletronicsandAccessories;
	
	@FindBy(how=How.XPATH,using="//img[@alt='View all Electronics & Accessories for Home']")
	public WebElement SelectHomebutton;
	
	@FindBy(how=How.XPATH,using="//h1[text()='Electronics & Accessories']")
	public WebElement Verifythesearchpage;
	

	
	
}
