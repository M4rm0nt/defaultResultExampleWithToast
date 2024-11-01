package com.example.result;

public class ToastConfig {
    private int timeout;
    private boolean showCloseButton;
    private String position;
    private boolean progressBar;
    private boolean preventDuplicates;

    public ToastConfig() {
        this.showCloseButton = true;
        this.position = "top-right";
        this.progressBar = true;
        this.preventDuplicates = true;
    }

    // Getter und Setter
    public int getTimeout() { return timeout; }
    public void setTimeout(int timeout) { this.timeout = timeout; }
    public boolean isShowCloseButton() { return showCloseButton; }
    public void setShowCloseButton(boolean showCloseButton) { this.showCloseButton = showCloseButton; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public boolean isProgressBar() { return progressBar; }
    public void setProgressBar(boolean progressBar) { this.progressBar = progressBar; }
    public boolean isPreventDuplicates() { return preventDuplicates; }
    public void setPreventDuplicates(boolean preventDuplicates) { this.preventDuplicates = preventDuplicates; }
}