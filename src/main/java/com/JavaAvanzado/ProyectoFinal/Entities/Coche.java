package com.JavaAvanzado.ProyectoFinal.Entities;

import com.JavaAvanzado.ProyectoFinal.Entities.Partes.AireAcondicionado;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Inyeccion;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.Motor;

abstract class Coche {
    private Motor motor;
    private Inyeccion inyeccion;
    private AireAcondicionado aireAcondicionado;
}
