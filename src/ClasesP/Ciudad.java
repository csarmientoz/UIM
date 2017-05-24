
package ClasesP;

import Excepciones.NumeroEstacionesException;
import java.util.ArrayList;


public class Ciudad{
     private ArrayList<Estacion> estaciones;
     private String nombre;

    public Ciudad(ArrayList<Estacion> estaciones, String nombre) throws
            NumeroEstacionesException {
        this.estaciones = estaciones;
        this.nombre=nombre;
        
//        if(estaciones.size()<3)
//            throw new NumeroEstacionesException();
    }
    

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
