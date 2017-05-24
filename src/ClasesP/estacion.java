package ClasesP;

import Excepciones.NumeroSensoresException;
import java.util.Date;

public class estacion {

    private sensor[] sensores;
    protected String nombre;
    protected String ubicacion;
    protected Date fechaInstalacion;

    public estacion(String nombre, String ubicacion, Date 
            fechaInstalacion) throws NumeroSensoresException {
        this.sensores = new sensor[3];
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fechaInstalacion = fechaInstalacion;
        
        if(sensores.length>3)
            throw new NumeroSensoresException();
    }

    public sensor[] getSensores() {
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

    public void setSensores(sensor[] sensores) {
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
