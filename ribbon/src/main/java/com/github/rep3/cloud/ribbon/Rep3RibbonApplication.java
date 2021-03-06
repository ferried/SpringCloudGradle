package com.github.rep3.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class Rep3RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(Rep3RibbonApplication.class, args);
    }
}
