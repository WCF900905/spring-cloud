package com.springcloud.cnfcli;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class Application {

    @Value("${foo}")
    String foo;
//    @Value("${spring.rabbitmq.port}")
    String port;
    @RequestMapping("/")
    public String home() {
        return "Hello World!"+foo+","+port;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}