Feature: Default Check
  Scenario:To test the default entries in the application

    Given Application is launched with all desired capabilities
    And  User clicks on arrow button of MyTrips Screen
    And User clicks on arrow button of WishList Screen
    And User clicks on arrow button of Explore Screen
    And User clicks on the done button of HostelsSpeak sceen
    Then Search screen is displayed
    When User checks for the default guest
    And Verify that default guest number is "2"


