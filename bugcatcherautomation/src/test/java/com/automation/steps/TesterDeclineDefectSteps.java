package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterDeclineDefectSteps {


    @Given("the tester is on the tester homepage and wants to decline")
    public void the_tester_is_on_the_tester_homepage_and_wants_to_decline() {
        TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
    } 

    @When("the tester enters in a pending defects mission number to decline")
    public void the_tester_enters_in_a_pending_defects_mission_number_to_decline() {
        TestRunner.testerDeclineDefect.testerEnterDefectNameDecline("97987");
    } 

    @When("the tester opens a dropdown of decline or accept and chooses to decline")
    public void the_tester_opens_a_dropdown_of_decline_or_accept_and_chooses_to_decline() {
        TestRunner.testerDeclineDefect.dropdownDecline();
    } 

    @When("the tester presses the update status button")
    public void the_tester_presses_the_update_status_button() {
        TestRunner.testerDeclineDefect.updateDeclineMissionButton();
    } 

    @Then("the tester should have updated the pending defects status to declined")
    public void the_tester_should_have_updated_the_pending_defects_status_to_declined() {
        TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/tester-page.html");
    } 
    
}
