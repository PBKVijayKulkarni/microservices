package com.p1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.p1.entity.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

    // Find bills by user
    List<Bill> findByUserId(Long userId);

    // Find bills by shipment
    //List<Bill> findByShipmentId(Long shipmentId);

    // Custom condition
    List<Bill> findByAmountGreaterThan(Double amount);
}