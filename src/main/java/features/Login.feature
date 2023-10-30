Feature: User Login
  Registered users can login to the system

  Background: 
    When User navigates to login page

  #@SmokeTest
  #Scenario: Login with valid credentials
  #When User enters email "moon@gmail.com"
  #And User enters password "123456789"
  #And User clicks login
  #Then User should login successfully
  
  Scenario Outline: Login with invalid credentials
    When User enters email "<email>"
    And User enters password "<password>"
    And User clicks login
    Then User should see error message

    Examples: 
      | email  | password  |
      | Admin  | admin12$$ |
      |        | admin123  |
      | abc123 |           |
