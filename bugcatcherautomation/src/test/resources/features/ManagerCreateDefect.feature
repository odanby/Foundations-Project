Feature: Managers should be able to create and assign defects on the manager homepage

    Scenario: As a manager, I want to create and assign defects so testers can work on them

        Given the manager is on the manager homepage
        When the manager enters in a defect name
        When the manager enters in a defect description
        When the manager selects a specific tester
        When the manager clicks the confirm button
        Then the manager should have created and assigned a new pending defect
