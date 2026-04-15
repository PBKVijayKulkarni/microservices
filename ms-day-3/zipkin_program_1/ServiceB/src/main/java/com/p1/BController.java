package com.p1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {

    @GetMapping("/service-b")
    public String callB() {
        return "Response from Service B";
    }
}