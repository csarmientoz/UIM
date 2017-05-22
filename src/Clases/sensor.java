
package Clases;

import java.util.Date;


public abstract class sensor extends estacion{
    protected String marca;
    protected int referencia;

    public sensor(String marca, int referencia, String nombre, String ubicacion, Date fechaInstalacion) {
        super(nombre, ubicacion, fechaInstalacion);
        this.marca = marca;
        this.referencia = referencia;
    }

   

    public String getMarca() {
        return marca;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
    
    public abstract void calcularPromedioValores();
    
    
    
}
