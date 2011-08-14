package com.jotadeveloper.spring.jms.listener;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName="jms/spittle.alert.queue")
public class JmsListenerHandler implements MessageListener{

    @Override
    public void onMessage(Message arg0) {
        System.out.println("onMessage Listener Hander "+arg0);
    }

}
