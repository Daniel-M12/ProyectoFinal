package com.JavaAvanzado.ProyectoFinal.Service;

import com.JavaAvanzado.ProyectoFinal.Entities.Coche;
import com.JavaAvanzado.ProyectoFinal.Entities.TiposCoches;
import com.JavaAvanzado.ProyectoFinal.Exceptions.TipoNoExistenteException;

public class CocheFactory {
    private CocheFactory() {
    }

    public static Coche frabricarCoche(TiposCoches tipoCoche) throws TipoNoExistenteException {
        Coche cocheFabricado = null;

        switch (tipoCoche){
            case COMBUSTION -> cocheFabricado = CocheFacade.ensamblarCocheCombustion();
            case ELECTRICO -> cocheFabricado = CocheFacade.ensamblarCocheElectrico();
            case HIBRIDO -> cocheFabricado = CocheFacade.ensamblarCocheHibrido();
            default -> throw new TipoNoExistenteException();
        }

        return cocheFabricado;
    }
}
