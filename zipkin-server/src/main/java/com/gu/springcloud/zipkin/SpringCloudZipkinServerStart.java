package com.gu.springcloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringCloudZipkinServerStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinServerStart.class,args);
    }
}
