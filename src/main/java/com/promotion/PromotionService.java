package com.promotion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.promotion")
public class PromotionService {
    public static void main(String[] args) {
        SpringApplication.run(PromotionService.class, args);
    }
}
