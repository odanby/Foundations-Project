Feature: Testers should be able to decline pending defects assigned to them in the tester homepage

    Scenario: As a tester, I want to decline a pending defect if I determine it as low priority so I can focus on other defects

        Given the tester is on the tester homepage and wants to decline
        When the tester enters in a pending defects mission number to decline
        When the tester opens a dropdown of decline or accept and chooses to decline
        When the tester presses the update status button
        Then the tester should have updated the pending defects status to declined
