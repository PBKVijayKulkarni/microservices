package com.example.ServiceA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AController 
{
   private final RestTemplate restTemplate;

   public AController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

   @GetMapping("/service-a")
   public String callA() {
       String response = restTemplate.getForObject(
         "http://localhost:8082/service-b", String.class);
       return "Service A calling -> " + response;
   }
}
