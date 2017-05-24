
package Excepciones;


public class NumeroCiudadesException extends Exception {
    public NumeroCiudadesException(){
     super("La estacion meteorologica central tiene exactamente 12 ciudades "
             + "en registro");
    }
}
