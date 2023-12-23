package INICIO_1.PRACTICA_1;

public class EJ4 {
    public static void main(String[] args){
        //4. Programa que calcula la longitud de una circunferencia de radio 3 metros (2πr)

        double radio = 3.0; // Radio de la circunferencia en metros
        double longitud = 2 * Math.PI * radio;
        System.out.format("La longitud de la circunferencia es: %.3f metros",longitud);
    }
}
