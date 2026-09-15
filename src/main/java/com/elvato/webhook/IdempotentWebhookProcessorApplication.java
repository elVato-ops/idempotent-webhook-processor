package com.elvato.webhook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdempotentWebhookProcessorApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdempotentWebhookProcessorApplication.class, args);
    }

}
