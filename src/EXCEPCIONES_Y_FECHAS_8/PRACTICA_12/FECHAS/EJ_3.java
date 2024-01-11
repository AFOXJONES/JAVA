package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.FECHAS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EJ_3 {
    public static void main(String[] args){
        //Programa que lee dos fechas y nos dice cuántos días hay entre ellas.

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

            int dias=fecha1-fecha2;
            System.out.println("Dias transcurridos:"+dias);
        } catch (ParseException e) {
            System.out.println("Error: Formato de fecha inválido. Inténtelo de nuevo.");
        }
    }
}
