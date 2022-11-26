package com.JavaAvanzado.ProyectoFinal.Entities;

import com.JavaAvanzado.ProyectoFinal.Entities.Partes.*;

public class CocheHibrido extends Coche {
    private TanqueDeHidrogeno tanqueDeHidrogeno;

    public CocheHibrido(long id, Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado, TanqueDeHidrogeno tanqueDeHidrogeno) {
        super(id, motor, inyeccion, aireAcondicionado);
        this.tanqueDeHidrogeno = tanqueDeHidrogeno;
    }

    public CocheHibrido(Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado, TanqueDeHidrogeno tanqueDeHidrogeno) {
        super(motor, inyeccion, aireAcondicionado);
        this.tanqueDeHidrogeno = tanqueDeHidrogeno;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                super.toString() +
                "tanqueDeHidrogeno=" + tanqueDeHidrogeno +
                '}';
    }
}
