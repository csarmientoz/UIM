package ClasesP;

import Excepciones.NumeroSensoresException;
import java.util.Date;

public class Estacion {

    private Sensor[] sensores;
    protected String nombre;
    protected String ubicacion;
    protected Date fechaInstalacion;

    public Estacion(String nombre, String ubicacion, Date 
            fechaInstalacion) throws NumeroSensoresException {
        this.sensores = new Sensor[3];
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fechaInstalacion = fechaInstalacion;
        
        if(sensores.length>3)
            throw new NumeroSensoresException();
    }

    public Sensor[] getSensores() {
        return sensores;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setSensores(Sensor[] sensores) {
        this.sensores = sensores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }
    
    

}
