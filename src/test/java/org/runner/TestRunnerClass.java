package org.runner;

import org.customreport.GenerateJvm;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources", 
				glue = "org.stepdefinition", 
				monochrome = true, 
				dryRun = false, 
				strict = true, 
				snippets = SnippetType.CAMELCASE, 
				plugin = {"html:target", "junit:xmlreport\\xmlrepo.xml", "json:jsonreport\\output.json" , 
						"rerun:src\\test\\resources\\failed.txt" })
public class TestRunnerClass {

	@AfterClass
	public static void reportGeneration() {

		GenerateJvm.jvmRepo("C:\\Users\\VISHAL\\eclipse-workspace\\Cucumber_8.30am\\jsonreport\\output.json");

	}

}
