package com.example.result;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Result<T> {
    private Status status;
    private List<Message> messages;
    private T data;
    private LocalDateTime timestamp;

    public Result() {
        this.messages = new ArrayList<>();
        this.status = Status.PENDING ;
        this.timestamp = LocalDateTime.now();
    }

    public Result<T> addMessage(MessageType type, String content) {
        messages.add(new Message(type, content));
        return this;
    }

    // Getter und Setter
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public List<Message> getMessages() { return messages; }
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
}