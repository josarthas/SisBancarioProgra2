package Model;
import java.util.*;
import java.time.*;

public class Cliente {

    private String idCliente;
    private String nombre;
    private String direccion;
    private String rfc;
    private String correo;
    private String numero;
    private Set<Cuenta>  = new HashSet<>();
    public String getIdCliente() {
        return idCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getRfc() {
        return rfc;
    }
    public String getCorreo() {
        return correo;
    }
    public String getNumero() {
        return numero;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
