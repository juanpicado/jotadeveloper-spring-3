package com.jotadeveloper.spring.jms;

import javax.jms.JMSException;
import javax.jms.MapMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;

public class ReceiveJMSMessage implements RecibirJMS{

    public ReceiveJMSMessage() {
        // TODO Auto-generated constructor stub
    }

    private JmsTemplate jmsTemplate;


    /**
     *
     * @return
     */
    public Nombre recibir(){
        MapMessage mapMessage = (MapMessage) jmsTemplate.receive("spitter.queue");

        Nombre n = new Nombre();
        try {
            n.setApellido(mapMessage.getString("lastName"));
            n.setName(mapMessage.getString("name"));
        } catch (JMSException e) {
           throw JmsUtils.convertJmsAccessException(e);
        }
        return n;
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
}

class Nombre {

    public Nombre() {
        // TODO Auto-generated constructor stub
    }

    private String name;
    private String apellido;

    /**
     * @param name
     * @param apellido
     */
    public Nombre(String name, String apellido) {
        super();
        this.name = name;
        this.apellido = apellido;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido
     *            the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}