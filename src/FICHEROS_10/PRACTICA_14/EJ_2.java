package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.util.*;
import java.nio.file.*;

public class EJ_2 {
    public static void main(String[] args){
       // Programa que lee la ruta y el nombre de dos ficheros y copia
        // el primero en el segundo. Si el segundo existe pide confirmación.

        Scanner sc=new Scanner(System.in);

        System.out.println("Escriba la ruta y nombre del fichero que quieras copiar");
        String ruta1=sc.nextLine();

        System.out.println("Escriba la ruta y nombre del fichero que quieras reemplazar por el primero");
        String ruta2=sc.nextLine();

        Path primeraRuta=Paths.get(ruta1);

        Path segundaRuta=Paths.get(ruta2);

        if(Files.exists(segundaRuta)){
            System.out.println("El segundo archivo existe, seguro que desea copiarlo?");
            System.out.println("1.Si");
            System.out.println("2.No");
            int opt=sc.nextInt();
            if(opt==1){
                try {
                    //PAra poder reemplazar
                    Files.copy(primeraRuta,segundaRuta,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else{
                System.out.println("Copia no autorizada");
            }
        }else{
            try {
                Files.copy(primeraRuta,segundaRuta);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
