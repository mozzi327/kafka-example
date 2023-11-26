package com.example.kafka.message.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "eaxm-topic", groupId = "foo")
    public void consume(String message) throws IOException {
        log.info("CONSUMED MESSAGE : {}", message);
    }
}
