package com.example.githubactions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class GithubActionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
    }

    @PostConstruct
    public void init() {
        log.info("java application started!");
    }

    public String getStatus() {
        return "OK";
    }
}
