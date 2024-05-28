package com.example.grabngo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class FeedbackMockController {

    /**
     * Mock customer rating value -> id = value returned
     *
     * @param feedbackId
     * @return long
     */
    @GetMapping(value = "/feedback/{feedbackId}/rating", produces = APPLICATION_JSON_VALUE)
    public long feedbackRating(@PathVariable long feedbackId) {
        return feedbackId;
    }
}
