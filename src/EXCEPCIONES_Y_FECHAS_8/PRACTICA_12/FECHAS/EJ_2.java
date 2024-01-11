package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.FECHAS;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class EJ_2 {
    public static void main(String[] args){
        //Leer una fecha por teclado y calcular la nueva fecha transcurridos un nº de días anotado por teclado.
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");

        try {
            System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
            String inputFecha = sc.nextLine();

            // Parsear la fecha y validar su formato
            Date fecha1 = formato.parse(inputFecha);


            System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
            inputFecha = sc.nextLine();

            // Parsear la fecha y validar su formato
            Date fecha2 = formato.parse(inputFecha);
        } catch (ParseException e) {
            System.out.println("Error: Formato de fecha inválido. Inténtelo de nuevo.");
        }




    }
}
