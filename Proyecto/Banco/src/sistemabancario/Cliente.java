package sistemabancario;

import java.util.*;

public class Cliente {

    //los elementos son privados
    private final int idCliente;
    private String nombre;
    private String direccion;
    private String rfc;
    private String correo;
    private String numero;
    private String passwd;

//clase publica que llena los elementos provados    
    public Cliente(int ID, String nom, String dir, String rfcc, String corr, String num, String pssswd){
        idCliente=ID;
        nombre=nom;
        direccion=dir;
        rfc=rfcc;
        correo=corr;
        numero=num;
        passwd=pssswd;
    }
    //se automatiza el ID, se le manda el ultimo id y se le suma 1
    public static int setIDCliente(int idc){
        int newid=idc++;
        System.out.println("\nNuevo Cliente: " + newid);
        return newid;    
    }
    
    public int getIdCliente() {
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
    
    //clase para llenado de un objeto
    public static Cliente setCliente(int antidc){
        int antid = setIDCliente(antidc);           
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese Nombre del cliente: ");
        String nom = sc.nextLine();
        System.out.println("\nIngrese direccion del cliente: ");
        String dir = sc.nextLine();
        System.out.println("\nIngrese RFC del cliente: ");
        String rfc1,rfc2;
        try{
            rfc1 = sc.nextLine();
            rfc2 = rfc1.substring(0,12);
            
        }
        catch(StringIndexOutOfBoundsException inperr){
            System.out.println("\nRFC no valido, reingrese: ");
            rfc1 = sc.nextLine();
            rfc2 = rfc1.substring(0,12);
        }

        System.out.println("\nIngrese correo electrónico: ");
        String email = sc.nextLine();
        String numbs;
        try{
            System.out.print("\nIngrese numero del cliente: ");
            int numb = sc.nextInt();
            numbs = Integer.toString(numb);
                        
        }
        catch(InputMismatchException alt){
            System.out.print("\nError de formato"+alt+", ingrese numero correcto: ");
            int numb = sc.nextInt();
            numbs = Integer.toString(numb);
        }
        System.out.println("\nCree contraseña cliente: ");
        String passw = sc.next();
        Cliente clien=new Cliente(antid, nom, dir, rfc2, email, numbs, passw);
        
        return clien;
    }
}