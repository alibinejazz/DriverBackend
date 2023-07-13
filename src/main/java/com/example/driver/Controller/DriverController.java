package com.example.driver.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.driver.Model.Driver;
import com.example.driver.Repository.DriverRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    private DriverRepository driverrepo;

    @PostMapping("/add")
    public String addDriver(@RequestBody Driver driver){
        driverrepo.save(driver);
        return "Driver Added";
    }

    @GetMapping("/getAll")
    public List<Driver> allDrivers(){
        return driverrepo.findAll();
    }
}
