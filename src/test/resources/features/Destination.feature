Feature: Destination of the week feature
  As a new or already registered user
  I want to view the hot destination for the week
  So that I can plan my own travel upfront

  @Sanity
  Scenario: TC_001_To Verify User is able to view the destination of the week place
    Given I am on the homepage of the BlazeDemo website
    When I click on the "destination of the week" link
    Then I should be redirected to the "https://blazedemo.com/vacation.html"
    And I should see the image of the place

