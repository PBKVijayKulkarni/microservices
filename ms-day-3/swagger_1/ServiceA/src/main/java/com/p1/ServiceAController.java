package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/servicea")
public class ServiceAController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/callb")
    public String callServiceB() {

        String response = restTemplate.getForObject(
                "http://localhost:8082/serviceb/message",
                String.class
        );

        return "Response from Service B: " + response;
    }
}