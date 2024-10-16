@smoke
Feature: Login Function

  Background:
    Given user open the website
    And user go to login page

  Scenario: user log in successfully
    When user enter valid email
    And user enter valid password
    And user click on log in button
    Then user logged in as user name is display

  Scenario: user cannot log in with invalid email
    When user enter invalid email
    And user enter valid password
    And user click on log in button
    Then  user cannot login and wrong message appear