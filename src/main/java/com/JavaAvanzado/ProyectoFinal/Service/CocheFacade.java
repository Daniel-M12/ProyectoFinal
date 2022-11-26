package com.JavaAvanzado.ProyectoFinal.Service;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;
import com.JavaAvanzado.ProyectoFinal.Entities.CocheCombustion;
import com.JavaAvanzado.ProyectoFinal.Entities.CocheElectrico;
import com.JavaAvanzado.ProyectoFinal.Entities.CocheHibrido;
import com.JavaAvanzado.ProyectoFinal.Entities.Partes.*;
import com.JavaAvanzado.ProyectoFinal.Repositories.AlmacenamientoCoche;

public class CocheFacade {
    private CocheFacade() {
    }

    public static Coche ensamblarCocheCombustion(){
        TanqueGasolina tanqueGasolina = new TanqueGasolina(100,90,33);

        Coche cocheCombustion = new CocheCombustion(ensamblarMotor(150,8),ensamblarInyeccion("Combustible",15),ensamblarAireAcondicionado("Nuevo",25),tanqueGasolina);

        return cocheCombustion;
    }

    public static Coche ensamblarCocheElectrico(){
        Bateria bateria = new Bateria(true,100);
        Coche cocheElectrico = new CocheElectrico(ensamblarMotor(80,10),ensamblarInyeccion("Eléctrica",20),ensamblarAireAcondicionado("Nuevo",25), bateria);

        return cocheElectrico;
    }

    public static Coche ensamblarCocheHibrido(){
        TanqueDeHidrogeno tanqueHidrogeno = new TanqueDeHidrogeno(120,300,"Activo");
        Coche cocheHibrido = new CocheHibrido(ensamblarMotor(100,9),ensamblarInyeccion("Híbrida",18),ensamblarAireAcondicionado("Nuevo",25),tanqueHidrogeno);

        return cocheHibrido;
    }

    private static Motor ensamblarMotor(double temp,int vidaUtil){
        return new Motor(true,temp,vidaUtil);
    }

    private static Inyeccion ensamblarInyeccion(String tipo,int velocidad){
        return new Inyeccion(tipo,velocidad);
    }

    private static AireAcondicionado ensamblarAireAcondicionado(String estado, double temperatura){
        return new AireAcondicionado(true,estado,temperatura);
    }
}
