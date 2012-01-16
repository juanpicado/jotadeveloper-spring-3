package com.jotadeveloper.spring.clase1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MiCasaController {

    /*
     *
     */
    //@Autowired
    @Resources(name="serviciosCasa")
    //@Qualify
    public ICasaServicios casaServicios;

    /*
     *
     */
    @RequestMapping(value="/casa", method = RequestMethod.GET)
    public String mostrarMiCasa(Model model) {
        /*
         * Al formulario le enviamos los datos por default de un usuario, este
         * método actua como el inicializador o constructor del formulario
         */
        model.addAttribute("pagarAlquiler", this.casaServicios.pagarAlquiler());
        return "casa";
    }

    /**
     * @return the casaServicios
     */
    //@Autowire
    public ICasaServicios getCasaServicios() {
        return casaServicios;
    }

    /**
     * @param casaServicios the casaServicios to set
     */
    public void setCasaServicios(final ICasaServicios casaServicios) {
        this.casaServicios = casaServicios;
    }
}
