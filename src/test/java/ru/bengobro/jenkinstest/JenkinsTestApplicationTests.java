package ru.bengobro.jenkinstest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(JenkinsTestApplication.class);

    @Test
    void contextLoads() {
        log.info("Executing test..");
    }

}
