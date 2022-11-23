package com.JavaAvanzado.ProyectoFinal.Repositories;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;

public interface AlamcenamientoCoche {
    void guardarCoche(Coche coche);
    Coche obtenerCoche(long id);
    void modificarCochePorId(Coche coche);
    void eliminarCoche(long id);
}
