package sistemabancario;
import Interfaz.*;
import java.util.*;
import java.io.*;

public class Banco {


    public static void main(String[] args) {
        ArrayList<Cliente> arrayClien = new ArrayList<Cliente>();
        int i=0;
        arrayClien.add(Cliente.setCliente(i));
        
        BufferedReader reader = new BufferedReader(new FileReader("Clientes.dat"));
        
        try{
            reader = new BufferedReader(new FileReader("Clientes.dat"));
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado, creando"+ fnfe);
            FileWriter writer = new FileWriter("Clientes.dat");
            int max = -1;
            String line = reader.readLine();
            while (line != null){
            int n = Integer.parseInt(line);
            if(n>max)
                max=n;
            line=reader.readLine();
            }
            for(Cliente str: arrayClien){
            writer.write(str+",");
            }
            writer.close();
            
        }

    }
}