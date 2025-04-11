Feature: Dummy Feature To Test Connectivivty
  As an SDET enthusiast
  I want to create a new Cucumber Selenium Project
  So that I can publish this project on my Github Repo

  Scenario Outline: TC_001_To Verify I have done setup
    Given I am a born to become an "<QA_Profile>" Enthusiast
    When I create a new Maven Project on IntelliJ
    And publish this project on "<Version_Control>"
    Then my repo will outshine in front of recruiters
    Examples:
      | QA_Profile | Version_Control |
      | SDET       | Github          |
      | QA         | SVN             |


