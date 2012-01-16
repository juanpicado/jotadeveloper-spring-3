package com.jotadeveloper.spring.clase1;

import org.springframework.stereotype.Repository;

@Repository(value = "serviciosCasa")
public class CasaAlmacen implements ICasaAlmacen{

    /*
     * (non-Javadoc)
     * @see com.jotadeveloper.spring.clase1.ICasaAlmacen#cuantasHabitacionesTenemos()
     */
    public Integer cuantasHabitacionesTenemos() {
        return 4;
    }
}
