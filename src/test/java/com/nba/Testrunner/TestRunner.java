package com.nba.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\ExcelData.feature",
glue = "com.nba.stepdefinition",
dryRun=false,
monochrome=true,
plugin = {"html:target","json:src/test/resources/report.json"})

public class TestRunner {

	
	
}
