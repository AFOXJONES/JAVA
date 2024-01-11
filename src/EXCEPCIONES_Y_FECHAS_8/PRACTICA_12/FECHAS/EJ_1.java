package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.FECHAS;

import java.time.format.DateTimeParseException;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
public class EJ_1 {
    public static void main(String[] args) {
        // Lee tres fechas de teclado (comprobando usando excepciones que son correctas) y ordénalas de menor a mayor.

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate[] fechas = new LocalDate[3];

        // Leer tres fechas del teclado
        for (int i = 0; i < 3; i++) {
            boolean fechaValida = false;

            while (!fechaValida) {
                try {
                    System.out.println("Ingrese la fecha " + (i + 1) + " en formato dd/MM/yyyy:");
                    String inputFecha = scanner.nextLine();

                    // Parsear la fecha y validar su formato
                    LocalDate fecha = LocalDate.parse(inputFecha, dateFormatter);
                    fechaValida = true;

                    // Almacenar la fecha en el array
                    fechas[i] = fecha;

                } catch (DateTimeParseException e) {
                    System.out.println("Error: Formato de fecha inválido. Inténtelo de nuevo.");
                }
            }
        }

        // Ordenar las fechas de menor a mayor
        Arrays.sort(fechas);

        // Mostrar las fechas ordenadas
        System.out.println("Fechas ordenadas de menor a mayor:");
        for (LocalDate fecha : fechas) {
            System.out.println(dateFormatter.format(fecha));
        }

        scanner.close();
    }

}
