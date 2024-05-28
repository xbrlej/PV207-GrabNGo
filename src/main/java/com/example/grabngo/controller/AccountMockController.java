package com.example.grabngo.controller;

import com.example.grabngo.vo.AccountUpsertVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountMockController {

    @PostMapping("/account/{id}/delete")
    public String deleteAccount(@PathVariable long id) {
        return "Account deleted";
    }

    @PutMapping("/account/{id}/update")
    public String updateAccount(@PathVariable long id, @RequestBody AccountUpsertVO accountUpsertVO) {
        return "Account updated";
    }

    @GetMapping("/account/{id}/verify")
    public boolean verifyCancellable(@PathVariable long id) {
        return true;
    }
}
