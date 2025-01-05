package com.example01.democomponent.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import com.example01.democomponent.DemocomponentApplication;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = DemocomponentApplication.class)
public class CucumberSpringConfiguration {
}