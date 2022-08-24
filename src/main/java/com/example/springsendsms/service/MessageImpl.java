package com.example.springsendsms.service;

import com.example.springsendsms.model.MessagePhone;
import com.example.springsendsms.model.MessageProcess;
import com.github.sonus21.rqueue.core.RqueueMessageEnqueuer;
import org.springframework.stereotype.Service;

@Service
public class MessageImpl implements MessageService {

    private final RqueueMessageEnqueuer rqueueMessageEnqueuer;

    public MessageImpl(RqueueMessageEnqueuer rqueueMessageEnqueuer) {
        this.rqueueMessageEnqueuer = rqueueMessageEnqueuer;
    }

    @Override
    public void sendMessage(String phone, MessagePhone message) {
        MessageProcess mp = new MessageProcess();
        mp.setToPhone(phone);
        mp.setMessage(message.getMessage());
        rqueueMessageEnqueuer.enqueue("send-queue", mp);
    }
}
