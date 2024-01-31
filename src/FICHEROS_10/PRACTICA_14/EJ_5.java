package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.*;
public class EJ_5 {
    public static void main(String[] args){
        //Programa que acepta el nombre de una carpeta por teclado y permita borrarla ,
        // tanto si está vacío como si no. Si no está vacío debe pedir confirmación.
        // Dentro del directorio sólo tendremos archivos

        Scanner sc=new Scanner(System.in);

        System.out.println("Escriba la ruta y nombre de la carpeta");
        String r=sc.nextLine();

        Path ruta=Paths.get(r);

        try{
            DirectoryStream<Path> stream= Files.newDirectoryStream(ruta);
            Boolean afirmativo=null;
            int opt=0;
            for(Path path: stream){
                if(afirmativo==null){
                    System.out.println("Hay archivos en la carpeta, desea borrarla igualmente?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    opt=sc.nextInt();
                    if(opt==1){
                        afirmativo=true;

                    }else{
                        afirmativo=false;
                    }
                }
                if(afirmativo){
                    Files.delete(path);
                }
            }

        }catch(IOException e){

        }
    }
}
