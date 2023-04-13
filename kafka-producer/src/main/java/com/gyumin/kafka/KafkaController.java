package com.gyumin.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/kafka")
@Slf4j
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    @PostMapping
    @ResponseBody
    public String sendMessage(@RequestParam String message) {
        kafkaProducer.sendMessage(message);
        return "success";
    }
}
