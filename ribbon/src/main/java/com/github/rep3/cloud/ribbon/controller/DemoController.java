package com.github.rep3.cloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/demo")
    String demo() {
        return restTemplate.getForEntity("http://auth/home", String.class).getBody();
    }

}
