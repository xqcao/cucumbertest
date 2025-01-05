package com.example01.democomponent;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;

public class MySteps {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<String> response;

    @When("I send a ping request")
    public void i_send_a_ping_request() {
        System.out.println("Sending ping request to " + port);
        String url = String.format("http://localhost:%d/ping", port);
        response = restTemplate.getForEntity(url, String.class);
    }

    @When("I send a ping request to check status")
    public void i_send_a_ping_request_to_check_status() {
        String url = String.format("http://localhost:%d/ping", port);
        response = restTemplate.getForEntity(url, String.class);
    }

    @Then("I should receive a {string} response")
    public void i_should_receive_a_response(String expected) {
        assertEquals(expected, response.getBody());
    }

    @Then("the service should return status code {int}")
    public void the_service_should_return_status_code(int expectedStatus) {
        assertEquals(expectedStatus, response.getStatusCode().value());
    }

    @Then("the response should contain {string}")
    public void the_response_should_contain(String expected) {
        assertEquals(expected, response.getBody());
    }
}
