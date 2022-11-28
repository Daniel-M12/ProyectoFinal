package com.JavaAvanzado.ProyectoFinal.Service;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;
import com.JavaAvanzado.ProyectoFinal.Entities.TiposCoches;
import com.JavaAvanzado.ProyectoFinal.Exceptions.TipoNoExistenteException;
import com.JavaAvanzado.ProyectoFinal.Repositories.AlmacenamientoCoche;
import com.JavaAvanzado.ProyectoFinal.Repositories.CocheMemoria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CocheService {
    AlmacenamientoCoche cocheDB = new CocheMemoria();

    public Coche crearNuevoCoche(String tipo) throws TipoNoExistenteException{
        TiposCoches tipoCoche;
        switch (tipo){
            case "Combustion" -> tipoCoche = TiposCoches.COMBUSTION;
            case "Electrico" -> tipoCoche = TiposCoches.ELECTRICO;
            case "Hibrido" -> tipoCoche = TiposCoches.HIBRIDO;
            default -> tipoCoche = TiposCoches.OTRO;
        }

        Coche nuevoCoche = CocheFactory.fabricarCoche(tipoCoche);
        cocheDB.guardarCoche(nuevoCoche);
        return nuevoCoche;

    }

    public String almacenarCoche(Coche coche){
        if (cocheDB.guardarCoche(coche)){
            return "Se ha guardado el coche " + coche.getId() + ".";
        }
        return "El coche " + coche.getId() + " ya existe en la base de datos.";
    }

    public Coche obtenerCoche(long id){
        return cocheDB.obtenerCoche(id);
    }

    public Coche actualizarCoche(Coche coche){
        if (cocheDB.modificarCochePorId(coche)){
            return coche;
        }
        return null;
    }

    public String eliminarCoche(long id){
        if (cocheDB.eliminarCoche(id)){
            return "Se ha eliminado el coche " + id + " correctamente.";
        }
        return "El coche " + id + " no se encuentra en la base de datos.";
    }

    public ArrayList<Coche> listarCoches(){
        return cocheDB.listarCoches();
    }
}
