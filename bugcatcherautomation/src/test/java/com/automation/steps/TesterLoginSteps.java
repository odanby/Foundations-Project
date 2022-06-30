package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TesterLoginSteps {

    /*
     * Agnostic steps
     */

    @Given("the tester is on the login page")
        public void the_tester_is_on_the_login_page() {
            // When telling Selenium to get a local file, you have to add File:// to the start of the URL
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/homepage.html");
        }
    
    @When("the tester clicks the login button")
        public void the_tester_clicks_the_login_button() {
            TestRunner.testerLogin.testerClickLoginButton();
        }
    /*
     * Tester steps
     */

    @When("the tester enters in their correct user name")
        public void the_tester_enters_in_their_correct_user_name() {
            TestRunner.testerLogin.testerEnterUsername("Tester");
        }

    @When("the tester enters in their correct password")
        public void the_tester_enters_in_their_correct_password() {
            TestRunner.testerLogin.testerEnterPassword("Automation");
        }

    @Then("the tester should be logged into the tester homepage")
        public void the_tester_should_be_logged_into_the_tester_homepage() {
            TestRunner.wait.until(ExpectedConditions.titleIs("Tester Page"));
            String title = TestRunner.driver.getTitle();
            Assert.assertEquals("Tester Page", title);
        }

}
