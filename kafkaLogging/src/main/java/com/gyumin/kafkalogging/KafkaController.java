package com.gyumin.kafkalogging;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/kafka")
@Slf4j
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaProducerService producerService;

    @PostMapping
    @ResponseBody
    public String sendMessage(@RequestBody ChatMessageDTO chatMessageDTO) {
        log.error(chatMessageDTO.toString());
        producerService.sendMessage(chatMessageDTO);
        return "success";
    }
}
