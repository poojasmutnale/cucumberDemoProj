package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Step- user on login page.");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("Inside Step - user enters valid credentials.");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println("Inside Step - clicks login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    System.out.println("Inside step- user navigated to home page");	}

	@When("user enters valid username1 and username123")
	public void user_enters_valid_username1_and_username123() {
	    System.out.println("Inside step- user1 enters id and password");
	}

	@When("user enters valid username2 and username234")
	public void user_enters_valid_username2_and_username234() {
		 System.out.println("Inside step- user2 enters id and password");
	}

}
