package com.JavaAvanzado.ProyectoFinal.Entities.Partes;

public class TanqueDeHidrogeno {
    private int capacidad;
    private int potencia;
    private String estado;

    public TanqueDeHidrogeno(int capacidad, int potencia, String estado) {
        this.capacidad = capacidad;
        this.potencia = potencia;
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
