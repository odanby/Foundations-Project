package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterAcceptDefectSteps {
    
    @Given("the tester is on the tester homepage and wants to accept")
        public void the_tester_is_on_the_tester_homepage_and_wants_to_accept() {
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
        }

    @When("the tester enters in a pending defects mission number to accept")
        public void the_tester_enters_in_a_pending_defects_mission_number_to_accept() {
            TestRunner.testerAcceptDefect.testerEnterDefectNameAccept("63931");
        }

    @When("the tester opens a dropdown of accept or decline and chooses to accept")
        public void the_tester_opens_a_dropdown_of_accept_or_decline_and_chooses_to_accept() {
            TestRunner.testerAcceptDefect.dropdownAccept();
        }

    @When("the tester presses the update mission status button")
        public void the_tester_presses_the_update_mission_status_button() {
            TestRunner.testerAcceptDefect.updateAcceptMissionButton();
        }

    @Then("the tester should have updated the pending defects status to accepted")
        public void the_tester_should_have_updated_the_pending_defects_status_to_accepted() {
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
        }
}
