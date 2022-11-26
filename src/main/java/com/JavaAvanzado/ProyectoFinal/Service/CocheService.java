package com.JavaAvanzado.ProyectoFinal.Service;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;
import com.JavaAvanzado.ProyectoFinal.Repositories.AlmacenamientoCoche;
import com.JavaAvanzado.ProyectoFinal.Repositories.CocheMemoria;

import java.util.ArrayList;

public class CocheService {
    AlmacenamientoCoche cocheDB = new CocheMemoria();

    String almacenarCoche(Coche coche){
        if (cocheDB.guardarCoche(coche)){
            return "Se ha guardado el coche " + coche.getId() + ".";
        }
        return "El coche " + coche.getId() + " ya existe en la base de datos.";
    }

    Coche obtenerCoche(long id){
        return cocheDB.obtenerCoche(id);
    }

    String actualizarCoche(Coche coche){
        if (cocheDB.modificarCochePorId(coche)){
            return "El coche " + coche.getId() + " se ha actualizado exitosamente.";
        }
        return "El coche " + coche.getId() + " no ha podido ser actualizado.";
    }

    String eliminarCoche(long id){
        if (cocheDB.eliminarCoche(id)){
            return "Se ha eliminado el coche " + id + " correctamente.";
        }
        return "El coche " + id + " no se encuentra en la base de datos.";
    }

    ArrayList<Coche> listarCoches(){
        return cocheDB.listarCoches();
    }
}
