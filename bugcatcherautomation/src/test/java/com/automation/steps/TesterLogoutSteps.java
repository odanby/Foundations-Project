package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterLogoutSteps {
    
    @Given("the tester is on their custom homepage")
    public void the_tester_is_on_their_custom_homepage() {
        TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
    } 
    
    // Log out of tester page steps below
    @When("the tester clicks the logout button and confirms they want to logout")
        public void the_tester_clicks_the_logout_button_and_confirms_they_want_to_logout() {
            TestRunner.testerLogout.testerClickLogoutButton();
        }
    
    @Then("the tester should be logged out and returned back to the login homepage")
        public void the_tester_should_be_logged_out_and_returned_back_to_the_login_homepage() {
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/bugcatcherautomation/src/test/resources/webpages/homepage.html");
        }
}
