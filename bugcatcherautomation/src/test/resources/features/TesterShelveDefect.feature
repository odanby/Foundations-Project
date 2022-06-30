Feature: Testers should be able to update an accepted defect's status to shelved

    Scenario: As a tester, I want to update an accepted defect's status to shelved if I cannot fix the bug

        Given the tester is on the tester homepage and wants to shelve
        When the tester enters in a pending defects mission number to accept for shelve
        When the tester opens a dropdown of accept or decline and chooses to accept for shelve
        When the tester presses the update mission status button for shelve
        When the tester sees a new dropdown of the accepted defects status options and chooses to shelve
        When the tester presses the update outcome button for shelve
        Then the tester should have updated the accepted defects status to shelved