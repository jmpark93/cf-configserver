package com.jmworks.configserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class ConfigserverApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {

        System.out.println( "APP NAME : " + environment.getProperty("spring.application.name"));
        System.out.println( "BOOT ADMIN : " + environment.getProperty("spring.boot.admin.client.enabled"));

    }

}
