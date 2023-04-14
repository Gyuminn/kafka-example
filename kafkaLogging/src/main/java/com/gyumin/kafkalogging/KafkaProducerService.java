package com.gyumin.kafkalogging;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {
    private static final String TOPIC = "testTopic";

    private final KafkaTemplate<String, ChatMessageDTO> kafkaTemplate;

    public void sendMessage(ChatMessageDTO chatMessageDTO) {
        log.info("이벤트 발생: " + chatMessageDTO);
        // 이벤트 발생
        kafkaTemplate.send(TOPIC, chatMessageDTO);
    }
}
