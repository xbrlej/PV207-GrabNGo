package com.example.grabngo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemMockController {

    @GetMapping(value = "/items/{id}/status")
    public String status(@PathVariable int id) {
        return "Not Available";
    }

    @PostMapping(value = "/items/{id}/replacement/{replacementId}")
    public String replacement(@PathVariable int id, @PathVariable int replacementId) {
        return "Replaced successfully.";
    }

    @PostMapping(value = "/items/{id}/remove")
    public String remove(@PathVariable int id) {
        return "Removed successfully.";
    }
}
