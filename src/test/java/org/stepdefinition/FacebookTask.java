package org.stepdefinition;

import org.base.classes.BaseClass;

import org.junit.Assert;
import org.pojo.classes.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class FacebookTask extends BaseClass {
	
	LoginPOJO l;
	
	@Given("User has to launch the chrome browser and max the window")
	public void user_has_to_launch_the_chrome_browser_and_max_the_window() {
	    
		launchBrowser();
	}

	@When("User has to launch the fb application in browser")
	public void user_has_to_launch_the_fb_application_in_browser() {
	    
		launchUrl("https://www.facebook.com/");
	}

	@When("User has to pass invalid username in email field")
	public void user_has_to_pass_invalid_username_in_email_field() {
	    
		l = new LoginPOJO();
		passText(l.getEmailTxt(), "selenium@gmail.com");
	}

	@When("User has to pass invalid password in password field")
	public void user_has_to_pass_invalid_password_in_password_field() {
	    
		passText(l.getPasswordTxt(), "845678");
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
	    
		clickWebElement(l.getLoginFindAll());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    
		closeTheBrowser();
	} 
	
}
