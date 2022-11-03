Feature: Booking

  Scenario: Successful Booking in the page
    Given I open edge browser
    When I navigate to website
    And I type all data to form
    And I hit Enter
    Then I should be shown the results