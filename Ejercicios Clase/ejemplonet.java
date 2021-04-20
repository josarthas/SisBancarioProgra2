import java.io.*;
import java.net.*;      //Proporcionalasclasespara implementaraplicacionesde redes
public class IOFlujos{public static void leerEscribir(InputStreamin, OutputStreamout) throws IOException{
  InputStreamReaderisr= new InputStreamReader(in);
  BufferedReaderbr= new BufferedReader(isr);
  PrintStreamps= new PrintStream(out);
  String linea= br.readLine();
  while (linea!= null) {
    ps.println(linea);
    linea= br.readLine();
  }
}
public static void main(String[] args) throws IOException{
      // Leer de Internet y escribira un archivo
      System.out.println("*** De Internet a un  Archivo***");
      URL u = new URL("http://www.cs.buap.mx/");
      InputStreamnet = u.openStream();
      File aout= new File("CShome.html");
      FileOutputStreamarchivoos= new FileOutputStream(aout);
      leerEscribir(net, archivoos);
      archivoos.close();
      // Leer de un archivoy escribira pantalla
      System.out.println("*** De Archivo a pantalla***");
      File fin = new File("CShome.html");
      FileInputStreamarchivois= new FileInputStream(fin);
      leerEscribir(archivois, System.out);
      archivois.close();
    }
