package com.JavaAvanzado.ProyectoFinal.Entities.Partes;

public class Inyeccion {
    private String tipoInyeccion;
    private int velocidadInyeccion;

    public Inyeccion(String tipoInyeccion, int velocidadInyeccion) {
        this.tipoInyeccion = tipoInyeccion;
        this.velocidadInyeccion = velocidadInyeccion;
    }

    public String getTipoInyeccion() {
        return tipoInyeccion;
    }

    public void setTipoInyeccion(String tipoInyeccion) {
        this.tipoInyeccion = tipoInyeccion;
    }

    public int getVelocidadInyeccion() {
        return velocidadInyeccion;
    }

    public void setVelocidadInyeccion(int velocidadInyeccion) {
        this.velocidadInyeccion = velocidadInyeccion;
    }

    @Override
    public String toString() {
        return "Inyeccion{" +
                "tipoInyeccion='" + tipoInyeccion + '\'' +
                ", velocidadInyeccion=" + velocidadInyeccion +
                '}';
    }
}
