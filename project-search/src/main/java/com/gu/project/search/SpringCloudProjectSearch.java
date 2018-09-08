package com.gu.project.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProjectSearch {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProjectSearch.class, args);
    }
}
