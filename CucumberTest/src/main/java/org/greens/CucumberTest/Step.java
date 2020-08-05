package org.greens.CucumberTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

	@Given("^user launch the browser and amazon application$")
	public void user_launch_the_browser_and_amazon_application() throws Throwable {
		System.out.println("1");
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		System.out.println(arg1);
		System.out.println(arg2);
	}

	@Then("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		System.out.println("3");
	}

	@Then("^user verify homepage$")
	public void user_verify_homepage() throws Throwable {
		System.out.println("4");
	}
}
