package sistemabancario;
import Interfaz.*;
import java.util.*;
import java.io.*;
import java.io.ObjectOutputStream;
import javax.swing.SwingUtilities;

public class Banco {


    public static void main(String[] args) throws IOException {
        
                                    SwingUtilities.invokeLater(() -> {
                        
                    InterfazInicio InterfazInicio = new InterfazInicio();
                    });   
            
        
        
        ArrayList<Cliente> arrayClien = new ArrayList<Cliente>();
        int i=0;
        arrayClien.add(Cliente.setCliente(i));
                
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Clientes.dat"));
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado, "+fnfe+"\nCreando...");
            
            FileOutputStream fileOut = new FileOutputStream("Clientes.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            BufferedReader reader = new BufferedReader(new FileReader("Clientes.dat"));
            int max = -1;
            String line = reader.readLine();
            while (line != null){
            int n = Integer.parseInt(line);
            if(n>max)
                max=n;
            line=reader.readLine();
            }
            try {
                Object[] clienArry = arrayClien.toArray();
                for(Object str: clienArry){
                    objectOut.writeObject(str);
                    objectOut.close();
                    System.out.println("The Object  was succesfully written to a file");
                }
            }
            catch(NotSerializableException NSE){
                System.out.println("Error :v");
            }
            
        }

    }
}