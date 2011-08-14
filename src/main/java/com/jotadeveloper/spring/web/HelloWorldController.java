package com.jotadeveloper.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jotadeveloper.spring.jms.JMSInterface;

/**
 * Simple index page controller serving hello.jsp file
 */
@Controller
public class HelloWorldController {

    @Autowired
    private JMSInterface jmsInterface;

    /**
     * Simply serves hello.jsp
     * @return view with name 'hello'
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String handleRequest() {
        for (int i = 0; i < 10; i++) {
            jmsInterface.sendJsmMessage();
        }
        return "hello";
    }

    /**
     * @return the jmsInterface
     */
    public JMSInterface getJmsInterface() {
        return jmsInterface;
    }

    /**
     * @param jmsInterface the jmsInterface to set
     */
    public void setJmsInterface(JMSInterface jmsInterface) {
        this.jmsInterface = jmsInterface;
    }


}
