package org.pojo.classes;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {

	// 1. Non parametrized constructor
	public LoginPOJO() { 
		
		PageFactory.initElements(driver, this);
	}

	// 2. Private WebElements   
	// WebElement email = driver.findElement(By.id("attribute value"));
	
	@CacheLookup 
	@FindBy(id = "email")
	private WebElement emailTxt;
	
	@CacheLookup
	@FindBy(name = "pass")
	private WebElement passwordTxt;
	
	@CacheLookup
	@FindBy(id = "u_0_5_ym")
	private WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement accBtn;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement radio;
	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signUp;
	
	@CacheLookup
	@FindBys({ // Acts like AND operator
		
		@FindBy(xpath="//button[text()='Log in']"),
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@id='u_0_5_ym']"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement loginFindBys;
	
	@CacheLookup
	@FindAll({ // Acts like OR operator
		
		@FindBy(xpath="//button[text()='Log in']"),
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@id='u_0_5_ym']"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement loginFindAll;
	
 	
	// 3. Getters to access those private WebElements outside the class
	
	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLoginFindBys() {
		return loginFindBys;
	}

	public WebElement getLoginFindAll() {
		return loginFindAll;
	}

	public WebElement getAccBtn() {
		return accBtn;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSignUp() {
		return signUp;
	} 
	
}
