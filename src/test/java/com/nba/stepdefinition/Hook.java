package com.nba.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	 public static WebDriver driver;
		
		@Before
		public void beforeBackground() {
			System.setProperty("webdriver.chrome.driver", "E:\\MavenPOMBaseIntegration-master\\MavenPOMBaseIntegration-master\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		@After
		public void afterScenario() {
			
			driver.quit();
}
}
