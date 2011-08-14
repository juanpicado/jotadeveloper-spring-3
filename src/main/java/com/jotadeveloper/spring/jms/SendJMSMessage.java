package com.jotadeveloper.spring.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class SendJMSMessage implements JMSInterface {

    //@Autowired
    private JmsTemplate jmsTemplate;

    //@Resource(name = "topic")
    private Destination destination;

    public SendJMSMessage() {
        // TODO Auto-generated constructor stub
    }

    public void sendJsmMessage(){
        this.jmsTemplate.send(destination, new MessageCreator() {

            @Override
            public Message createMessage(Session arg0) throws JMSException {
                MapMessage mapMessage = arg0.createMapMessage();
                mapMessage.setString("lastName", "Picado");
                mapMessage.setString("name", "Juan");
                System.out.println(mapMessage);
                return mapMessage;
            }
        });
    }

    /**
     * @return the jmsTemplate
     */
    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    /**
     * @param jmsTemplate
     *            the jmsTemplate to set
     */
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    /**
     * @param destination
     *            the destination to set
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

}
