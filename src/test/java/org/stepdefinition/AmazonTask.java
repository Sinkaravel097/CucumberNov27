package org.stepdefinition;

import java.util.List;

import java.util.Map;

import org.base.classes.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AmazonTask extends BaseClass {

	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {

		launchBrowser();
	}

	@When("To launch the amz application")
	public void to_launch_the_amz_application() {

		launchUrl(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field(DataTable d) {

		WebElement emTxt = driver.findElement(By.id("ap_email"));
		Map<String, String> m = d.asMap(String.class, String.class);
		passText(emTxt, m.get("emailtwo"));
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {

		WebElement cont = driver.findElement(By.id("continue"));
		clickWebElement(cont); 
	}

	@When("To enter the invalid password in password field")
	public void to_enter_the_invalid_password_in_password_field(DataTable d) {
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		List<Map<String, String>> m = d.asMaps(); 
		passText(pass, m.get(1).get("passtwo"));
	}
	
	@When("To click the signin button")
	public void toClickTheSigninButton() {
		WebElement signIn = driver.findElement(By.id("signInSubmit"));
		clickWebElement(signIn); 
	}


	@Then("Close browser")
	public void close_browser() {
		
		closeTheBrowser();
	}

}
