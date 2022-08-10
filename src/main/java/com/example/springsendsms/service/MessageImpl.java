package com.example.springsendsms.service;

import com.example.springsendsms.model.MessagePhone;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageImpl implements MessageService {

    @Value("${SendMessage.twilio.account.sid}")
    private String sid;

    @Value("${SendMessage.twilio.account.authtoken}")
    private String auth;

    @Value("${SendMessage.numberPhone}")
    private String fromPhone;

    @Override
    public void sendMessage(String number, MessagePhone message) {
        Twilio.init(sid,auth);
        Message.creator(
                new PhoneNumber(number),
                new PhoneNumber(fromPhone), message.getMessage()
        ).create();
    }
}
