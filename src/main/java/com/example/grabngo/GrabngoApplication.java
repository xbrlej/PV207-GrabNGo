package com.example.grabngo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class GrabngoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrabngoApplication.class, args);
    }
}
