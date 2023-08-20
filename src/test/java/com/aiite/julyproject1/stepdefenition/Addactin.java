package com.aiite.julyproject1.stepdefenition;

import org.junit.Assert;

import com.aiite.julyproject1.pagefactory.LoginPageFactory;
import com.aiite.julyproject1.pagefactory.RegisterPageFactory;
import com.aiite.julyproject1.reporterutils.ExtentManager;
import com.aiite.julyproject1.utils.BaseUtils;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addactin extends BaseUtils{
	
	
	@BeforeAll
	public static void beforeAll() {
		ExtentManager.getInstance();
	}
	
	@Before
	public void before(Scenario scenario) {
		ExtentManager.createReportTest(scenario.getName());
		initDriver();
	}
	
	@BeforeStep
	public void beforeStep(Scenario scenario) {
		System.out.println("Before Step");
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		if(scenario.isFailed()) {
			ExtentManager.extentTest.log(Status.FAIL, scenario.getLine()+"Testcase Failed", MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot(driver)).build());
		}else {
			ExtentManager.extentTest.log(Status.PASS, scenario.getLine()+"Testcase Pass");
		}
	}
	
	@After
	public void after() {
		teardown();
	}
	
	@AfterAll
	public static void afterAll() {
		ExtentManager.flushreport();
	}
	LoginPageFactory login = null;
	RegisterPageFactory register = null;
	
	@Given("load the adactin url \\({string})")
	public void load_the_adactin_url(String string) {
		getUrl(string);
	}

	@Given("click new register here link")
	public void click_new_register_here_link() {
		login = new LoginPageFactory(driver);
		clickElement(login.getNewUserRegister());
		
	}
	
	@When("Input Username {string}")
	public void input_username(String string) {
		register = new RegisterPageFactory(driver);
		inputText(register.getUsername(), string);
	}
	
	@When("input Password {string}")
	public void input_password(String string) {
		inputText(register.getPassword(), string);
	}


	@When("input ConfirmPassword {string}")
	public void input_confirm_password(String string) {
		inputText(register.getRePassword(), string);
	}

	@When("input Full Name {string}")
	public void input_full_name(String string) {
		inputText(register.getFullName(), string);
	}

	@When("input Email Address {string}")
	public void input_email_address(String string) {
		inputText(register.getEmailAdd(), string);
	}

	@When("click on Register")
	public void click_on_register() {
		Assert.assertEquals(true, false);
	    System.out.println("Click on Register");
	}

	@Then("validate Register is sucessful")
	public void validate_register_is_sucessful() {
		System.out.println("validate Register is sucessful");
	}

}
