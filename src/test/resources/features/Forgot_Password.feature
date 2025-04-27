Feature: Forgot Password Feature

  Scenario Outline: TC_001_To Verify User is able to recover his password
    Given User am on the Login page
    When I click on Forgot Your password link
    And I provide my "<emailAddress>"
    And I click on Send button
    Then "<Recovery_Message>" should be displayed
    And I should recover my password

    Examples:
      | emailAddress        | Recovery_Message |
      | testernew@gmail.com | Page Expired     |

