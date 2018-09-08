package com.gu.register.conter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudRegister {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRegister.class, args);
    }
}
