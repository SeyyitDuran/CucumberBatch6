@Login
Feature: Eurotech Login Test

  #like before method but step must be in order or s
  Background:
    Given The user is on the login page

  @Teacher @smoke
  Scenario: Login as Teacher
    #Given The user is on the login page
    When  The user enters teacher credentials
    Then  The user should be able to login

  @Student @db #for need to connecting with DB
  Scenario: Login as Student
    #Given The user is on the login page
    When  The user enters student credentials
    Then  The user should be able to login

  @Developer
  Scenario: login as Developer
   #Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login



