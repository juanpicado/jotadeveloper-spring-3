package com.jotadeveloper.spring.jms;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.core.support.JmsGatewaySupport;


public class JmsGatewayImpl extends JmsGatewaySupport implements GatewayInterface {

        public JmsGatewayImpl() {
            // TODO Auto-generated constructor stub
        }

        public void sendGatewayMessage(){
            getJmsTemplate().send("spitter.queue", new MessageCreator() {

                @Override
                public Message createMessage(Session arg0) throws JMSException {
                     MapMessage mapMessage = arg0.createMapMessage();
                        mapMessage.setString("lastName", "Picado");
                        mapMessage.setString("name", "Juan");
                        return mapMessage;
                }
            });
        }
}
