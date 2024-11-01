package com.example.result;

import java.time.LocalDateTime;

public class Message {
    private MessageType type;
    private String content;
    private LocalDateTime timestamp;
    private ToastConfig toastConfig;

    public Message(MessageType type, String content) {
        this.type = type;
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.toastConfig = new ToastConfig();
        this.toastConfig.setTimeout(type.getDefaultTimeout());
    }

    // Getter
    public MessageType getType() { return type; }
    public String getContent() { return content; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public ToastConfig getToastConfig() { return toastConfig; }
}
