package com.gyumin.kafkalogging;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ChatMessageDTO {
    private String sender;
    private String context;
}
