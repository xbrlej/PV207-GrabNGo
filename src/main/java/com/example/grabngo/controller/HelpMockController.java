package com.example.grabngo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelpMockController {

    @PostMapping(value = "/help/issue/{id}/resolve")
    public String logIssueResolution(@PathVariable long id, @RequestBody String issueResolution) {
        log.info("Resolving issue {} with cause {}", id, issueResolution);
        return "Issue resolution completed";
    }
}
