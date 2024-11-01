package com.example.controller;

import com.example.result.OrderProcessOutput;
import com.example.result.OrderData;
import com.example.result.defaultResult.MessageType;
import com.example.result.defaultResult.Status;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:63342", "*"})
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping("/process")
    public OrderProcessOutput processOrder(@RequestBody OrderData orderData) {
        OrderProcessOutput output = new OrderProcessOutput();

        try {
            if (orderData.getTotalAmount() <= 0) {
                output.setStatus(Status.ERROR);
                output.addMessage(MessageType.WARNING, "Bitte überprüfen Sie Ihre Eingaben");
                output.addMessage(MessageType.ERROR, "Bestellbetrag muss größer als 0 sein");
                return output;
            }

            orderData.setOrderId("ORD-" + System.currentTimeMillis());
            orderData.setStatus("BESTÄTIGT");
            output.setOrderData(orderData);
            output.setStatus(Status.SUCCESS);
            output.addMessage(MessageType.INFO, "Eine Bestätigungsmail wurde versandt");
            output.addMessage(MessageType.INFO, "Bestellnummer: " + orderData.getOrderId());
            output.addMessage(MessageType.SUCCESS, "Bestellung erfolgreich verarbeitet");

        } catch (Exception e) {
            output.setStatus(Status.ERROR);
            output.addMessage(MessageType.WARNING, "Bitte versuchen Sie es später erneut");
            output.addMessage(MessageType.ERROR, "Fehler bei der Verarbeitung der Bestellung");
        }

        return output;
    }
}