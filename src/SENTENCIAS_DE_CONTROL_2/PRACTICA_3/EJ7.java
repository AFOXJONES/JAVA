package SENTENCIAS_DE_CONTROL_2.PRACTICA_3;
import java.util.*;

public class EJ7 {
    public static void main(String[] args) {

        //7. Con objeto de fomentar el ahorro energético, el recibo de la electricidad se elabora de
        //forma que el precio de cada Kw/h consumido es más caro cuanto más se consume:

        // 2€ de gastos fijos
        // 0,50€/Kwh para los primeros 100 Kwh
        // 0,70€/Khw para los siguientes 150 Kwh
        // 1€/Kwh para el resto

        //Elabora un programa que lee de teclado los dos últimos valores del contador (lo que marca
        //actualmente y lo que marcaba en la última lectura), y calcula e imprime en pantalla el importe
        //total a pagar.
        double precioFinal=2;
        Scanner sc=new Scanner(System.in);

        System.out.print("Kwh consumidos: ");
        int Kwh=sc.nextInt();

        int diferencia;
        if(Kwh>250){
            diferencia=Kwh-250;
            Kwh=250;
            precioFinal=precioFinal+(diferencia*1);
        }
        if(Kwh>100){
            diferencia=Kwh-100;
            Kwh=100;
            precioFinal=precioFinal+(diferencia*0.70);
        }
        if(Kwh<=100){
            precioFinal=precioFinal+(Kwh*0.50);
        }

        System.out.println("El precio total a pagar es de: "+precioFinal);


    }
}
