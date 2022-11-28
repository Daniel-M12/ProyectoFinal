package com.JavaAvanzado.ProyectoFinal.Controllers;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;
import com.JavaAvanzado.ProyectoFinal.Exceptions.TipoNoExistenteException;
import com.JavaAvanzado.ProyectoFinal.Service.CocheService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.net.URI;
import java.util.ArrayList;

@Controller
@Path("/")
public class CocheController {
    @Autowired
    CocheService cocheService;
    private static final ObjectMapper mapper = new ObjectMapper();

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

    @GET
    @Path("/Coches")
    @Produces("application/json")
    public ArrayList<Coche> getListaCoches(){
        return cocheService.listarCoches();
    }

    @GET
    @Path("/Coche/{id}")
    @Produces("application/json")
    public Coche getCochePorId(@PathParam("id") long id){
        return cocheService.obtenerCoche(id);
    }

    @POST
    @Path("/Coche/{tipo}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response crearCochePorTipo(@PathParam("tipo") String tipoCoche){
        try {
            Coche coche = cocheService.crearNuevoCoche(tipoCoche);
            return Response.created(URI.create("/Coche/" + coche.getId())).entity(coche).build();
        } catch (TipoNoExistenteException e) {
            System.out.println(e.getMessage());
            return Response.notModified(e.getMessage()).build();
            //return Response.noContent().build();
        }
    }

    @PUT
    @Path("/Coche/actualizar")
    @Produces("application/json")
    @Consumes("application/json")
    public Response actualizarCoche(Coche coche){
        Coche cocheJson = cocheService.actualizarCoche(coche);

        return Response.status(Response.Status.OK).entity(cocheJson).build();

    }

    @DELETE
    @Path("/Coche/{id}")
    public Response borrarCochePorId(@PathParam("id") long id){
        System.out.println(cocheService.eliminarCoche(id));
        return Response.noContent().build();
    }
}
