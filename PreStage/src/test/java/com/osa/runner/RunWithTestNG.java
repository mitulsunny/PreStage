package com.osa.runner;


	

	import cucumber.api.CucumberOptions;
	import cucumber.api.testng.AbstractTestNGCucumberTests;


	@CucumberOptions(
			features= {"src/test/java/com/osa/features/locators.feature"},
			glue= {"com.osa.Steps"},
			tags= {"@forumLoginPage"},
			// plugin = {"pretty","html:target/osaTest"}
			plugin = {"pretty","html:target/cucumber.reports/report","json:target/cucumber.reports/report.json"}
			)
	public class RunWithTestNG extends AbstractTestNGCucumberTests{

	}


