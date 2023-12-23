package INICIO_1.PRACTICA_2;
import java.util.*;
public class EJ5 {
    public static void main(String[] args) {

        // Programa que lee el precio de tarifa de un producto y el precio final pagado por
        //el mismo y nos calcula el descuento (%) realizado


        Scanner sc=new Scanner(System.in);

        System.out.print("Precio real: ");
        double tarifa=sc.nextDouble();

        System.out.print("Total pagado: ");
        double pagado=sc.nextInt();

        calcularDescuento(tarifa,pagado);


    }
    public static void calcularDescuento(double pr,double pp){
        double pd=pr-pp;
        System.out.println("El descuento ha sido de: "+(pd*100/pr)+"%");
    }
}
