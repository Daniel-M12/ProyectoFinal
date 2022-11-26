package com.JavaAvanzado.ProyectoFinal.Entities;

import com.JavaAvanzado.ProyectoFinal.Entities.Partes.AireAcondicionado;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Inyeccion;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Motor;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.TanqueGasolina;

public class CocheCombustion extends Coche{
    private TanqueGasolina tanqueGasolina;

    public CocheCombustion(long id, Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado, TanqueGasolina tanqueGasolina) {
        super(id, motor, inyeccion, aireAcondicionado);
        this.tanqueGasolina = tanqueGasolina;
    }

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
