Feature: Etsy search feature




  Scenario: Etsy default title verification
    Given user is on the Etsy landing page
    Then user should see Etsy title as expected

    #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  Scenario: Etsy Search Functionality Title Verification
    Given user is on the Etsy landing page
    When user types Wooden Spoon in the search bar
    And user clicks on search button
    Then user should see Etsy title is Wooden spoon | Etsy
