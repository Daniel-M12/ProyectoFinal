package com.JavaAvanzado.ProyectoFinal.Controllers;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;
import com.JavaAvanzado.ProyectoFinal.Entities.CocheCombustion;
import com.JavaAvanzado.ProyectoFinal.Exceptions.TipoNoExistenteException;
import com.JavaAvanzado.ProyectoFinal.Service.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import java.util.ArrayList;

import static org.springframework.http.MediaType.*;

@Controller
@Path("/")
public class CocheController {
    @Autowired
    CocheService cocheService;

    public CocheController(CocheService cocheService) {
        this.cocheService = cocheService;
    }

    @GET
    @Produces("application/json")
    public ArrayList<Coche> prueba(){
        try {
            Coche coche = cocheService.crearNuevoCoche("Combustion");
            coche = cocheService.crearNuevoCoche("Combustion");
            coche = cocheService.crearNuevoCoche("Electrico");
            coche = cocheService.crearNuevoCoche("Hibrido");

            return cocheService.listarCoches();
        } catch (TipoNoExistenteException e) {
            System.out.println(e.getMessage());
            Response.status(Response.Status.BAD_REQUEST).build();
            return cocheService.listarCoches();
        }
    }
    
}
