package com.gyumin.kafkalogging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {
    @KafkaListener(topics = "testTopic", groupId = "testGroup", containerFactory = "kafkaListener")
    public void consume(ChatMessageDTO chatMessageDTO) {
        log.warn("보낸 이: " + chatMessageDTO.getSender());
        log.warn("메시지: " + chatMessageDTO.getContext());
    }
}
