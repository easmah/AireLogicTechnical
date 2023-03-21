Feature: CookieClicker
  As a user
  I want to be able to play the CookieClicker Game

  Background:
    Given CookieClicker homepage is displayed

  Scenario: Is the valid CookieClicker homepage Displayed
    Then the cookieClicker homepage is displayed to the player

  Scenario Outline: Enter player Name and Start game
    When the player enters a "<playerName>"
    And the player clicks on Start button
    Then the CookieClicker! game page should be displayed
    Examples:
      | playerName |
      | EmmanuelA   |
      | 90839ABDP   |
      |            |
      | null       |
      | &$5yu&*P    |

  Scenario: Click On Click Cookie! button: New Player
    Given the player enters a name
    And the player clicks on Start button
    When the player clicks on Click Cookie!
    Then the value of Cookies should increase by "1"


  #To be implemented
  # Scenario: Click On Buy Factories button: New Player
    #Given the player is on the CookieGamePage
    #When the player enters a "<numberOfFactoriesToBuy>" to buy factories
    #And the player clicks on buy factories button
    #Then the value of Factories should increase by "1"
    #Then the money will decease to "<currentMoney>"

