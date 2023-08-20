package com.aiite.julyproject1.stepdefenition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
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

public class test {
	// Before the Feature starts
	@BeforeAll
	public static void beforeAll() {
		
		System.out.println("Before All");
	}

	// Before each scenario
	@Before
	public void before() {
		System.out.println("Before");
	}

	// Before each step
	@BeforeStep
	public void beforeStep(Scenario scenario) {
		System.out.println("Before Step");
	}

	// After each step
	@AfterStep
	public void afterStep(Scenario scenario) {
		scenario.isFailed();
		System.out.println("After Step");
	}

	// After each scenario
	@After
	public void after() {
		System.out.println("After");
	}

	// End of the feature
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

	@Given("load the addactine URL")
	public void load_the_addactine_url() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("load the addactine URL");
	}

	@When("Input Usernames")
	public void input_usernames(DataTable table) {
		// Write code here that turns the phrase above into concrete actions
		List<String> asList = table.asList();
		System.out.println(asList.get(0));
		System.out.println("Input Username");
	}

	@When("input Passwords")
	public void input_passwords(DataTable table) {
		// Write code here that turns the phrase above into concrete actions
		List<List<String>> asLists = table.asLists();
		List<String> list = asLists.get(0);
		System.out.println(list.get(1));
		System.out.println(asLists.get(1).get(0));
		System.out.println("input Password");
	}

	@When("click on the login buttons")
	public void click_on_the_login_buttons(DataTable table) {
		Map<String, String> asMap = table.asMap();
		System.out.println(asMap.get("username"));
		System.out.println(asMap.get("password"));
	}

	@Then("validate Search Hotel Page loadeds")
	public void validate_Search_Hotel_Page_loadeds(DataTable table) {
		List<Map<String, String>> asMaps = table.asMaps();
		Map<String, String> map = asMaps.get(0);
		System.out.println(map.get("username"));
		System.out.println(asMaps.get(1).get("username"));
	}

//	@When("Input Username {string}")
//	public void input_username(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Input Username");
//		System.out.println(string);
//	}
//
//	@When("input Password {string}")
//	public void input_password(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("input Password");
//		System.out.println(string);
//	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("click on the login button");
	}

	@Then("validate Search Hotel Page loaded")
	public void validate_search_hotel_page_loaded() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("validate Search Hotel Page loaded");
	}

	@Then("UserId should be available in search hotel page")
	public void user_id_should_be_available_in_search_hotel_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("UserId should be available in search hotel page");
	}

	@Then("testing the feature")
	public void testingTheFeature() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("testing the feature");
	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(int1);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

}
