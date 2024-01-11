package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.FECHAS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class EJ_2 {
    public static void main(String[] args) {
        // Leer una fecha por teclado y calcular la nueva fecha transcurridos un nº de días anotado por teclado.
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
            String inputFecha = sc.nextLine();

            // Parsear la fecha y validar su formato
            LocalDate fecha1 = LocalDate.parse(inputFecha, dateFormatter);

            System.out.println("Ingrese el número de días a sumar:");
            int diasASumar = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea pendiente después de la entrada del número de días

            // Calcular la nueva fecha sumando los días
            LocalDate nuevaFecha = fecha1.plusDays(diasASumar);

            // Mostrar la nueva fecha
            System.out.println("Nueva fecha después de sumar " + diasASumar + " días: " + dateFormatter.format(nuevaFecha));

        } catch (DateTimeParseException e) {
            System.out.println("Error: Formato de fecha inválido. Inténtelo de nuevo.");
        }
    }
}
