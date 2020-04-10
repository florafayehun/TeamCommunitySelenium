@run3
Feature: Discover Community
  Scenario Outline: Discover Community by category and Location

  Given A registered user is logged into Giftrete website
    When A registered user clicks on Community tab
    And The user clicks on the discover menu
    And The user selects a category "<category>"
    And The user enters location Address "<location>" in the location address field
    And a user clicks on search button
    Then The existing communities should be displayed based on the search criteria


    Examples:
      |category|location|
      |All Categories| |
      |All Categories|Lagos |
      |All Categories|London |
