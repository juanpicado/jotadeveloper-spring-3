package com.jotadeveloper.spring.clase1;

import org.springframework.stereotype.Component;

@Component
public class CasaPapa {

    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


}
