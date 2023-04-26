@Dashboard
Feature: Dashboard Menu Page

  Scenario: The user should be able to see Dashboard menu after login
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then The welcome message contains "Teacher"
    Then The user should be able see following menu
      #datatable use List
      | Developers |
      | All Posts  |
      | My Account |
    #if new features will add |Contact Us|
@smoke
  Scenario: The user should be able to see Dashboard menu after login
    Given The user is on the login page
#    When The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    When The user logs in using following credentials
    #use Map
      | username | eurotech@gmail.com |
      | password | Test12345!|
      | message  | Teacher|
    Then The welcome message contains "Teacher"
    Then The user should be able see following menu
    #use List
      | Developers |
      | All Posts  |
      | My Account |