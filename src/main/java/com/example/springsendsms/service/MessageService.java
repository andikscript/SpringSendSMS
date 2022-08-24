package com.example.springsendsms.service;

import com.example.springsendsms.model.MessagePhone;
import com.example.springsendsms.model.MessageProcess;

public interface MessageService {

    void sendMessage(String number, MessagePhone message);
}
