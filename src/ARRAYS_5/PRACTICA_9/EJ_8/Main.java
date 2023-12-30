package ARRAYS_5.PRACTICA_9.EJ_8;

import java.util.*;
public class Main {
    private static final int MAX_ALUMNOS = 25;
    private static Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
    private static int numAlumnos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Matricular un alumno");
            System.out.println("2. Poner las notas de una asignatura");
            System.out.println("3. Mostrar un listado de toda la clase ordenado por nota media");
            System.out.println("4. Mostrar un listado de toda la clase ordenado alfabéticamente");
            System.out.println("5. Mostrar las notas de un alumno");
            System.out.println("6. Anular matrícula");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    matricularAlumno(scanner);
                    break;
                case 2:
                    ponerNotasAsignatura(scanner);
                    break;
                case 3:
                    mostrarListadoPorNotaMedia();
                    break;
                case 4:
                    mostrarListadoOrdenAlfabetico();
                    break;
                case 5:
                    mostrarNotasDeAlumno(scanner);
                    break;
                case 6:
                    anularMatricula(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void matricularAlumno(Scanner scanner) {
        if (numAlumnos < MAX_ALUMNOS) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del alumno: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese el teléfono del alumno: ");
            String telefono = scanner.nextLine();
            System.out.print("Ingrese el DNI del alumno: ");
            String dni = scanner.nextLine();

            Alumno nuevoAlumno = new Alumno(nombre, apellido, telefono, dni);
            alumnos[numAlumnos++] = nuevoAlumno;

            System.out.println("Alumno matriculado con éxito.");
        } else {
            System.out.println("La clase está llena. No se pueden matricular más alumnos.");
        }
    }

    private static void ponerNotasAsignatura(Scanner scanner) {
        System.out.println("Ingrese las notas de la asignatura para toda la clase:");
        int[] notas = new int[3]; // Asumiendo 3 notas para la primera evaluación

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Notas para " + alumnos[i].getNombre() + " " + alumnos[i].getApellido() + ":");
            for (int j = 0; j < notas.length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consumir el salto de línea después de leer el número
            alumnos[i].setNotas(notas);
        }

        System.out.println("Notas asignadas con éxito.");
    }

    private static void mostrarListadoPorNotaMedia() {
        Arrays.sort(alumnos);
        System.out.println("Listado de toda la clase ordenado por nota media:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido() + ": " + alumno.calcularNotaMedia());
        }
    }

    private static void mostrarListadoOrdenAlfabetico() {
        Arrays.sort(alumnos, Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getApellido));
        System.out.println("Listado de toda la clase ordenado alfabéticamente:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        }
    }

    private static void mostrarNotasDeAlumno(Scanner scanner) {
        System.out.print("Ingrese el DNI del alumno: ");
        String dniBusqueda = scanner.nextLine();
        boolean encontrado = false;

        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dniBusqueda)) {
                System.out.println("Notas de " + alumno.getNombre() + " " + alumno.getApellido() + ":");
                for (int nota : alumno.getNotas()) {
                    System.out.println("Nota: " + nota);
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void anularMatricula(Scanner scanner) {
        System.out.print("Ingrese el DNI del alumno: ");
        String dniBusqueda = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < numAlumnos; i++) {
            if (alumnos[i].getDni().equals(dniBusqueda)) {
                System.out.println("Matrícula anulada para " + alumnos[i].getNombre() + " " + alumnos[i].getApellido());
                // Mover los alumnos restantes para llenar el espacio
                for (int j = i; j < numAlumnos - 1; j++) {
                    alumnos[j] = alumnos[j + 1];
                }
                numAlumnos--;
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }
    }
}
