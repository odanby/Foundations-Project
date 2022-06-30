Feature: Testers should be able to update an accepted defect's status to rejected

    Scenario: As a tester, I want to update an accepted defect's status to rejected if I determine it as an invalid bug

        Given the tester is on the tester homepage and wants to reject
        When the tester enters in a pending defects mission number to accept for reject
        When the tester opens a dropdown of accept or decline and chooses to accept for reject
        When the tester presses the update mission status button for reject
        When the tester sees a new dropdown of the accepted defects status options and chooses to reject
        When the tester presses the update outcome button
        Then the tester should have updated the accepted defects status to rejected