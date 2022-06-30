Feature: Testers should be able to update an accepted defect's status to fixed

    Scenario: As a tester, I want to update an accepted defect's status to fixed if I fixed the bug

        Given the tester is on the tester homepage and wants to fix
        When the tester enters in a pending defects mission number to accept for fix
        When the tester opens a dropdown of accept or decline and chooses to accept for fix
        When the tester presses the update mission status button for fix
        When the tester sees a new dropdown of the accepted defects status options and chooses to fix
        When the tester presses the update outcome button for fix
        Then the tester should have updated the accepted defects status to fixed