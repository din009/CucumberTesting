package com.aiite.julyproject1.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageFactory {

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "re_password")
	private WebElement rePassword;

	@FindBy(id = "full_name")
	private WebElement fullName;

	@FindBy(id = "email_add")
	private WebElement emailAdd;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRePassword() {
		return rePassword;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailAdd() {
		return emailAdd;
	}

	public RegisterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
