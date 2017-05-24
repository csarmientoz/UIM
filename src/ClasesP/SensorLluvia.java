
package ClasesP;

import java.util.Date;


public class SensorLluvia extends Sensor{
    private double cantAgua;

    public SensorLluvia(Date fechaInstalacion, String marca, int referencia, double cantAgua ) {
        super(fechaInstalacion, marca, referencia);
        this.cantAgua = cantAgua;
    }

    public double getCantAgua() {
        return cantAgua;
    }

    public void setCantAgua(double cantAgua) {
        this.cantAgua = cantAgua;
    }
    
    
}
