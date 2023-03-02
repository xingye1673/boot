package com.example.boot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Scheduled(fixedRate = 5000)
    public void execute() {
        System.out.println("Hello, world!");
    }

}