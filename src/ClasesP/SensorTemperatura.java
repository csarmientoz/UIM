
package ClasesP;

import java.util.Date;


public class SensorTemperatura extends Sensor{
    private int tempActual;

    public SensorTemperatura(Date fechaInstalacion, String marca, int referencia, int tempActual) {
        super(fechaInstalacion, marca, referencia);
        this.tempActual = tempActual;
    }

    public int getTempActual() {
        return tempActual;
    }

    public void setTempActual(int tempActual) {
        this.tempActual = tempActual;
    }
    
}
