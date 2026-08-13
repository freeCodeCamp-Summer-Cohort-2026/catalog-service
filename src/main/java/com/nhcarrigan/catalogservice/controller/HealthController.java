package com.nhcarrigan.catalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
public class HealthController{

    @GetMapping("/health")
    private Map<String, String> healthCheck(){
        Map<String, String> health = new HashMap<>();
        health.put("service", "200 OK");
        return health;
    }
}


