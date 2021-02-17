package Model;
import java.util.*;
import java.time.*;
public class Empleado {
    private String idEmpleado;
    private String rfc;
    private String nombre;
    private String puesto;
    private String domicilio;
    private Sucursal ;
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
    public Sucursal get() {
        return ;
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
    public void set(Sucursal ) {
        this. = ;
    }
    public void link(Sucursal _) {
        if (_ != null) {
            _.get().add(this);
        }
        unlink();
        set(_);
    }
    public void unlink() {
        if (get() != null) {
            get().get().remove(this);
            set(null);
        }
    }
}
