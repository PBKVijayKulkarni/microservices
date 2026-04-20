package com.p1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.p1.entity.Shipment;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    // Custom query examples

    List<Shipment> findByStatus(String status);

    List<Shipment> findByAddressContaining(String keyword);
}