package com.JavaAvanzado.ProyectoFinal.Entities;

import com.JavaAvanzado.ProyectoFinal.Entities.Partes.AireAcondicionado;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Inyeccion;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Motor;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.TanqueGasolina;
import com.fasterxml.jackson.annotation.JsonCreator;

public class CocheCombustion extends Coche{
    private TanqueGasolina tanqueGasolina;
    @JsonCreator
    public CocheCombustion(long id, Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado, TanqueGasolina tanqueGasolina) {
        super(id, motor, inyeccion, aireAcondicionado);
        this.tanqueGasolina = tanqueGasolina;
    }
    @JsonCreator
    public CocheCombustion(Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado, TanqueGasolina tanqueGasolina) {
        super(motor, inyeccion, aireAcondicionado);
        this.tanqueGasolina = tanqueGasolina;
    }

    @Override
    public String toString() {
        return "CocheCombustion{" +
                super.toString() +
                "tanqueGasolina=" + tanqueGasolina +
                '}';
    }
}
