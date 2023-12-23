package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_3;

import java.util.*;


public class Main {
    //Por cada alumno del DAW guardamos su número de matrícula y sus notas en las tres asignaturas.
    // Hacer una clase alumno que guarde está información. Realizar un programa que cree tres alumnos,
    // les asigne notas y a continuación los muestre ordenados de mayor a menor nota media.
    public static void main(String[] args){

        Alumno EORTPE1=new Alumno("12423SDA",7.5,8.2,6.0);
        Alumno ASANME5=new Alumno("14345646PDA",8.8,6.2,5.9);
        Alumno DGUTBER1=new Alumno("6834734OTY",10.0,10.0,10.0);

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(EORTPE1);
        listaAlumnos.add(ASANME5);
        listaAlumnos.add(DGUTBER1);

        Collections.sort(listaAlumnos, Comparator.comparingDouble(Alumno::calcularNotaMedia).reversed());

        // Mostrar la lista ordenada
        System.out.println("Alumnos ordenados por nota media de mayor a menor:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println("Matrícula: " + alumno.getMatricula() + ", Nota Media: " + alumno.calcularNotaMedia());
        }
    }






}
