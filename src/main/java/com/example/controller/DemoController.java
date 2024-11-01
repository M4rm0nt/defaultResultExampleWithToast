package com.example.controller;

import com.example.result.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:63342", "*"})
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/test-success")
    public Result<String> testSuccess() {
        Result<String> result = new Result<>();
        result.setStatus(Status.SUCCESS);
        result.addMessage(MessageType.SUCCESS, "Aktion wurde erfolgreich ausgeführt");
        return result;
    }

    @GetMapping("/test-error")
    public Result<String> testError() {
        Result<String> result = new Result<>();
        result.setStatus(Status.ERROR);
        result.addMessage(MessageType.ERROR, "Fehler beim Ausführen der Aktion");
        return result;
    }
}
