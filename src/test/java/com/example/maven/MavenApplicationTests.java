package com.example.maven;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MavenApplication.class)
class MavenApplicationTests {

    @Value("#{appdoc}")
    String test;

    @Test
    void contextLoads() {
        System.out.println(test);
    }

}
