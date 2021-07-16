Feature: Google search functionality
  Agile Story: As a user, when I am on the google
  search page, I should be able to search whatever
  I want, and see relevant information

  Scenario: Search page title verification
    Given User is on Google home page
    Then User should see apple in the title is Google


    Scenario: User search title verification
    Given  User is on Google home page
    When User searches for "wooden spoon"
    Then User should see "wooden spoon" in the title