package INICIO.PRACTICA_1;

public class EJ6 {

    public static void main(String[] args) {
        //6. Programa en el que declaramos las variables edad, estudios, ingresos (decidir cuáL es el tipo de dato más adecuado para cada una) y les damos una valor. Almacenar
        //en una variable booleana jasp el valor:
        //Verdadero si la edad es inferior a 28, el nivel de estudios es mayor que tres y los ingresos superan los 28.000 €
        //Falso en caso contrario
        int edad= 21;
        int estudios=3;
        double ingresos=15200;
        if(isYoungSenior(edad,estudios,ingresos))
            System.out.println("ERES UN AUTENTICO YOUNG SENIOR");
        else
            System.out.println("Todavía te queda trabajar un poco más");
    }
    public static boolean isYoungSenior(int edad,int studies,double ingresos){
        return edad < 28 & studies > 3 & ingresos > 28000;
    }
}
