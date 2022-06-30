Feature: Users of my bug catcher application should be able to login to their respective homepages

    Scenario: As a manager, I want to sign in so I can view my custom homepage

        Given the manager is on the login page
        When the manager enters in their correct user name
        When the manager enters in their correct password
        When the manager clicks the login button
        Then the manager should be logged into the manager homepage