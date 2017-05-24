package ClasesP;

import Excepciones.NumeroCiudadesException;
import java.util.ArrayList;

public class UIM implements registro {

    private ArrayList<registro> registros;
    private ArrayList<ciudad> ciudades;

    public UIM(ArrayList<ciudad> ciudades) throws NumeroCiudadesException {
        this.ciudades = ciudades;

        if (ciudades.size() > 12) {
            throw new NumeroCiudadesException();
        }
    }

    @Override
    public void generarRegistro() {

        for (ciudad c : ciudades) {
            System.out.println("El registro de ciudades segun el archivo cargado es: " + " " + c.getEstaciones());
            for (estacion e : c.getEstaciones()) {
                System.out.println("El registro de estaciones segun el archivo cargado es: " + " " + e.nombre + " " + e.ubicacion + " "
                        + e.fechaInstalacion);
                for (sensor s : e.getSensores()) {
                    System.out.println("El registro de sensores segun el archivo cargado es: " + " " + s.marca + " " + s.referencia);
                }
            }
        }

    }

    @Override
    public void calcularPromedio() {
        for (ciudad c : ciudades) {
            double agua = 0;
            int temp = 0;
            int corriente = 0;
            for (estacion e : c.getEstaciones()) {
                for (sensor s : e.getSensores()) {
                    if (s instanceof slluvia) {
                        agua += ((slluvia) s).getCantAgua();
                    }
                    if (s instanceof stemp) {
                        temp += ((stemp) s).getTempActual();
                    }
                    if (s instanceof scorr) {
                        corriente += ((scorr) s).getCantCorriente();
                    }

                }
            }
            System.out.println("promedios por ciudad" + " " + c);
            System.out.println("promedio agua:" + " " + agua / c.getEstaciones().size());
            System.out.println("promedio agua:" + " " + temp / c.getEstaciones().size());
            System.out.println("promedio agua:" + " " + corriente / c.getEstaciones().size());
        }

    }
}
