package com.JavaAvanzado.ProyectoFinal.Entities;

import com.JavaAvanzado.ProyectoFinal.Entities.Partes.AireAcondicionado;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Bateria;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Inyeccion;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Motor;
import com.fasterxml.jackson.annotation.JsonCreator;

public class CocheElectrico extends Coche {
    private Bateria bateria;

    @JsonCreator
    public CocheElectrico(long id, Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado, Bateria bateria) {
        super(id, motor, inyeccion, aireAcondicionado);
        this.bateria = bateria;
    }

    @JsonCreator
    public CocheElectrico(Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado, Bateria bateria) {
        super(motor, inyeccion, aireAcondicionado);
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                super.toString() +
                "bateria=" + bateria +
                '}';
    }
}
