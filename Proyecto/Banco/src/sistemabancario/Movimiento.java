package sistemabancario;
import Interfaz.*;
import java.time.*;

public class Movimiento {
    private String idMovimiento;
    private String tipo;
    private LocalDate fecha;
    private float monto;
    
    public Movimiento(String ID, String tipo, LocalDate fech, float monto){
        
}
    
    public String getIdMovimiento() {
        return idMovimiento;
    }

    public float getMonto() {
        return monto;
    }
    public String setIdMovimiento() {
        return idMovimiento;
    }
    public String getTipo() {
        return tipo;
    }
    public LocalDate setFecha() {
        return fecha;
    }

}
