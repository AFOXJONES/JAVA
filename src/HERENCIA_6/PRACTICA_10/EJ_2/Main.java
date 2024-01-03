package HERENCIA_6.PRACTICA_10.EJ_2;

import java.util.*;

public class Main {

    //Una universidad tiene los siguientes tipos de alumnos: los extranjeros, los de curso puente, y el resto.
    // Para todos los alumnos guardamos: nombre, apellidos, curso, e importe de la matricula.
    // los extranjeros pagan el 15% más de tasas y nos interesa saber su país de origen,
    // también nos interesa saber la carrera de procedencia de los alumnos de curso puente.
    // Codificar una jerarquía de clases adecuada.
    // Crear un array con alumnos de distintos tipos
    // y luego mostrar la información de cada uno de ellos llamando al método toString.

public static void main(String[] args){
    Alumno[] alumnos={new Alumno("Pepe","Contreras",3,1300),
            new CursoPuente("Pepe2","Contreras2",3,1300,"Informatica"),
            new Extranjero("Pepe3","Contreras3",3,1300,"Alemania")};

    for(Alumno alumno:alumnos){
        System.out.println(alumno.toString());
    }
}

}

