package Model;
import java.util.*;
import java.time.*;
public class Movimiento {
    private String idMovimiento;
    private String tipo;
    private String fecha;
    private float monto;
    private Cuenta ;
    private Class1 ;
    public String getIdMovimiento() {
        return idMovimiento;
    }
    public String getTipo() {
        return tipo;
    }
    public String getFecha() {
        return fecha;
    }
    public float getMonto() {
        return monto;
    }
    public Cuenta get() {
        return ;
    }
    public Class1 get() {
        return ;
    }
    public void setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public void set(Cuenta ) {
        this. = ;
    }
    public void set(Class1 ) {
        this. = ;
    }
    public void link(Cuenta _) {
        if (_ != null) {
            _.get().add(this);
        }
        unlink();
        set(_);
    }
    public void link(Class1 _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
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
    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }
}
