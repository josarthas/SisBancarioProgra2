package sistemabancario;

public class Cliente {

    private String idCliente;
    private String nombre;
    private String direccion;
    private String rfc;
    private String correo;
    private String numero;
    private String passwd;
    
    public Cliente(String ID, String nom, String dir, String rfcc, String corr, String num, String pssswd){
        ID=idCliente;
        nom=nombre;
        dir=direccion;
        rfcc=rfc;
        corr=correo;
        num=numero;
        pssswd=passwd;
    }

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
    public String getPasswd() {
        return passwd;

    }
}
 