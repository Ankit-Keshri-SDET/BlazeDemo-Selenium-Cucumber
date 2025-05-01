@Regression
Feature: E2E Flight Booking as Logged In user

  Scenario Outline: TC_001_To Verify User is able to book flight on the website
    Given I am on the homepage of the BlazeDemo website
    When I select the "<departure_city>", "<destination_city>" from dropdown
    And I click on the Find Flights button
    Then I should verify the "<departure_city>", "<destination_city>" on the page
    When I choose a flight for my booking
    Then I should verify the "<Flight_Reserved_Message>" on the page
    And I provide personal details
      | name      | address      | city   | state | zipCode | cardType | creditCardNumber | month | year | nameOnCard |
      | TesterNew | Demo Address | London | UK    | 801919  | Visa     | 451678881111     | 11    | 2028 | Tester New |
    And I click on Purchase Flight button
    Then I should see the "<Success_Message>"
    And My flight details should be displayed

    Examples:
      | departure_city | destination_city | Success_Message                    | Flight_Reserved_Message |
      | Boston         | New York         | Thank you for your purchase today! | has been reserved       |


  Scenario Outline: TC_002_To Verify User is able to book specific airline flight for his journey
    Given I am on the homepage of the BlazeDemo website
    And I have my personal details as
      | name      | address      | city   | state | zipCode |
      | TesterNew | Demo Address | London | UK    | 801919  |
    When I select the "<departure_city>", "<destination_city>" from dropdown
    And I click on the Find Flights button
    Then I should verify the "<departure_city>", "<destination_city>" on the page
#    When I choose the "<airline_name>" Airline flight for my booking
    When I choose a flight for my booking
    Then I should verify the "<Flight_Reserved_Message>" on the page
    And I enter my personal details on the page
    And I provide card details
      | cardType | creditCardNumber | month | year | nameOnCard |
      | Visa     | 451678881111     | 11    | 2028 | Tester New |
    And I click on Purchase Flight button
    Then I should see the "<Success_Message>"
    And My flight details should be displayed

    Examples:
      | departure_city | destination_city | Success_Message                    | airline_name   | Flight_Reserved_Message |
      | Portland       | Rome             | Thank you for your purchase today! | Lufthansa      | has been reserved       |
      | Philadelphia   | Berlin           | Thank you for your purchase today! | Virgin America | has been reserved       |
