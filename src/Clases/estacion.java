
package Clases;


import java.util.Date;


public  abstract class estacion implements UIM {
    
    protected String nombre;
    protected String ubicacion;
    protected Date fechaInstalacion;

    public estacion(String nombre, String ubicacion, Date fechaInstalacion) {
       
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fechaInstalacion = fechaInstalacion;
    }

   



    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }
    
    
    
    
}
