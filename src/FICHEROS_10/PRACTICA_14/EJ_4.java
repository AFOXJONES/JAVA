package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EJ_4 {
    public static void main(String[] args){
        //Modifica el programa anterior para que sólo borre los
        // ficheros que empiecen por una letra anotada desde teclado

        Scanner sc=new Scanner(System.in);

        System.out.println("Escriba la ruta y nombre de la carpeta en la que quieras borrar los ficheros");
        String ruta=sc.nextLine();

        Path p= Paths.get(ruta);

        System.out.println("Escriba la letra por la que debe empezar cada fichero a borrar");
        char letra=sc.next().charAt(0);


// de esta forma no entra a otros directorios dentro del directorio, solo revisa el directorio añadido por teclado
        try{
            DirectoryStream<Path> stream= Files.newDirectoryStream(p);
            for(Path path : stream){
                if(Files.isRegularFile(path) && path.getFileName().toString().charAt(0) == letra){
                    Files.delete(path);
                }
            }

        }catch(IOException e){
            System.out.println("ERROR "+e);
        }
    }
}
