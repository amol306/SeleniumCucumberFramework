package StepDefs;

import io.cucumber.java.en.*;

public class loginSteps {
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step : User is on Login page");
	}

	@When("User enter username & password")
	public void user_enter_username_password() {
		System.out.println("Inside Step : User enter username & password");
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		System.out.println("Inside Step : Click on Login button");
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside Step : User is navigated to Home page");
	}
}
