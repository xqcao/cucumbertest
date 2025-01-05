package com.example01.democomponent;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = DemocomponentApplication.class)
public class CucumberSpringConfiguration {
    // This class can remain empty
    // It's just used to configure the Spring Context for Cucumber
}
