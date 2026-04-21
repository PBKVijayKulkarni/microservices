package com.p1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceb")
public class ServiceBController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Service B";
    }
}