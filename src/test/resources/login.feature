@run

Feature: Giftrete Login
    #this is to navigate to the blue sku Citadel homepage

  Scenario: Valid Login on Giftrete Website
#    Given that I navigate to http://qa1.giftrt.com
#    When the user clicks on the login button
#    And the user fill his Email Address in the email address textbox
#    And the user fills his password in the password test box
#    And the ussr clicks on Sign In button
#    Then the user should be logged in successfully



  Scenario Outline: valid Login

    Given that I navigate to http://qa1.giftrt.com
    When the user clicks on the login button
    And the user fill his emailId "<emailId>" in the email address textbox
    And the user fills his password  "<password>"in the password test box
    And the ussr clicks on Sign In button
    Then the user should be logged in successfully

     Examples:
      |emailId|password|
      |flora.fayehun@yahoo.com|jason123|



