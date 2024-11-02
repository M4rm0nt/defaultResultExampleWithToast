package com.example.controller;

import com.example.result.defaultResult.MessageType;
import com.example.result.defaultResult.Result;
import com.example.result.defaultResult.Status;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:63342", "*"})
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/daily-status")
    public Result<String> getDailyStatus() {
        Result<String> result = new Result<>();
        result.setStatus(Status.SUCCESS);

        result.addMessage(MessageType.SUCCESS, List.of(
                "✓ Präsentation für Kunde XY fertiggestellt",
                "✓ Team-Meeting erfolgreich durchgeführt",
                "✓ Quartalsbericht an die Geschäftsführung gesendet"
        ));

        result.addMessage(MessageType.ERROR, List.of(
                "⚠ Projektdeadline überschritten: 'Budget-Report 2024' (-2 Tage)",
                "⚠ Wichtiger Rückruf an Kunde ausstehend (Frist: heute 14:00)",
                "⚠ Lizenz für Softwaretool läuft heute ab"
        ));

        result.addMessage(MessageType.WARNING, List.of(
                "➤ Meeting-Vorbereitung bis morgen 09:00 erforderlich",
                "➤ Projektantrag muss bis Freitag eingereicht werden",
                "➤ Nur noch 2 Tage bis zur Abgabe der Quartalsplanung"
        ));

        result.addMessage(MessageType.INFO, List.of(
                "📅 15:30 - Virtuelles Coffee-Meeting mit Team",
                "📅 16:45 - Yoga-Kurs im Firmenfitness",
                "ℹ️ Neue Meetingräume ab nächster Woche verfügbar",
                "ℹ️ Denken Sie an die Zeitumstellung am Wochenende"
        ));

        return result;
    }
}