@smoke
Feature: Upload file drag and drop Functions

  Background:
    Given user open upload website

  Scenario: user upload file
    When user go to upload page
    And user choose the file to upload
    And user click upload button
    Then file uploaded appears

