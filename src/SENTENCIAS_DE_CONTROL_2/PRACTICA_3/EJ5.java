package SENTENCIAS_DE_CONTROL_2.PRACTICA_3;
import java.util.*;
public class EJ5 {
    public static void main(String[] args) {

        //5. Diseñar un programa que calcule el precio de un billete de ida y vuelta por avión,
        //conociendo la distancia a recorrer, el número de días de estancia y sabiendo que si la
        //distancia es superior a 1.000 Km. y el número de días de estancia es superior a 7, la línea
        //aérea le hace un descuento del 30 %. (Precio por kilómetro = 0,05€.).

        Scanner sc=new Scanner(System.in);

        System.out.print("Distancia a recorrer en km: ");
        double km=sc.nextDouble();

        System.out.print("Dias de estancia: ");
        int dias=sc.nextInt();

        System.out.println("EL precio del billete es de: " +calcularPrecioVuelo(km,dias));

    }

    public static double calcularPrecioVuelo(double km, int days){
        if(km>1000 & days>7)
            return (km*0.05)*0.7;
        return km*0.05;
    }
}
