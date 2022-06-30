package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerCreateDefectSteps {
    
    // Agnostic Given below
    @Given("the manager is on the manager homepage")
        public void the_manager_is_on_the_manager_homepage() {
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/manager-page.html");
        }
    
    // Create defect steps below    
    @When("the manager enters in a defect name")
        public void the_manager_enters_in_a_defect_name() {
            TestRunner.managerCreateDefect.createDefectName("Mammoth (Test Create Defect)");
        }
    
    @When("the manager enters in a defect description")
        public void the_manager_enters_in_a_defect_description() {
            TestRunner.managerCreateDefect.createDefectDesc("Wearing that tank top (Test Create Defect)");
        }

    @When("the manager selects a specific tester")
        public void the_manager_selects_a_specific_tester() {
            TestRunner.managerCreateDefect.assignTesterChoice();
        }

    @When("the manager clicks the confirm button")
        public void the_manager_clicks_the_confirm_button() {
            TestRunner.managerCreateDefect.confirmCreateAssignDefectButton();
        }

    @Then("the manager should have created and assigned a new pending defect")
        public void the_manager_should_have_created_and_assigned_a_new_pending_defect(){
            TestRunner.driver.get("File://C:/Users/orian/Revature/Projects/Bug-Catcher/BugCatcherJava/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/manager-page.html");
        }

}
