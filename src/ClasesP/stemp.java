
package ClasesP;

import java.util.Date;


public class stemp extends sensor{
    private int tempActual;

    public stemp(Date fechaInstalacion, String marca, int referencia, int tempActual) {
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
