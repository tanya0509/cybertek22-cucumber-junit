package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @Given("user is non the login page")
    public void user_is_non_the_login_page() {
        System.out.println("User is on the login page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");
    }

}
