Feature: Login Feature
  As a registered user
  I want to login into my account
  So that I can book flight

  Scenario Outline: TC_001_To Verify User is able to login
    Given User am on the Login page
    When User enter my "<username>" and "<password>"
    And User click on Remember Me checkbox
    And User click on Login button
    Then User should be navigated to the Home page
    And "<Success_Message>" should be displayed


    Examples:
      | username       | password  | Success_Message |
      | xyaz@gmail.com | random123 | Page Expired    |

