package com.JavaAvanzado.ProyectoFinal.Entities;

import com.JavaAvanzado.ProyectoFinal.Entities.Partes.AireAcondicionado;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Inyeccion;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Motor;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CocheCombustion.class, name = "CocheCombustion"),
        @JsonSubTypes.Type(value = CocheElectrico.class, name = "CocheElectrico"),
        @JsonSubTypes.Type(value = CocheHibrido.class, name = "CocheHibrido"),}
)
public abstract class Coche {
    private long id;
    private Motor motor;
    private Inyeccion inyeccion;
    private AireAcondicionado aireAcondicionado;

    public Coche(){}

    @JsonCreator
    public Coche(long id, Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado) {
        this.id = id;
        this.motor = motor;
        this.inyeccion = inyeccion;
        this.aireAcondicionado = aireAcondicionado;
    }
    @JsonCreator
    public Coche(Motor motor, Inyeccion inyeccion, AireAcondicionado aireAcondicionado) {
        this.motor = motor;
        this.inyeccion = inyeccion;
        this.aireAcondicionado = aireAcondicionado;
    }

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

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", motor=" + motor +
                ", inyeccion=" + inyeccion +
                ", aireAcondicionado=" + aireAcondicionado +
                '}';
    }
}
