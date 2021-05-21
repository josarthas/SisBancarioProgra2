package sistemabancario;
import java.time.*;

public class Movimiento {
    private String idMovimiento;
    private String tipo;
    private final LocalDate fecha;
    private float monto;
    
    public Movimiento(String ID, String tipos, LocalDate fech, float mont){
        idMovimiento=ID;
        tipo=tipos;
        fecha=fech;
        monto=mont;
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
    public LocalDate getFecha() {
        return fecha;
    }
}