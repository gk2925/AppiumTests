Feature: to test the search of multiple cities around the workd

  Scenario Outline: To test the international search
    Given User is at the  launch page and navigates till search screen
    When User tries to enter the regional "<cityName>"
    And User tries to increment the default guests
    And User click on search button on search page
    Then search results are displayed
    And All results are having the background image
    And All results are having some rating
    And All results are having some price
    Examples:
      | cityName  |
      | Berlin    |
      | Singapore |
      | Mumbai    |
      | Perth     |

