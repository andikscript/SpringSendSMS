package com.example.springsendsms.controller;

import com.example.springsendsms.model.MessagePhone;
import com.example.springsendsms.model.MessageProcess;
import com.example.springsendsms.service.MessageService;
import com.github.sonus21.rqueue.core.RqueueMessageEnqueuer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/phone")
public class PhoneController {

    private final MessageService messageService;

    public PhoneController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = "/{phone}/verification")
    public ResponseEntity<?> verificationPhone(@PathVariable(value = "phone") String phone,
                                               @RequestBody MessagePhone messagePhone) {
        messageService.sendMessage(phone, messagePhone);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Code Sent Success");
    }
}
