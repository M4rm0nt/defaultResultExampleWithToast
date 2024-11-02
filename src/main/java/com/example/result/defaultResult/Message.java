package com.example.result.defaultResult;

import java.util.List;

public class Message {
    private final MessageType type;
    private final List<String> content;

    public Message(MessageType type, List<String> content) {
        this.type = type;
        this.content = content;
    }

    public MessageType getType() { return type; }
    public List<String> getContent() { return content; }

}
