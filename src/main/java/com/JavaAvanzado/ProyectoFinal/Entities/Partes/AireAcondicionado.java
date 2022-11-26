package com.JavaAvanzado.ProyectoFinal.Entities.Partes;

public class AireAcondicionado {
    private boolean estaEncendido;
    private String estado;
    private double temperatura;

    public AireAcondicionado(boolean estaEncendido, String estado, double temperatura) {
        this.estaEncendido = estaEncendido;
        this.estado = estado;
        this.temperatura = temperatura;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
