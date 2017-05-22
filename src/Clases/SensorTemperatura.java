
package Clases;

import java.util.Date;


public class SensorTemperatura extends sensor{
    private int temperatura;
    int cantidadDatos;

    public SensorTemperatura(int temperatura, String marca, int referencia, 
            String nombre, String ubicacion, Date fechaInstalacion, int cantidadDatos) {
        super(marca, referencia, nombre, ubicacion, fechaInstalacion);
        this.temperatura = temperatura;
        this.cantidadDatos = cantidadDatos;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

   


    @Override
    public void calcularPromedioValores() {
        double promedio = 0;
        
           promedio = (this.temperatura)/this.cantidadDatos;
    }

    @Override
    public String mostrarRegistro() {
      return "Temperatura " + this.nombre + " " + this.temperatura + " " + this.marca
               + " " + this.ubicacion + " " + this.fechaInstalacion + " " + this.referencia;
    }
    }

    

