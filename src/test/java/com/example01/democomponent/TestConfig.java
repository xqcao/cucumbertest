package com.example01.democomponent;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example01.democomponent;")
@EnableAutoConfiguration
public class TestConfig {
    // We can leave it empty unless otherwise needed
}
