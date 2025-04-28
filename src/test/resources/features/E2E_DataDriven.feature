Feature: Data Driven Testing With Different Source and Destination Cities

  Scenario : TC_001_To Verify user is able to choose flight
    Given I am on the homepage of the BlazeDemo website
    When I select "Boston", "New York" as source and destination city
    And I click on the Find Flights button

  Scenario Outline: TC_002_To Verify user is able to choose flight - Multiple Cities
    Given I am on the homepage of the BlazeDemo website
    When I select "<src>", "<dest>" as source and destination city
    And I click on the Find Flights button
    Then I should verify the "<src>", "<dest>" on the page
    When I choose a flight for my booking
    Then I should verify the "<Flight_Reserved_Message>" on the page

    Examples:
      | src         | dest   | Flight_Reserved_Message |
      | Paris       | Rome   | has been reserved       |
      | Portland    | London | has been reserved       |
      | San Diego   | Berlin | has been reserved       |
      | Mexico City | Cairo  | has been reserved       |


