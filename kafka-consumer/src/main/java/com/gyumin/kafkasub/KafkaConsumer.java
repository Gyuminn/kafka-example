package com.gyumin.kafkasub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class KafkaConsumer {
    // 구독 - 게시가 단방향이기 때문에 return이 없다.
    // 카프카 구독 메서드
    @KafkaListener(topics="gyumin-topic", groupId = "kimgyumin")
    public void consume(String message) throws IOException {
        log.info("Consumed message: {}", message);
    }
}
