Feature: Purchase Dress using Automation Tool

  Background: user signing in the application
    Given: User sign the application


  Scenario Outline: verifyuser able to sign in
    When User enter "<username>" as username
    When User enter "<password>" as password
    Then User click on SignIn button
    Then Verify user account page is displayed

    Examples: 
      | username           | password |
      | iampirai@gmail.com | pirai    |

  Scenario: adding dress to the cart
    When User enter "iampirai@gmail.com" as username
    When User enter "pirai" as password
    Then User click on SignIn button
    Then type in search 
	  