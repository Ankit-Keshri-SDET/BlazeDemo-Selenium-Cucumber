Feature: Login Feature
  As a registered user
  I want to login into my account
  So that I can book flight

  Scenario Outline: TC_001_To Verify User is able to login
    Given User am on the Login page
    When User enter email and password as "<username>" and "<password>"
    And User click on Remember Me checkbox
    And User click on Login button
    Then User should be navigated to the Account page of "<current_Scenario>"
    And "<Success_Message>" should be displayed

    Examples:
      | username       | password  | Success_Message | current_Scenario |
      | xyaz@gmail.com | random123 | Page Expired    | Login            |

