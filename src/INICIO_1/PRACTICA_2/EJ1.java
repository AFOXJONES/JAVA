package INICIO_1.PRACTICA_2;
import java.util.*;
public class EJ1 {

    public static void main(String[] args) {

        //Programa que lee dos números, calculando y escribiendo el valor de la suma, la
        //resta, el producto, y su módulo

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        calcularValores(numero1,numero2);

    }
    public static void calcularValores(double num1, double num2){
        double suma,resta,producto,modulo;
        suma=num1+num2;
        resta=num1-num2;
        producto=num1*num2;
        modulo=num1%num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Módulo: " + modulo);
    }
}