package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EJ_6 {
    public static void main(String[] args){
        //Voluntario: Hacer el apartado anterior sin la suposición
        // de que sólo habrá archivos, puede haber subdirectorios. (Usad recursión)


        Scanner sc=new Scanner(System.in);

        System.out.println("Escriba la ruta y nombre de la carpeta");
        String r=sc.nextLine();

        Path ruta= Paths.get(r);

        borrar(ruta);


    }
    public static void borrar(Path ruta){
        Scanner sc=new Scanner(System.in);
        try{
            DirectoryStream<Path> stream= Files.newDirectoryStream(ruta);
            Boolean afirmativo=null;
            int opt=0;
            for(Path path: stream){
                if(afirmativo==null){
                    System.out.println("Hay archivos y carpetas en la carpeta "+path.getFileName()+", desea borrarla igualmente?");
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
                    if(Files.isRegularFile(path)) {
                        Files.delete(path);
                    }else{
                        borrar(path);
                        Files.delete(path);
                    }
                }
            }

        }catch(IOException e){

        }
    }
}
