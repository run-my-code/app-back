package com.example.app_back.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

/* You can use the @RefreshScope annotation to enable dynamic updates of injected properties.
 * After each update in the configuration repository,
 * send a POST request to /actuator/refresh:
 * The client (app name + activeprofiles) contacts the Config Server 
 * to fetch updated values and compares them with its current properties.
 * to reload @Value or @ConfigurationProperties fields
 * without restarting the application.
 * add two Spring Boot Actuator properties to our application properties file
 */
@RestController
@RefreshScope
public class CllientConfigController {
    @Value("${sample.message:default msg app back}")
    private String configClientMsg;

    @Value("${dbPassword}")
    private String dbPassword;

    @GetMapping("/message")
    public String getMessage() {
        return dbPassword;
    }

}
