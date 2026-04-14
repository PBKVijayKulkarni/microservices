package com.p1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.Order;
import com.p1.model.Shipment;
import com.p1.model.User;

@Service
public class BillingService {

    @Autowired
    private UserService userService;

    @Autowired
    private LogisticsService logisticsService;

    public String generateBill(Order order) {

        User user = userService.getUser(order.getUserId());
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        // Create shipment
        Shipment shipment = logisticsService.createShipment(order.getUserId());

        return "Bill generated for " + user.getName() +
               ", Amount: " + order.getAmount() +
               ", Shipment Status: " + shipment.getStatus();
    }
}