package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterShelveDefectSteps {
    
    @Given("the tester is on the tester homepage and wants to shelve")
        public void the_tester_is_on_the_tester_homepage_and_wants_to_shelve(){
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
        }

    @When("the tester enters in a pending defects mission number to accept for shelve")
        public void the_tester_enters_in_a_pending_defects_mission_number_to_accept_for_shelve() {
            TestRunner.testerShelveDefect.testerEnterDefectNameAcceptForShelve("66402");
        }

    @When("the tester opens a dropdown of accept or decline and chooses to accept for shelve")
        public void the_tester_opens_a_dropdown_of_accept_or_decline_and_chooses_to_accept_for_shelve() {
            TestRunner.testerShelveDefect.dropdownAcceptForShelve();
        }

    @When("the tester presses the update mission status button for shelve")
        public void the_tester_presses_the_update_mission_status_button_for_shelve() {
            TestRunner.testerShelveDefect.updateAcceptMissionButtonForShelve();
        }

    @When("the tester sees a new dropdown of the accepted defects status options and chooses to shelve")
        public void the_tester_sees_a_new_dropdown_of_the_accepted_defects_status_options_and_chooses_to_shelve(){
            TestRunner.testerShelveDefect.dropdownShelve();
        }

    @When("the tester presses the update outcome button for shelve")
        public void the_tester_presses_the_update_outcome_button_for_shelve(){
            TestRunner.testerShelveDefect.updateShelveMissionButton(); 
    }

    @Then("the tester should have updated the accepted defects status to shelved")
        public void the_tester_should_have_updated_the_accepted_defects_status_to_shelved(){
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
    }
}
