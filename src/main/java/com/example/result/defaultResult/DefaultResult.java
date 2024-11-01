package com.example.result.defaultResult;

import java.util.ArrayList;
import java.util.List;

public class DefaultResult<T> {
    private Status status;
    private List<Message> messages;

    public DefaultResult() {
        this.messages = new ArrayList<>();
        this.status = Status.PENDING ;
    }

    public void addMessage(MessageType type, String content) {
        messages.add(new Message(type, content));
    }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public List<Message> getMessages() { return messages; }

}