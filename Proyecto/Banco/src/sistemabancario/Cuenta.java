package sistemabancario;

public class Cuenta {
    private String numeroDeCuenta;
    private double saldo;
    private String clabe;
    private String tipo;
        
        public Cuenta(String ID, double sald, String clab, String typo){
        numeroDeCuenta=ID;
        saldo=sald;
        clabe=clab;
        tipo=typo;
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