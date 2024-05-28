package com.example.grabngo.vo;

import lombok.Data;

@Data
public class AccountUpsertVO {
    private String name;
    private String email;
    private boolean premium;
}
