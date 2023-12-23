package SENTENCIAS_DE_CONTROL_2.PRACTICA_4;
import java.util.*;
public class EJ4 {
    public static void main(String[] args) {

        //4. Programa que lea una hora expresada en segundos transcurridos desde las 12
        //de la noche y la convierta en horas, minutos y segundos o viceversa. Lee una
        //hora como horas, minutos y segundos y la transforma en segundos

        Scanner sc=new Scanner(System.in);

        System.out.println("Dime los segundos transcurridos desde las 12 de la noche: ");
        int segundos=sc.nextInt();

        int s=segundos%60;
        int m= (segundos/60)%60;
        int h= (segundos/60)/60;

        System.out.println("Horas:         "+h);
        System.out.println("Minutos:       "+m);
        System.out.println("Segundos:      "+s);
    }
}
