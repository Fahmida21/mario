package Stepdep;

import com.ActionPage.Demo.homePageAction;
import com.TestUtil.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class homePageStepDep extends testBase {

	homePageAction HomePageAction= new homePageAction();
	

    @Given("^launch \"([^\"]*)\"$")
    public void launch(String URL) throws Throwable {
	        getURL(URL);
    }
	@Then("^Click on Signin Link$")
	public void Click_on_Signin_Link() throws Throwable {
		HomePageAction.ClickonSigninLink();
	}

	@Then("^Click on Signin Button$")
	public void Click_on_Signin_Button() throws Throwable {
		HomePageAction.ClickonSigninButton();
	}

	@Then("^Enter UserPass and click login$")
	public void Enter_UserPass_and_click_login() throws Throwable {
		HomePageAction.userCredential(pro.getProperty("username1"), pro.getProperty("password1"));
	}
	
	@Then("^Verify user login successfully$")
	public void Verify_user_login_successfully() throws Throwable {
		HomePageAction.Verifyuserloginsuccessfully();
	}	
	

	
	@Then("^Type product name$")
	public void type_product_name() throws Throwable {
		HomePageAction.Typeproductname();
	}

	@Then("^Click search$")
	public void click_search() throws Throwable {
		HomePageAction.Clicksearch();
	}

	@Then("^Verify Search result$")
	public void verify_Search_result() throws Throwable {
		HomePageAction.VerifySearchresult();
	}
	
	
	@Then("^Click on product$")
	public void click_on_product() throws Throwable {
		HomePageAction.Clickonproduct();
	}

	@Then("^Click on Eletronics and Accessories$")
	public void click_on_Eletronics_and_Accessories() throws Throwable {
		HomePageAction.ClickonEletronicsandAccessories();
	}

	@Then("^Select Home button$")
	public void select_Home_button() throws Throwable {
		HomePageAction.SelectHomebutton();
	}

	@Then("^Verify the search page$")
	public void verify_the_search_page() throws Throwable {
		HomePageAction.Verifythesearchpage();
	}
		
	
}

