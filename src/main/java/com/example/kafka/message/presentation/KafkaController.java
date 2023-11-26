package com.example.kafka.message.presentation;

import com.example.kafka.message.application.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final KafkaProducer producer;

    @PostMapping
    public String sendMessage(@RequestParam String message) {
        log.info("MESSAGE : {} ", message);
        this.producer.sendMessage(message);

        return "success";
    }
}

