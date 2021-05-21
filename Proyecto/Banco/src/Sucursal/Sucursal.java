package Sucursal;

public class Sucursal {
    private final String numSucursal;
    private final String direccion;
    private final String tipo;
    
    public Sucursal(String num, String dire, String type){
        numSucursal=num;
        direccion=dire;
        tipo=type;
    }
    public String getNumSucursal() {
        return numSucursal;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTipo() {
        return tipo;
    }

}