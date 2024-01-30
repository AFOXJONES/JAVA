package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.nio.file.*;

public class EJ_1 {
    public static void main(String[] args){
        //Haced un programa que lea por teclado el nombre de un fichero junto con la ruta en la que se encuentra
        // y diga si existe o no. Si no existe mostrar un error.
        // Si existe escribid una a una las distintas carpetas de su ruta (usad métodos de la clase Path)
        //Ej, si existe el archivo c:\prueba\ficheros\mio.txt que escriba:
        //C:\
        //prueba
        //ficheros
        //mio.txt

        Path p=Paths.get("C:\\Users\\PortatilMsi\\Desktop\\JAVA\\EJERCICIOS\\10. FICHEROS");

        if(Files.exists(p)){
            System.out.println("La ruta existe");
            //try{
            //    DirectoryStream<Path> stream = Files.newDirectoryStream(p);
                for(Path path : p){
                    System.out.println(path.getFileName());
                }
           // }catch(IOException e){
              //  System.out.println("ERROR "+e);
            //}
        }else{
            System.out.println("La ruta NO existe");
        }
    }
}
