package com.hackerff.code.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hackerff.code")
public class ApiApplication {
    public static void main(String []args){
        SpringApplication.run(ApiApplication.class,args);
    }
}
