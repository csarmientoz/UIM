
package Excepciones;


public class NumeroSensoresException extends Exception{
    public NumeroSensoresException(){
     super("cada estacion tiene exactamente 3 sensores");
    }
}
