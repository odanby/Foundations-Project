package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterRejectDefectSteps {
    
    @Given("the tester is on the tester homepage and wants to reject")
        public void the_tester_is_on_the_tester_homepage_and_wants_to_reject(){
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
    }

    @When("the tester enters in a pending defects mission number to accept for reject")
        public void the_tester_enters_in_a_pending_defects_mission_number_to_accept_for_reject() {
            TestRunner.testerRejectDefect.testerEnterDefectNameAcceptForReject("60400");
        }

    @When("the tester opens a dropdown of accept or decline and chooses to accept for reject")
        public void the_tester_opens_a_dropdown_of_accept_or_decline_and_chooses_to_accept_for_reject() {
            TestRunner.testerRejectDefect.dropdownAcceptForReject();
        }

    @When("the tester presses the update mission status button for reject")
        public void the_tester_presses_the_update_mission_status_button_for_reject() {
            TestRunner.testerRejectDefect.updateAcceptMissionButtonForReject();
        }
    
    @When("the tester sees a new dropdown of the accepted defects status options and chooses to reject")
        public void the_tester_sees_a_new_dropdown_of_the_accepted_defects_status_options_and_chooses_to_reject(){
            TestRunner.testerRejectDefect.dropdownReject();
    }

    @When("the tester presses the update outcome button")
        public void the_tester_presses_the_update_outcome_button(){
            TestRunner.testerRejectDefect.updateRejectMissionButton(); 
    }

    @Then("the tester should have updated the accepted defects status to rejected")
        public void the_tester_should_have_updated_the_accepted_defects_status_to_rejected(){
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
    }

}


