package com.p1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.p1.model.Shipment;

@FeignClient(name = "LOGISTICS-SERVICE")
public interface LogisticsClient {

    @PostMapping("/logistics/add")
    Shipment addShipment(Shipment shipment);

    @GetMapping("/logistics/get/{id}")
    Shipment getShipment(@PathVariable int id);
}