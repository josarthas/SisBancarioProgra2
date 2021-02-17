package Model;
import java.util.*;
import java.time.*;
public class Sucursal {
    private String numSucursal;
    private String direccion;
    private String tipo;
    private Set<Empleado>  = new HashSet<>();
    private Sucursal ;
    private Sucursal ;
    private Set<Cuenta>  = new HashSet<>();
    private Sucursal ;
    private Sucursal ;
    public String getNumSucursal() {
        return numSucursal;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTipo() {
        return tipo;
    }
    public Set<Empleado> get() {
        return ;
    }
    public Sucursal get() {
        return ;
    }
    public Sucursal get() {
        return ;
    }
    public Set<Cuenta> get() {
        return ;
    }
    public Sucursal get() {
        return ;
    }
    public Sucursal get() {
        return ;
    }
    public void setNumSucursal(String numSucursal) {
        this.numSucursal = numSucursal;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void set(Sucursal ) {
        this. = ;
    }
    public void set(Sucursal ) {
        this. = ;
    }
    public void set(Sucursal ) {
        this. = ;
    }
    public void set(Sucursal ) {
        this. = ;
    }
    public void link(Empleado _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
            get().add(_);
        }
    }
    public void link(Sucursal _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }
        unlink();
        set(_);
    }
    public void link(Sucursal _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }
        unlink();
        set(_);
    }
    public void link(Cuenta _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
            get().add(_);
        }
    }
    public void link(Sucursal _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }
        unlink();
        set(_);
    }
    public void link(Sucursal _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }
        unlink();
        set(_);
    }
    public void unlink(Empleado _) {
        if (_ != null) {
            _.set(null);
            get().remove(_);
        }
    }
    public void unlink(Empleado _, Iterator<Empleado> it) {
        if (_ != null) {
            _.set(null);
            it.remove();
        }
    }
    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }
    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }
    public void unlink(Cuenta _) {
        if (_ != null) {
            _.set(null);
            get().remove(_);
        }
    }
    public void unlink(Cuenta _, Iterator<Cuenta> it) {
        if (_ != null) {
            _.set(null);
            it.remove();
        }
    }
    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }
    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }
}
