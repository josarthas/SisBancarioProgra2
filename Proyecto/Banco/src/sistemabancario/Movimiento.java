package sistemabancario;
import Interfaz.*;
import java.time.*;

public class Movimiento {
    private String idMovimiento;
    private String tipo;
    private LocalDate fecha;
    private float monto;
    
    public String getIdMovimiento() {
        return idMovimiento;
    }

    public float getMonto() {
        return monto;
    }
    public String setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = LocalDate.now();
    }

}
