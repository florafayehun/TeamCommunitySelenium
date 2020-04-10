@run2

  Feature: Giftrete Registration

    Scenario: Valid Registration
      Given that a user navigate to Giftete website on http://qa1.giftrt.com
      When the user click on register button
      And the user fill the first name
      And the user fills the last name
      And the user fills the email address
      And the user fills his mobile number
      And the user fills his password
      And the user confirms his password
      And the user clicks on the register button
      Then the user should be prompted for captcha


