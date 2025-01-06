Feature: User Management

Scenario Outline: Create users with different data
  When I create a user with name "<name>" and email "<email>"
  Then the response status code should be 200

  Examples:
    | name       | email               |
    | John Doe   | john@example.com    |
    | Jane Smith | jane@example.com    |
    | Bob Wilson | bob@example.com     |