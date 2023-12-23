package INICIO_1.PRACTICA_2;
import java.util.*;
public class EJ2 {
    public static void main(String[] args) {

        //Programa que dado un importe y un descuento (porcentaje), calcula el importe
        //una vez aplicado el descuento.
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese el importe a pagar: ");
        double importe=sc.nextDouble();

        System.out.print("Ingrese el descuento aplicable: ");
        int descuento=sc.nextInt();

        precioConDescuento(importe,descuento);

    }

    public static void precioConDescuento(double importe, int desc){
        double descuento=desc*importe/100;
        System.out.println("El precio con descuento es de: "+ (importe-descuento));
    }

}
