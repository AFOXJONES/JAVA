package INICIO_1.PRACTICA_1;

public class EJ7 {
    public static void main(String[] args){
        //7. Programa que dadas dos variables a y b, intercambie sus valores
        int a=5;
        int b=10;
        intercambioValores(a,b);

    }
    public static void intercambioValores(int a,int b){
        int aux=b;
        b=a;
        a=aux;
        System.out.format("El valor de A: %d el valor de B: %d",a,b);
    }
}
