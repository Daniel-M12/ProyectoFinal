package com.JavaAvanzado.ProyectoFinal.Repositories;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;

import java.util.ArrayList;

public class CocheMemoria implements AlamcenamientoCoche{
    private ArrayList<Coche> cochesGuardados;

    public CocheMemoria() {
        this.cochesGuardados = new ArrayList<>();
    }

    @Override
    public void guardarCoche(Coche coche) {
        if (existeCoche(coche.getId())){
            return;
        }
        cochesGuardados.add(coche);
    }

    @Override
    public Coche obtenerCoche(long id) {
        if (existeCoche(id)){
            for (Coche coche: cochesGuardados) {
                if (id == coche.getId()){
                    return coche;
                }
            }
        }
        return null;
    }

    @Override
    public void modificarCochePorId(Coche coche) {
        if (existeCoche(coche.getId())){
            cochesGuardados.set(cochesGuardados.indexOf(coche), coche);
        }
    }

    @Override
    public void eliminarCoche(long id) {
        if (existeCoche(id)){
            cochesGuardados.remove(obtenerCoche(id));
        }
    }

    private boolean existeCoche(long id){
        for (Coche coche: cochesGuardados) {
            if (id == coche.getId()){
                return true;
            }
        }
        return false;
    }

}
