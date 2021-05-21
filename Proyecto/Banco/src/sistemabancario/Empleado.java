package sistemabancario;

public class Empleado {
    private String idEmpleado;
    private String rfc;
    private String nombre;
    private String puesto;
    private String domicilio;
    
    public Empleado(String ID, String nRFC, String nom, String puest, String dom){
        idEmpleado=ID;
        rfc=nRFC;
        nombre=nom;
        puesto=puest;
        domicilio=dom;
    }   
    public String getIdEmpleado() {
        return idEmpleado;
    }
    public String getRfc() {
        return rfc;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public String getDomicilio() {
        return domicilio;
    }
}