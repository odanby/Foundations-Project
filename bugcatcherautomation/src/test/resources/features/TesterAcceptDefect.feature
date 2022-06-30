Feature: Testers should be able to accept pending defects assigned to them in the tester homepage

    Scenario: As a tester, I want to accept a pending defect if I determine it as a valid bug so I can begin working on it

        Given the tester is on the tester homepage and wants to accept
        When the tester enters in a pending defects mission number to accept
        When the tester opens a dropdown of accept or decline and chooses to accept
        When the tester presses the update mission status button
        Then the tester should have updated the pending defects status to accepted