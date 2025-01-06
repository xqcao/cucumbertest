package com.example01.democomponent.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;
import com.example01.democomponent.models.User;
import com.example01.democomponent.repositories.UserRepository;

public class UserSteps {

    private final TestRestTemplate restTemplate;
    private final UserRepository userRepository;
    private ResponseEntity<User> response;

    public UserSteps(TestRestTemplate restTemplate, UserRepository userRepository) {
        this.restTemplate = restTemplate;
        this.userRepository = userRepository;
    }

    @When("I create a user with name {string} and email {string}")
    public void i_create_a_user_with_name_and_email(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        response = restTemplate.postForEntity("/api/users", user, User.class);
    }

    @Given("a user exists with name {string} and email {string}")
    public void a_user_exists_with_name_and_email(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
    }

    @When("I request the user with ID {long}")
    public void i_request_the_user_with_id(Long id) {
        response = restTemplate.getForEntity("/api/users/" + id, User.class);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(int expectedStatus) {
        assertEquals(expectedStatus, response.getStatusCode().value());
    }

    @Then("the response should contain user name {string}")
    public void the_response_should_contain_user_name(String expectedName) {
        assertNotNull(response.getBody());
        assertEquals(expectedName, response.getBody().getName());
    }

    @Then("the response should contain user email {string}")
    public void the_response_should_contain_user_email(String expectedEmail) {
        assertNotNull(response.getBody());
        assertEquals(expectedEmail, response.getBody().getEmail());
    }
}