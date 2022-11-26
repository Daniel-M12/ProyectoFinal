package com.JavaAvanzado.ProyectoFinal.Repositories;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;

import java.util.ArrayList;

public abstract class AlmacenamientoCoche {
    private static int idUltimoCoche = 0;

    public abstract boolean guardarCoche(Coche coche);
    public abstract Coche obtenerCoche(long id);
    public abstract boolean modificarCochePorId(Coche coche);
    public abstract boolean eliminarCoche(long id);

    public abstract ArrayList<Coche> listarCoches();

    public static Coche asignarIdACoche(Coche coche){
        idUltimoCoche++;
        coche.setId(idUltimoCoche);
        return coche;
    }

    public static int getIdUltimoCoche() {
        return idUltimoCoche;
    }

    public static void setIdUltimoCoche(int idUltimoCoche) {
        AlmacenamientoCoche.idUltimoCoche = idUltimoCoche;
    }
}
