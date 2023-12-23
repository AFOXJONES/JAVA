package SENTENCIAS_DE_CONTROL_2.PRACTICA_3;
import java.util.*;
public class EJ6 {
    public static void main(String[] args) {

        //6. En un determinado comercio se realiza un descuento dependiendo del precio de cada
        //producto. Si el precio es inferior a 6 euros, no se hace descuento; si es mayor o igual que 6
        //euros y menor que 60 euros, se hace un 5% de descuento, y si es mayor o igual que
        //60euros, se hace un 10 % de descuento. Programa que lee el precio de un producto y nos
        //calcula y escribe su precio final.

        Scanner sc=new Scanner(System.in);

        System.out.print("Precio del producto: ");
        double precio=sc.nextDouble();

        if (precio >= 6 & precio < 60) {
            precio = precio * 0.95;
            System.out.println("El precio del producto final es de " + precio + " con un 5% de descuento");
        } else if (precio >= 60) {
            precio = precio * 0.90;
            System.out.println("El precio del producto final es de " + precio + " con un 10% de descuento");
        } else {
            System.out.println("El precio del producto final es de " + precio + " sin descuento");
        }




    }
}
