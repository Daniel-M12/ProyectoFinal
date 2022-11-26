package com.JavaAvanzado.ProyectoFinal.Exceptions;

public class TipoNoExistenteException extends Exception{

    public TipoNoExistenteException() {
        super("Debe elegir un tipo de coche correcto.");
    }
}
