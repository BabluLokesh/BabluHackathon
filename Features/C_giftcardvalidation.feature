Feature: Giftcardvalidation

  Scenario: Validate Gift Card Details
    Given user click on  the gift card customization page
    When user fill in the Customize your gift card section with valid price and date
    And user click the Next button
    When user fill in the  Nice! So who is this lucky person form details with an invalid email address and user should see an error message
    Then user will take screenshot of that error message
    And usercorrect the email address with a valid one and validate all other details in the Confirm Details section
    And user quit from the browser
