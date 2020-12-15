Feature: Login scenario

  Scenario:To test the valid credentials of the app

    Given User is at the MyTrips screen of the application
    And  User clicks on arrow button of MyTrips Screen
    And User clicks on arrow button of WishList Screen
    And User clicks on arrow button of Explore Screen
    And User clicks on the done button of HostelsSpeak sceen
    Then Search screen is displayed
    When User clicks on the profile icon
    And Click on login button on MapAdventure screen
    Then Login screen is displayed
    When User enters the valid credentials
    Then user is logged successfully


  Scenario Outline: To test the invalid credentials of the app
    Given User is at the MyTrips screen of the application
    And  User clicks on arrow button of MyTrips Screen
    And User clicks on arrow button of WishList Screen
    And User clicks on arrow button of Explore Screen
    And User clicks on the done button of HostelsSpeak sceen
    Then Search screen is displayed
    When User clicks on the profile icon
    And Click on login button on MapAdventure screen
    Then Login screen is displayed
    When User enters the invalid "<username>" and invalid "<password>"
    Then verify that error message is being displayed
    Examples:
      | username           | password     |
      | abcd@gmail.com     | abcd         |
      | cbd@rediffmail.com | cgdetest1234 |








