Feature: Navigate Menu with parameters

  Background:
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then The welcome message contains "Teacher"

  Scenario: Navigates Developers Menu
    And The user navigates to "Developers" menu
    Then The user should be able to view header as "Filter Profiles by Skill or by Location"

  Scenario: Navigates All Posts Menu
    And The user navigates to "All Posts" menu
    Then The user should be able to view header as "Posts"

  Scenario: Navigates My Account Menu
    And The user navigates to "My Account" menu
    Then The user should be able to view header as "Dashboard"

  Scenario Outline: Navigates menu options
    And The user navigates to "<MenuName>" menu
    Then The user should be able to view header as "<Headers>"
    Examples:
      | MenuName   | Headers                                 |
      | Developers | Filter Profiles by Skill or by Location |
      | All Posts  | Posts                                   |
      | My Account | Dashboard                               |


