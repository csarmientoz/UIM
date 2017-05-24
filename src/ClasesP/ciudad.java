
package ClasesP;

import Excepciones.NumeroEstacionesException;
import java.util.ArrayList;


public class ciudad{
     private ArrayList<estacion> estaciones;
     private String nombre;

    public ciudad(ArrayList<estacion> estaciones, String nombre) throws
            NumeroEstacionesException {
        this.estaciones = estaciones;
        this.nombre=nombre;
        
//        if(estaciones.size()<3)
//            throw new NumeroEstacionesException();
    }
    

    public ArrayList<estacion> getEstaciones() {
        return estaciones;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
