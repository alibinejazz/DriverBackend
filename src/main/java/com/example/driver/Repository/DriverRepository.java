package com.example.driver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.driver.Model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    
}
