Feature: Users of my bug catcher application should be able to login to their respective homepages

    Scenario: As a tester, I want to sign in so I can view my custom homepage

        Given the tester is on the login page
        When the tester enters in their correct user name
        When the tester enters in their correct password
        When the tester clicks the login button
        Then the tester should be logged into the tester homepage