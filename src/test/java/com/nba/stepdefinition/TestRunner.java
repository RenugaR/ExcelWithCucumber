package com.nba.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\renugadevi.ramesh\\eclipse-workspace\\Facebook\\src\\test\\resources\\Features\\FBLogin.feature",glue = "com.nba.stepdefinition",
plugin = {"html:target","json:src/test/resources/report.json"})

public class TestRunner {

	
	
}
