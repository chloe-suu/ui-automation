Feature: User Registration

  Background: 
    When I navigate to Register Account page

  @SmokeTest
  Scenario: User registers with all required fields
    When I fill all field in the register form
    And I select privacy policy field
    And I click Continue button
    Then An account is created

  Scenario Outline: User can not register by missing required fields
    When I enter firstname "<fname>"
    And I enter lastname "<lname>"
    And I enter email address "<email>"
    And I enter telephone "<telephone>"
    And I enter password "<pwd>"
    And I enter re-password "<rePwd>"
    And I select privacy policy field
    And I click Continue button
    Then The proper error message is shown

    Examples: 
      | fname | lname | email         | telephone  | pwd   | rePwd |
      |       | test  | qaz@gmail.com | 1234567893 | 12345 | 12345 |
      | test  |       | qaz@gmail.com | 1234567893 | 12345 | 12345 |
      | test  | test  |               | 1234567893 | 12345 | 12345 |
      | test  | test  | qaz@gmail.com |            | 12345 | 12345 |
      | test  | test  | qaz@gmail.com | 1234567893 |       | 12345 |
      | test  | test  | qaz@gmail.com | 1234567893 | 12345 |       |
