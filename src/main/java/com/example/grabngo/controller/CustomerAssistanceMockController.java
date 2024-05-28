package com.example.grabngo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerAssistanceMockController {
    @GetMapping(value = "/assistance/available")
    public long getAvailableQualifiedEmployee() {
        return 3;
    }
}
