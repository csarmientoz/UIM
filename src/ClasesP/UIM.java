package ClasesP;

import Excepciones.NumeroCiudadesException;
import java.util.ArrayList;

public class UIM implements Registro {

    private ArrayList<Registro> registros;
    private ArrayList<Ciudad> ciudades;

    public UIM(ArrayList<Ciudad> ciudades) throws NumeroCiudadesException {
        this.ciudades = ciudades;

        if (ciudades.size() > 12) {
            throw new NumeroCiudadesException();
        }
    }

    @Override
    public void generarRegistro() {

        for (Ciudad c : ciudades) {
            System.out.println("El registro de ciudades segun el archivo cargado es: " + " " + c.getEstaciones());
            for (Estacion e : c.getEstaciones()) {
                System.out.println("El registro de estaciones segun el archivo cargado es: " + " " + e.nombre + " " + e.ubicacion + " "
                        + e.fechaInstalacion);
                for (Sensor s : e.getSensores()) {
                    System.out.println("El registro de sensores segun el archivo cargado es: " + " " + s.marca + " " + s.referencia);
                }
            }
        }

    }

    @Override
    public void calcularPromedio() {
        for (Ciudad c : ciudades) {
            double agua = 0;
            int temp = 0;
            int corriente = 0;
            for (Estacion e : c.getEstaciones()) {
                for (Sensor s : e.getSensores()) {
                    if (s instanceof SensorLluvia) {
                        agua += ((SensorLluvia) s).getCantAgua();
                    }
                    if (s instanceof SensorTemperatura) {
                        temp += ((SensorTemperatura) s).getTempActual();
                    }
                    if (s instanceof SensorCorriente) {
                        corriente += ((SensorCorriente) s).getCantCorriente();
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
