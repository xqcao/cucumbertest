Feature: Ping Pong Service
  As a user
  I want to check if the service is alive
  So that I can verify the system health

  Scenario: Basic ping check
    When I send a ping request
    Then I should receive a "pong" response

  Scenario: Ping with status check
    When I send a ping request to check status
    Then the service should return status code 200
    And the response should contain "pong"