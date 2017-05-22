package Clases;

import Excepciones.NumeroEstacionesException;
import java.util.ArrayList;

public class Ciudad {

    private String nombre;

    private ArrayList<estacion> estaciones;

    public Ciudad(String nombre) throws NumeroEstacionesException {
        this.estaciones = new ArrayList<>();
        this.nombre = nombre;

        if (estaciones.size() < 3) {
            throw new NumeroEstacionesException();
        }

    }
    
    public void registrarEstacion(estacion e){
    this.estaciones.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
