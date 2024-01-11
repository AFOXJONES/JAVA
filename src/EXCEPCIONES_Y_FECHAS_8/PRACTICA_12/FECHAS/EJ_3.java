package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.FECHAS;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EJ_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Leer la primera fecha
            System.out.println("Ingrese la primera fecha en formato dd/MM/yyyy:");
            String inputFecha1 = sc.nextLine();
            LocalDate fecha1 = LocalDate.parse(inputFecha1, dateFormatter);

            // Leer la segunda fecha
            System.out.println("Ingrese la segunda fecha en formato dd/MM/yyyy:");
            String inputFecha2 = sc.nextLine();
            LocalDate fecha2 = LocalDate.parse(inputFecha2, dateFormatter);

            // Calcular la diferencia en días
            long diasDiferencia = ChronoUnit.DAYS.between(fecha1, fecha2);

            // Mostrar el resultado
            System.out.println("Diferencia en días entre las dos fechas: " + Math.abs(diasDiferencia));

        } catch (Exception e) {
            System.out.println("Error: Formato de fecha inválido. Inténtelo de nuevo.");
        } finally {
            sc.close();
        }
    }
}
