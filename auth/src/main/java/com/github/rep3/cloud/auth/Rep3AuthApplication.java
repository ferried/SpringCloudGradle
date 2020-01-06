package com.github.rep3.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Rep3AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(Rep3AuthApplication.class, args);
    }
}
