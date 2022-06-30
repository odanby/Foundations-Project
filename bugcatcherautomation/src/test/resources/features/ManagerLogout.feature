Feature: Managers should be able to log out of the manager homepage

    Scenario: As a manager, I want to log out of my custom homepage so I can keep my account secure when I am not using it

        Given the manager is on their custom homepage
        When the manager clicks the logout button and confirms they want to logout
        Then the manager should be logged out and returned back to the login homepage