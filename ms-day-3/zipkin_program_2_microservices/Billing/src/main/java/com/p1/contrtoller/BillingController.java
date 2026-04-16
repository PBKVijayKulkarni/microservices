package com.p1.contrtoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/billing")
public class BillingController {

    private final RestTemplate restTemplate;

    public BillingController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{userId}/{productId}")
    public String generateBill(@PathVariable int userId,
                               @PathVariable int productId) {

        String user = restTemplate.getForObject(
            "http://User/user/" + userId, String.class);

        String product = restTemplate.getForObject(
            "http://Product/product/" + productId, String.class);

        return "Bill Generated for " + user + " buying " + product;
    }
}