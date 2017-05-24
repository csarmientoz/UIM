
package ClasesP;

import java.util.Date;


public class scorr extends sensor {
    private int cantCorriente;

    public scorr(Date fechaInstalacion, String marca, int referencia, int cantCorriente) {
        super(fechaInstalacion, marca, referencia);
        this.cantCorriente = cantCorriente;
    }

    public int getCantCorriente() {
        return cantCorriente;
    }

    public void setCantCorriente(int cantCorriente) {
        this.cantCorriente = cantCorriente;
    }
    
}
