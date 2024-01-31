package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class EJ_8 {
    public static void main(String[] args){
        //Programa que lee un archivo y cuenta las veces que se repite una letra anotada desde teclado.

        String rutaArchivo = "C://Users//PortatilMsi//Desktop//PRUEBAS_FICHEROS//aqui.txt";


        Scanner sc=new Scanner(System.in);

        System.out.println("Letra a comprobar:");
        char letra=sc.next().toLowerCase().charAt(0);

        Path path = Paths.get(rutaArchivo);

        // Lee todas las líneas del archivo y concatena los caracteres
        List<String> lineas = null;
        try {
            lineas = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuilder contenido = new StringBuilder();
        lineas.forEach(contenido::append);

        int contador=0;
        for (int i = 0; i < contenido.length(); i++) {
            if (Character.toLowerCase(contenido.charAt(i))== letra) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
