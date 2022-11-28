package com.JavaAvanzado.ProyectoFinal.Entities.Partes;

public class Bateria {
    private boolean encendido;
    private int carga;

    public Bateria(boolean encendido, int carga) {
        this.encendido = encendido;
        this.carga = carga;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "encendido=" + encendido +
                ", carga=" + carga +
                '}';
    }
}
