package Model;
import java.util.*;
import java.time.*;
public class Class1 {
    private Movimiento ;
    public Movimiento get() {
        return ;
    }
    public void set(Movimiento ) {
        this. = ;
    }
    public void link(Movimiento _) {
        if (_ != null) {
            _.unlink();
            _.set(this);
        }

        unlink();
        set(_);
    }
    public void unlink() {
        if (get() != null) {
            get().set(null);
            set(null);
        }
    }
}
