package INICIO.PRACTICA_1;

public class EJ5 {
    public static void main(String[] args){

       // 5. Programa que calcula el área de una circunferencia de radio 5,2 centímetros (π r2 )

        double radio=5.2;

        System.out.println("El Area de la circunferencia es: "+calcularAreaCirculo(radio));



    }
    public static double calcularAreaCirculo(double r) {
        return Math.PI * (r * r);
    }
}
