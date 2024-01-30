package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.nio.file.*;
public class EJ_3 {
    public static void main(String[] args){
        //Programa que acepta el nombre de una carpeta
        // por teclado y borra todos los ficheros que contiene (sólo ficheros)

        Scanner sc=new Scanner(System.in);

        System.out.println("Escriba la ruta y nombre de la carpeta en la que quieras borrar los ficheros");
        String ruta=sc.nextLine();

        Path p=Paths.get(ruta);

// de esta forma no entra a otros directorios dentro del directorio, solo revisa el directorio añadido por teclado
        try{
            DirectoryStream<Path> stream=Files.newDirectoryStream(p);
            for(Path path : stream){
                if(Files.isRegularFile(path)){
                    Files.delete(path);
                }
            }

        }catch(IOException e){
            System.out.println("ERROR "+e);
        }

    }
}
