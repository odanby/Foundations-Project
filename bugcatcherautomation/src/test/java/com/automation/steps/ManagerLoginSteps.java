package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ManagerLoginSteps {

    /*
     * Agnostic steps
     */

    @Given("the manager is on the login page")
        public void the_manager_is_on_the_login_page() {
            // When telling Selenium to get a local file, you have to add File:// to the start of the URL
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/bugcatcherautomation/src/test/resources/webpages/homepage.html");
        }
    
    @When("the manager clicks the login button")
        public void the_manager_clicks_the_login_button() {
            TestRunner.managerLogin.managerClickLoginButton();
        }

    /*
     * Manager steps
     */

    @When("the manager enters in their correct user name")
        public void the_manager_enters_in_their_correct_user_name() {
            TestRunner.managerLogin.managerEnterUsername("Manager");
        }

    @When("the manager enters in their correct password")
        public void the_manager_enters_in_their_correct_password() {
            TestRunner.managerLogin.managerEnterPassword("Automation");
        }
    
    @Then("the manager should be logged into the manager homepage")
        public void the_manager_should_be_logged_into_the_manager_homepage() {
        // this methods checks that my simulated manager has actually ended up on the manager page
            TestRunner.wait.until(ExpectedConditions.titleIs("Mayor of Jump City Homepage"));
            String title = TestRunner.driver.getTitle();
            Assert.assertEquals("Mayor of Jump City Homepage", title);
        }
}
