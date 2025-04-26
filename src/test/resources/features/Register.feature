Feature: Register to the Website to become a customer

  Scenario Outline: TC_001_To Verify User is able to register to the Website
    Given I am on the Register Page
    When I enter my "<name>", "<company>", "<email>"
    And I enter my "<password>", "<confirmPassword>"
    And I click on the Register button
    Then User should be navigated to the Account page
    And "<Success_Message>" should be displayed

    Examples:
      | name       | company | email         | password | confirmPassword | Success_Message |
      | Tester New | Softcon | sba@gmail.com | Pass123  | Pass123         | Page Expired    |