Feature: User Management
  As an API user
  I want to manage users
  So that I can maintain user data

  Scenario: Get user by ID
    Given a user exists with name "John Doe" and email "john@example.com"
    When I request the user with ID 1
    Then the response status code should be 200
    And the response should contain user name "John Doe"
    And the response should contain user email "john@example.com"

  Scenario: Get non-existent user
    When I request the user with ID 999
    Then the response status code should be 404 