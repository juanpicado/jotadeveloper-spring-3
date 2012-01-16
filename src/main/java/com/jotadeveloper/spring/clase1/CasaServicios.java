package com.jotadeveloper.spring.clase1;

import org.springframework.stereotype.Service;

@Service(value = "serviciosCasa")
public class CasaServicios implements ICasaServicios{

    /*
     * (non-Javadoc)
     * @see com.jotadeveloper.spring.clase1.ICasaServicios#pagarAlquiler()
     */
    public Boolean pagarAlquiler(){
        return true;
    }


}
