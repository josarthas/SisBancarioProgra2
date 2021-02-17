package Model;
import java.util.*;
import java.time.*;
public class Cuenta {
    private String numeroDeCuenta;
    private float saldo;
    private String clabe;
    private String tipo;
    private Set<Movimiento>  = new HashSet<>();
    private Cuenta ;
    private Cuenta ;
    private Cliente ;
    private Sucursal ;
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public float getSaldo() {
        return saldo;
    }
    public String getClabe() {
        return clabe;
    }
    public String getTipo() {
        return tipo;
    }
    public Set<Movimiento> get() {
        return ;
    }
    public Cuenta get() {
        return ;
    }
    public Cuenta get() {
        return ;
    }
    public Cliente get() {
        return ;
    }
    public Sucursal get() {
        return ;
    }
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void set(Cuenta ) {
        this. = ;
    }
    public void set(Cuenta ) {
        this. = ;
    }
    public void set(Cliente ) {
        this. = ;
    }
    public void set(Sucursal ) {
        this. = ;
    }
    public void link(Movimiento _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
            get().add(_);
        }
    }
    public void link(Cuenta _) {
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
        }
        unlink();
        set(_);
    }
    public void link(Cliente _) {
        if (_ != null) {
            _.get().add(this);
        }
        unlink();
        set(_);
    }
    public void link(Sucursal _) {
        if (_ != null) {
            _.get().add(this);
        }
        unlink();
        set(_);
    }
    public void unlink(Movimiento _) {
        if (_ != null) {
            _.set(null);
            get().remove(_);
        }
    }
    public void unlink(Movimiento _, Iterator<Movimiento> it) {
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
    public void unlink() {
        if (get() != null) {
            get().get().remove(this);
            set(null);
        }
    }
    public void unlink() {
        if (get() != null) {
            get().get().remove(this);
            set(null);
        }
    }
}
