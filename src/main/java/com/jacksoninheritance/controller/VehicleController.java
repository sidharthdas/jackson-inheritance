package com.jacksoninheritance.controller;

import com.jacksoninheritance.model.Vehicle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class VehicleController {

    @PostMapping("vehicle")
    public String toString(@RequestBody Vehicle vehicle) {
        return vehicle.toString();
    }
}
