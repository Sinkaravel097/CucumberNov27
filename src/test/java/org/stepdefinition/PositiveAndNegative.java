package org.stepdefinition;

import org.base.classes.BaseClass;

import org.pojo.classes.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PositiveAndNegative extends BaseClass {
	
	LoginPOJO l;
	
	@Given("User has to launch the browser and max the window")
	public void user_has_to_launch_the_browser_and_max_the_window() {
		
		launchBrowser();
	}

	@When("User has the launch the url")
	public void user_has_the_launch_the_url() {
		
		launchUrl("https://www.facebook.com/");
	}

	@When("To pass the bulk of {string} datas to email field")
	public void to_pass_the_bulk_of_datas_to_email_field(String em) {
		
		l = new LoginPOJO();
		passText(l.getEmailTxt(), em);
	}

	@When("To pass the bulk of datas to password {string} field")
	public void to_pass_the_bulk_of_datas_to_password_field(String pass) {
		
		passText(l.getPasswordTxt(), pass);
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		
		clickWebElement(l.getLoginFindAll());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		
		closeTheBrowser();
	}
}
