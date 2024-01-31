package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class EJ_9 {
    public static void main(String[] args){
        //Programa que lista los archivos de un directorio (sólo los archivos).
        // Para cada archivo que puede leer, imprimirá su contenido en pantalla

        Path ruta=Paths.get("C:\\Users\\PortatilMsi\\Desktop\\PRUEBAS_FICHEROS");
        try{
            DirectoryStream<Path> stream= Files.newDirectoryStream(ruta);

            for(Path path : stream){
                if(Files.isRegularFile(path)){
                    List<String> lista=Files.readAllLines(path);
                    System.out.println("EL ARCHIVO "+path.getFileName()+" TIENE EL SIGUIENTE CONTENIDO:");
                    System.out.println(lista);
                }
            }
            }catch(IOException e){

        }
    }
}
