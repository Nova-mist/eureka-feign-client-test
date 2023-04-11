package org.example.feignclient;

import org.example.feignclient.controller.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }
}
