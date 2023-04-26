@Navigate
Feature: Navigate the homepage

    # given precondition
    # when actions
    # then verification

  @Scenario1
  Scenario:Navigate the Developers Menu
    Given  The user is on the login page
    When   The user enters teacher credentials
    Then   The user should navigate the dashboard page and view Welcome Teacher text
    And    The user should hover over Developer button and click
    Then  The user should view Developers text and navigate on profiles page

  @Scenario2
  Scenario: Navigate the All Posts Menu
    Given  The user is on the login page
    When   The user enters teacher credentials
    Then   The user should navigate the dashboard page and view Welcome Teacher text
    And    The user should hover overs All Posts button and click
    Then   The user should view Posts text and navigates on posts page

  @Scenario3
  Scenario: Navigate the My Account Menu
    Given  The user is on the login page
    When   The user enters teacher credentials
    Then   The user should navigate the dashboard page and view Welcome Teacher text
    And    The user should hover over My Account button and click
    Then   The user should view Dashboard text and navigate on dashboard page
