package org.example.eurekaclient.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class GreetingControllerImpl implements GreetingController{

    @Autowired
    @Lazy // Important
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public String greeting() {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return String.format(
                "Hello from '%s %s", eurekaClient.getApplication(appName).getName(),timestamp
        );
    }
}
