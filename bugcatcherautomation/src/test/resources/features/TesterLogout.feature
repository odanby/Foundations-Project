Feature: Testers should be able to log out of the tester homepage

    Scenario: As a tester, I want to log out of my custom homepage so I can keep my account secure when I am not using it

        Given the tester is on their custom homepage
        When the tester clicks the logout button and confirms they want to logout
        Then the tester should be logged out and returned back to the login homepage