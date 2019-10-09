package com.nba.stepdefinition;



import java.util.List;

import com.nba.objectrepository.LoginHomepage;
import com.nba.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FBLogin extends Base {
	LoginHomepage l=new LoginHomepage();

	
	@Given("The user is in FB Home Page")
	public void the_user_is_in_FB_Home_Page() {
	   launch("https://www.facebook.com/");
	}
	
	@When("The user enters username and password and clicks submit button {string},{string}")
	public void the_user_enters_username_and_password_and_clicks_submit_button(String Username, String password) {
	  type(l.getName(), Username);
	  type(l.getPass(), password);
	  btn(l.getBtn());
	}

	@When("The user enters username and password and clicks submit button")
	public void the_user_enters_username_and_password_and_clicks_submit_button(DataTable dataTable) {
		 List<String> list = dataTable.asList(String.class);
		 type(l.getName(), list.get(0));
		 type(l.getPass(), list.get(1));
		 btn(l.getBtn());
	}

	@Then("The customer navigate into home page")
	public void the_customer_navigate_into_home_page() {
	    System.out.println("Success");
	}

	
}
