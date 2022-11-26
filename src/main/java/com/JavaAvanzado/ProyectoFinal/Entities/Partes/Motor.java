package com.JavaAvanzado.ProyectoFinal.Entities.Partes;

public class Motor {
    private boolean estaEncendido;
    private double temperatura;
    private int vidaUtil;

    public Motor(boolean estaEncendido, double temperatura, int vidaUtil) {
        this.estaEncendido = estaEncendido;
        this.temperatura = temperatura;
        this.vidaUtil = vidaUtil;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
}
