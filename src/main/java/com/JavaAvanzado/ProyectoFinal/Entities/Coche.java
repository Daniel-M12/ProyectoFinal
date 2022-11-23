package com.JavaAvanzado.ProyectoFinal.Entities;

import com.JavaAvanzado.ProyectoFinal.Entities.Partes.AireAcondicionado;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Inyeccion;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Motor;

public abstract class Coche {
    private long id;
    private Motor motor;
    private Inyeccion inyeccion;
    private AireAcondicionado aireAcondicionado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Inyeccion getInyeccion() {
        return inyeccion;
    }

    public void setInyeccion(Inyeccion inyeccion) {
        this.inyeccion = inyeccion;
    }

    public AireAcondicionado getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(AireAcondicionado aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
}
