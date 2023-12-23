package SENTENCIAS_DE_CONTROL_2.PRACTICA_5;

public class EJ19 {
    public static void main(String[] args) {

        //19. Programa que muestra por pantalla los números del 1 al 100 sin mostrar aquellos
        //números que sean múltiplos de 5


        for(int i=0;i<=100;i++){
            if(i%5!=0)
                System.out.print(i+" ");
        }
    }
}
