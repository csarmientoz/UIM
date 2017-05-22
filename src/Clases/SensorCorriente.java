
package Clases;

import java.util.ArrayList;
import java.util.Date;


public class SensorCorriente extends sensor {
    private int cantidadCorriente;
    int cantidadDatos;

    public SensorCorriente(int cantidadCorriente, String marca, int referencia, String nombre, String ubicacion,
            Date fechaInstalacion, int cantidadDatos) {
        super(marca, referencia, nombre, ubicacion, fechaInstalacion);
        this.cantidadCorriente = cantidadCorriente;
        this.cantidadDatos = cantidadDatos;
    }

    public int getCantidadCorriente() {
        return cantidadCorriente;
    }

    public void setCantidadCorriente(int cantidadCorriente) {
        this.cantidadCorriente = cantidadCorriente;
    }

   
    

   
 

    @Override
    public void calcularPromedioValores() {
       double promedio = 0;
        
           promedio = (this.cantidadCorriente)/this.cantidadDatos;
    }

    @Override
    public String mostrarRegistro() {
         return "Temperatura " + this.nombre + " " + this.cantidadCorriente + " " + this.marca
               + " " + this.ubicacion + " " + this.fechaInstalacion + " " + this.referencia;
    }

   
}
