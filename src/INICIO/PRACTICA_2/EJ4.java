package INICIO.PRACTICA_2;
import java.util.*;
public class EJ4 {
    public static void main(String[] args) {

        //Programa que calcula el área de un triángulo

        Scanner sc=new Scanner(System.in);

        System.out.print("Base del triangulo: ");
        double base=sc.nextDouble();

        System.out.print("Altura del triangulo: ");
        double altura=sc.nextInt();

        calcularAreaTriangulo(base,altura);

    }
    public static void calcularAreaTriangulo(double base, double altura){
        System.out.println("El area del triangulo es: "+ (base*altura)/2);
    }
}
