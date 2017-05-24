package ClasesP;

import java.util.Date;

public abstract class Sensor{

    protected String marca;
    protected int referencia;

    public Sensor(Date fechaInstalacion, String marca, int referencia) {
        this.marca = marca;
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
    
    
}
