package com.nba.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nba.stepdefinition.Hook;

public class LoginHomepage {

	public LoginHomepage()
	{
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(id="email")
	private WebElement Name;
	
	@FindBy(id="pass")
	private WebElement Pass;
	
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement Btn;
	
	public WebElement getName() {
		return Name;
	}

	public WebElement getPass() {
		return Pass;
	}

	public WebElement getBtn() {
		return Btn;
	}
}
