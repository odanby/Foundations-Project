package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerLogoutSteps {
    
    @Given("the manager is on their custom homepage")
    public void the_manager_is_on_their_custom_homepage() {
        TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/manager-page.html");
    } 
    
    // Log out of manager page steps below
    @When("the manager clicks the logout button and confirms they want to logout")
        public void the_manager_clicks_the_logout_button_and_confirms_they_want_to_logout() {
            TestRunner.managerLogout.managerClickLogoutButton();
        }
    
    @Then("the manager should be logged out and returned back to the login homepage")
        public void the_manager_should_be_logged_out_and_returned_back_to_the_login_homepage() {
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/homepage.html");
        }
}
