package com.example.result;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Result<T> {
    private Status status;
    private List<Message> messages;

    public Result() {
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