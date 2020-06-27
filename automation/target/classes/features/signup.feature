@Registration
Feature: Client sign up
  A new user is signed up

  @tag1
  Scenario: User signed up successfully
    Given User wants to have an account
    When User sends required information to get the account
    Then User should be told that the account was created
