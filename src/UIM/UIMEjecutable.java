package UIM;

import ClasesP.UIM;
import ClasesP.Ciudad;
import ClasesP.Estacion;
import ClasesP.SensorCorriente;
import ClasesP.Sensor;
import ClasesP.SensorLluvia;
import ClasesP.SensorTemperatura;
import Excepciones.NumeroCiudadesException;
import Excepciones.NumeroEstacionesException;
import Excepciones.NumeroSensoresException;
import dao.Archivo;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import ClasesP.Registro;

public class UIMEjecutable {

    public static void main(String[] args) throws NumeroCiudadesException, NumeroEstacionesException, NumeroSensoresException {
        ArrayList<String> datosUIM = new ArrayList<String>();
        Archivo datos = new Archivo();
        datosUIM=datos.LeerArchivo();

        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ArrayList<Estacion> estaciones = new ArrayList<>();

        int posicion = 0;
        for (String d1 : datosUIM) {
            String[] datosSeparados = d1.split(",");
            String nombreCiudad = datosSeparados[0];
           
            
            int numEstaciones = Integer.parseInt(datosSeparados[1]);
            posicion+=2;            
            do {
                String nombreEstacion = datosSeparados[posicion];
                Estacion estacion = new Estacion(nombreEstacion, "", new Date());
                posicion += 1;
                int regSensores = Integer.parseInt(datosSeparados[posicion]);
                posicion += 1;
                do {
                    try {
                        String[] datosSensores = datosSeparados[posicion].split(";");
                        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        Date date = format.parse(datosSensores[0]);
                        Sensor temperatura = new SensorTemperatura(date, "", 0, Integer.parseInt(datosSensores[1]));
                        Sensor agua = new SensorLluvia(date, "", 0, Integer.parseInt(datosSensores[2]));
                        Sensor electricidad = new SensorCorriente(date, "", 0, Integer.parseInt(datosSensores[3]));
                        estacion.setSensores(new Sensor[]{temperatura, agua, electricidad});
                        posicion += 1;
                        regSensores -= 1;
                    } catch (ParseException ex) {
                       ex.printStackTrace();
                    }
                } while (regSensores != 0);
                estaciones.add(estacion);
                numEstaciones -= 1;
            } while (numEstaciones != 0);
            Ciudad city = new Ciudad(estaciones, nombreCiudad );
            ciudades.add(city);
        }
        
     
       
        
        
        
      UIM UnidadCentral = new UIM(ciudades) ;
      UnidadCentral.calcularPromedio();
      UnidadCentral.generarRegistro();
    }
    }


