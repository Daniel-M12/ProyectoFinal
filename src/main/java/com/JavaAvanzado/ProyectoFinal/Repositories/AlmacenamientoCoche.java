package com.JavaAvanzado.ProyectoFinal.Repositories;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;

import java.util.ArrayList;

public interface AlmacenamientoCoche {
    boolean guardarCoche(Coche coche);
    Coche obtenerCoche(long id);
    boolean modificarCochePorId(Coche coche);
    boolean eliminarCoche(long id);

    ArrayList<Coche> listarCoches();


}
