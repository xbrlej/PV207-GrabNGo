package com.example.grabngo.controller;

import com.example.grabngo.service.EmailService;
import com.example.grabngo.vo.MailVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
public class MailController {

    private EmailService emailService;

    @PostMapping(value = "/email/send")
    public String sendEmail(@RequestBody MailVO mailVO) {
        emailService.sendSimpleMessage(mailVO.getFrom(), mailVO.getTo(), mailVO.getSubject(), mailVO.getContent());
        log.info("Sending email {}", mailVO);
        return "Email sent!";
    }
}
