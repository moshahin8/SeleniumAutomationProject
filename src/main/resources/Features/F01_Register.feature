@smoke
  Feature: Register Function

    Background:
      Given user open website
      And user go to signup page

    Scenario: new user sign up
        When user send his name
        And send his email
        Then click signup button
        When user select title type
        And user fills Password fields
        And user enter date of birth
        And user enter first name
        And user enter last name
        And user enter address
        And user choose country
        And user enter state
        And user enter city
        And user enter Zipcode
        And user enter mobile number
        And user clicks on create account button
        Then Account Created is displayed
