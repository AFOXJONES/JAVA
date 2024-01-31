package FICHEROS_10.PRACTICA_14;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class EJ_10 {
    public static void main(String[] args){
        //Dado un fichero de texto (creado con cualquier editor de texto plano),
        // crear otro fichero en el que se han eliminado las vocales.

        Path fichero= Paths.get("C:\\Users\\PortatilMsi\\Desktop\\PRUEBAS_FICHEROS//aqui.txt");

        String rutaNueva=fichero.getParent().toString()+"//CopiaSinVocales_"+fichero.getFileName().toString();

        try {
           Files.createFile(Paths.get(rutaNueva));
            Files.copy(fichero,Paths.get(rutaNueva),StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            List<String> lista=Files.readAllLines(Paths.get(rutaNueva));

            lista=lista.stream()
                    .map(linea -> linea.replaceAll("[aeiouAEIOU]", ""))
                    .collect(Collectors.toList());

            Files.write(Paths.get(rutaNueva),lista);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
