/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class SensorLluvia extends sensor {
    
    int cantidadAgua;
    int cantidadDatos;

    public SensorLluvia(int cantidadAgua, String marca, int referencia, String nombre, String ubicacion, Date fechaInstalacion
    , int cantidadDatos) {
        super(marca, referencia, nombre, ubicacion, fechaInstalacion);
        this.cantidadAgua = cantidadAgua;
        this.cantidadDatos = cantidadDatos;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }



    @Override
    public void calcularPromedioValores() {
         double promedio = 0;
        
           promedio = (this.cantidadAgua)/this.cantidadDatos;
    }

    @Override
    public String mostrarRegistro() {
         return "Temperatura " + this.nombre + " " + this.cantidadAgua + " " + this.marca
               + " " + this.ubicacion + " " + this.fechaInstalacion + " " + this.referencia;
    }

    
}
