package SENTENCIAS_DE_CONTROL.PRACTICA_4;
import java.util.*;
public class EJ6 {
    public static void main(String[] args) {

        //6. Programa que lee una fecha y la valida

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha en formato DD/MM/AAAA: ");
        String fecha = scanner.nextLine();

        if (validarFecha(fecha)) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }

        scanner.close();
    }

    public static boolean validarFecha(String fecha) {
        // Verificamos que la fecha tenga el formato DD/MM/AAAA
        if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        // Separamos el día, el mes y el año
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        // Validamos el rango de los valores
        if (anio < 1 || mes < 1 || mes > 12 || dia < 1 || dia > diasEnMes(mes, anio)) {
            return false;
        }

        return true;
    }

    public static int diasEnMes(int mes, int anio) {
        int[] diasEnMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && esBisiesto(anio)) {
            return 29;
        }

        return diasEnMes[mes];
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
