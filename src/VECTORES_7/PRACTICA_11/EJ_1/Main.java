package VECTORES_7.PRACTICA_11.EJ_1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //Programa que lleve en un vector la información de una serie de alumnos, por cada alumno se guarda su nombre y su nota. Se pide hacer un menú que permita:
        //1. Dar de alta a un alumno, comprobando que no existe previamente en el vector.
        //2. Modificar la nota de un alumno dado.
        //3. Sustituir un alumno por otro anotado por teclado.
        //4. Borrar un alumno dado su nombre.

        Scanner sc=new Scanner(System.in);


// sería igual con ArrayList<Alumno> alumnos=new  ArrayList<Alumno>();
        Vector<Alumno> alumnos=new Vector<Alumno>();

        int opt;
        do {
            System.out.println("QUE DESEA:");
            System.out.println("1. Dar de alta a un alumno");
            System.out.println("2. Modificar la nota de un alumno");
            System.out.println("3. Sustituir un alumno por otro");
            System.out.println("4. Borrar un alumno");
            System.out.println("5. Mostrar alumnos");
             opt= sc.nextInt();
            sc.nextLine();

            String nombre;
            int cont;
            double nota;
            switch (opt) {
                case 1:
                    System.out.println("Nombre del alumno:");
                    nombre = sc.nextLine();
                    System.out.println("Nota del alumno:");
                    nota = sc.nextInt();
                    sc.nextLine();
                    cont = 0;
                    for (Alumno alumno : alumnos) {
                        if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Ese alumno ya existe");
                            cont++;
                        }
                    }
                    if (cont == 0) {
                        alumnos.add(new Alumno(nombre, nota));
                    }
                    break;
                case 2:
                    System.out.println("Nombre del alumno que desea modificar nota:");
                    nombre = sc.nextLine();

                    System.out.println("Nueva nota:");
                    nota = sc.nextInt();
                    sc.nextLine();
                    cont = 0;
                    for (int i = 0; alumnos.size() > i; i++) {
                        if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                            cont++;
                            alumnos.get(i).setNota(nota);
                            System.out.println("Nota modificada");
                        }
                    }
                    if (cont == 0) {
                        System.out.println("No se ha encontrado ningun " + nombre + " en la lista");
                    }

                    break;
                case 3:
                    System.out.println("Nombre del alumno a sustituir:");
                    nombre = sc.nextLine();
                    for (int i = 0; alumnos.size() > i; i++) {
                        if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Nombre del alumno nuevo:");
                            nombre = sc.nextLine();
                            System.out.println("Nota del alumno nuevo:");
                            nota = sc.nextInt();
                            sc.nextLine();
                            alumnos.set(i, new Alumno(nombre, nota));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nombre del alumno a borrar:");
                    nombre = sc.nextLine();
                    for (int i = 0; alumnos.size() > i; i++) {
                        if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                            alumnos.remove(i);
                            System.out.println("Alumno borrado");
                        }
                    }
                    break;
                case 5:
                    for(Alumno alumno:alumnos){
                        System.out.println(alumno.toString());
                    }
                    break;
                default:
                    break;
            }
        }while(opt!=0);
    }

}
