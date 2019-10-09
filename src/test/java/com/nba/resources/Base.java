package com.nba.resources;

import org.openqa.selenium.WebElement;

import com.nba.stepdefinition.Hook;


public class Base {
	public  void launch(String url) {
		 Hook.driver.get(url);

		}
		public void type(WebElement ele,String name) {
			
			ele.sendKeys(name);
		}
		public void btn(WebElement ele) {
			
			ele.click();

		}
}
