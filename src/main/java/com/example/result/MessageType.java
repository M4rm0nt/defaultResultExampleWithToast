package com.example.result;

public enum MessageType {
    SUCCESS(3000),
    ERROR(3000);

    private final int defaultTimeout;

    MessageType(int defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
    }

    public int getDefaultTimeout() {
        return defaultTimeout;
    }
}