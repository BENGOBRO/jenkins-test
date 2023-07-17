package ru.bengobro.jenkinstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    private static final Logger log = LoggerFactory.getLogger(JenkinsTestApplication.class);

    public static void main(String[] args) {
        log.info("Executing app...");
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
