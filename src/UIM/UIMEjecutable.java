package UIM;

import ClasesP.UIM;
import ClasesP.ciudad;
import ClasesP.estacion;
import ClasesP.registro;
import ClasesP.scorr;
import ClasesP.sensor;
import ClasesP.slluvia;
import ClasesP.stemp;
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

public class UIMEjecutable {

    public static void main(String[] args) throws NumeroCiudadesException, NumeroEstacionesException, NumeroSensoresException {
        ArrayList<String> datosUIM = new ArrayList<String>();
        Archivo datos = new Archivo();
        datosUIM=datos.LeerArchivo();

        ArrayList<ciudad> ciudades = new ArrayList<>();
        ArrayList<estacion> estaciones = new ArrayList<>();

        int posicion = 0;
        for (String d1 : datosUIM) {
            String[] datosSeparados = d1.split(",");
            String nombreCiudad = datosSeparados[0];
           
            
            int numEstaciones = Integer.parseInt(datosSeparados[1]);
            posicion+=2;            
            do {
                String nombreEstacion = datosSeparados[posicion];
                estacion estacion = new estacion(nombreEstacion, "", new Date());
                posicion += 1;
                int regSensores = Integer.parseInt(datosSeparados[posicion]);
                posicion += 1;
                do {
                    try {
                        String[] datosSensores = datosSeparados[posicion].split(";");
                        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        Date date = format.parse(datosSensores[0]);
                        sensor temperatura = new stemp(date, "", 0, Integer.parseInt(datosSensores[1]));
                        sensor agua = new slluvia(date, "", 0, Integer.parseInt(datosSensores[2]));
                        sensor electricidad = new scorr(date, "", 0, Integer.parseInt(datosSensores[3]));
                        estacion.setSensores(new sensor[]{temperatura, agua, electricidad});
                        posicion += 1;
                        regSensores -= 1;
                    } catch (ParseException ex) {
                       ex.printStackTrace();
                    }
                } while (regSensores != 0);
                estaciones.add(estacion);
                numEstaciones -= 1;
            } while (numEstaciones != 0);
            ciudad city = new ciudad(estaciones, nombreCiudad );
            ciudades.add(city);
        }
        
     
       
        
        
        
      UIM UnidadCentral = new UIM(ciudades) ;
      UnidadCentral.calcularPromedio();
      UnidadCentral.generarRegistro();
    }
    }


