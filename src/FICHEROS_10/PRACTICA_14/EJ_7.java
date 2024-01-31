package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class EJ_7 {
    public static void main(String[] args){
        //Programa que cuenta los caracteres de un archivo


        String rutaArchivo = "C://Users//PortatilMsi//Desktop//PRUEBAS_FICHEROS//aqui.txt";



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

        long cantidadCaracteres = contenido.length();
        System.out.println(cantidadCaracteres);
    }
}
