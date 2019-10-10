package com.nba.stepdefinition;

import com.nba.objectrepository.LoginHomepage;
import com.nba.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithExcel extends Base{
	LoginHomepage l=new LoginHomepage();
	
	@Given("The CUSTOMER is in FB Home")
	public void the_CUSTOMER_is_in_FB_Home() {
		 launch("https://www.facebook.com/");
	}

	@When("The CUSTOMER enters username and password and clicks submit button")
	public void the_CUSTOMER_enters_username_and_password_and_clicks_submit_button() {
	    type(l.getName(), readvaluefromExcelSheet().get(1).get("Username"));
	    type(l.getPass(), readvaluefromExcelSheet().get(1).get("Password"));
	    btn(l.getBtn());
	}

	@Then("The Customer see the home page")
	public void the_Customer_see_the_home_page() {
	 System.out.println("Success");
	}

	}

