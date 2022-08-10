package com.example.springsendsms.service;

import com.example.springsendsms.model.MessagePhone;

public interface MessageService {

    void sendMessage(String number, MessagePhone message);
}
