package sistemabancario;

public class Empleado {
    private String idEmpleado;
    private String rfc;
    private String nombre;
    private String puesto;
    private String domicilio;
    private String getIdEmpleado() {
        return idEmpleado;
    }
    private String getRfc() {
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

    private void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    private void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
