package SENTENCIAS_DE_CONTROL.PRACTICA_6;

import java.util.*;

public class EJ3 {
    public static void main(String[] args) {
        //3. En una empresa de fruta se seleccionan fresas en 3 categorías dependiendo de su calibre:
        //A (de 1 a 3 cm), B (de 3 a 5 cm), C(más de 5). Ir anotando el grosor de cada fresa hasta
        //anotar 0. Decir cuántas hay de cada categoría y si no ha habido fresas de alguna categoría

        Scanner sc = new Scanner(System.in);

        List<Double> fresas = new ArrayList<>();

        double num;
        do {
            System.out.print("Introduzca grosor de la fresa: ");
            num = sc.nextDouble();
            fresas.add(num);
        } while (num != 0);

        int A = 0,B=0,C=0;
        for(int i=0;fresas.size()>i;i++){
            if(fresas.get(i)>=1 && fresas.get(i)<3)
                A++;
            if(fresas.get(i)>=3 && fresas.get(i)<5)
                B++;
            if(fresas.get(i)>=5)
                C++;
        }

        System.out.println("FRESAS DE CATEGORIA A: "+A);
        System.out.println("FRESAS DE CATEGORIA B: "+B);
        System.out.println("FRESAS DE CATEGORIA C: "+C);
    }
}
