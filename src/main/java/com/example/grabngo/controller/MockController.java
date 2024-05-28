package com.example.grabngo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@RestController
@RequestMapping
public class MockController {
    @GetMapping(value = "/errorEndpoint")
    public String errorEndpoint() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
    }
}
