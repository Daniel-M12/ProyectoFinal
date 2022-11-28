package com.JavaAvanzado.ProyectoFinal.Entities.Partes;

public class TanqueGasolina {
    private int capacidad;
    private int volumenActual;
    private int temperatura;

    public TanqueGasolina(int capacidad, int volumenActual, int temperatura) {
        this.capacidad = capacidad;
        this.volumenActual = volumenActual;
        this.temperatura = temperatura;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "TanqueGasolina{" +
                "capacidad=" + capacidad +
                ", volumenActual=" + volumenActual +
                ", temperatura=" + temperatura +
                '}';
    }
}
