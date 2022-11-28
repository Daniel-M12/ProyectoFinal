package com.JavaAvanzado.ProyectoFinal.Repositories;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;

import java.util.ArrayList;

public class CocheMemoria implements AlmacenamientoCoche{
    private static int idUltimoCoche = 0;
    private ArrayList<Coche> cochesGuardados;

    public CocheMemoria() {
        this.cochesGuardados = new ArrayList<>();
    }

    @Override
    public boolean guardarCoche(Coche coche) {
        if (existeCoche(coche.getId())){
            return false;
        }

        cochesGuardados.add(asignarIdACoche(coche));

        return true;
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
    public boolean modificarCochePorId(Coche coche) {
        Coche cocheModif = obtenerCoche(coche.getId());
        int index = cochesGuardados.indexOf(cocheModif);
        if (cocheModif != null){
            cocheModif = coche;
            cochesGuardados.set(index,cocheModif);
            return true;
        }

        return false;
    }

    @Override
    public boolean eliminarCoche(long id) {
        if (existeCoche(id)){
            cochesGuardados.remove(obtenerCoche(id));
            return true;
        }
        return false;
    }

    private boolean existeCoche(long id){
        for (Coche coche: cochesGuardados) {
            if (id == coche.getId()){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Coche> listarCoches() {
        return cochesGuardados;
    }

    public static Coche asignarIdACoche(Coche coche){
        idUltimoCoche++;
        coche.setId(idUltimoCoche);
        return coche;
    }

    public static int getIdUltimoCoche() {
        return idUltimoCoche;
    }

    public static void setIdUltimoCoche(int idUltimoCoche) {
        CocheMemoria.idUltimoCoche = idUltimoCoche;
    }
}
