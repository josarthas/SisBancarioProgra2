package sistemabancario;
import java.util.*;
public class Cuenta {
    private String numeroDeCuenta;
    private double saldo;
    private String clabe;
    private String tipo;
    
    
        public Cuenta(String ID, double sald, String clab, String typo){
        ID=numeroDeCuenta;
        sald=saldo;
        clab=clabe;
        typo=tipo;
    }
    
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getClabe() {
        return clabe;
    }
    public String getTipo() {
        return tipo;
    }
}
