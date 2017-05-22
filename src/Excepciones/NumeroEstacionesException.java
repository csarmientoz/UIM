
package Excepciones;


public class NumeroEstacionesException extends Exception {
    public NumeroEstacionesException(){
     super("Como minimo, deben existir tres estaciones meteorologicas por ciudad");
    }
}
