package org.stepdefinition;

import org.base.classes.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before(order=7)
	public void preCondition1() {
		maxWindow();
		System.out.println("Precondition1");
	}
	
	@Before(order=3)
	public void preCondition2() {
		launchBrowser();
		System.out.println("Precondition2");
	}
	
	@Before(order=9)
	public void preCondition3() {
		System.out.println("Precondition3");
	}
	

	@After(order=6)
	public void postCondition1() {

		closeTheBrowser();
		System.out.println("Postcondition 1");
	}
	
	@After(order=14)
	public void postCondition2(Scenario s) {

		if (s.isFailed()) { // if your scenario got failed --> isFailed() it will return true
			
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] sc = t.getScreenshotAs(OutputType.BYTES);
			s.embed(sc, "image/png"); // it will attach the failed scenario screenshot in html report
			System.out.println("Failed : " + s.getName());  
		}
	}
	
	
	

}
