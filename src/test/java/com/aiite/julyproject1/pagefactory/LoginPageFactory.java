package com.aiite.julyproject1.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	@FindBy(linkText = "New User Register Here")
	private WebElement newUserRegister;

	public WebElement getNewUserRegister() {
		return newUserRegister;
	}
	
	public LoginPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
