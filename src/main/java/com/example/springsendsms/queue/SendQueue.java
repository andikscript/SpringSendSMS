package com.example.springsendsms.queue;

import com.example.springsendsms.model.MessageProcess;
import com.github.sonus21.rqueue.annotation.RqueueListener;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SendQueue {

    @Value("${SendMessage.twilio.account.sid}")
    private String sid;

    @Value("${SendMessage.twilio.account.authtoken}")
    private String auth;

    @Value("${SendMessage.numberPhone}")
    private String fromPhone;

    @RqueueListener(value = "send-queue")
    public void sendMessage(MessageProcess message) {
        Twilio.init(sid,auth);
        Message.creator(
                new PhoneNumber(message.getToPhone()),
                new PhoneNumber(fromPhone), message.getMessage()
        ).create();
    }
}
