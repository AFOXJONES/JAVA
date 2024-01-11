package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.EXCEPCIONES;
import java.util.*;
public class EJ_1 {
    public static void main(String[] args){
        //Programa que lee números de teclado hasta anotar un 0 y calcula su media.
        // Usa excepciones para que si el usuario se equivoca al introducir
        // un número se muestre un error y se vuelva a pedir.

        ArrayList<Integer> numeros=new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        int num = 0;
        do{

            while(true) {
                System.out.println("Anote numero:");
                try {
                    num = sc.nextInt();
                    if(num==0){
                        break;
                    }
                    numeros.add(num);
                } catch (InputMismatchException e) {
                    System.out.println("Debe insertar un numero, error: " + e);
                }finally{
                    sc.nextLine();
                }
            }
        }while(num!=0);

        double media = 0;
        for(Integer i:numeros){
            media+=i;
        }
        media=media/numeros.size();
        System.out.println("La media de los numeros es: "+media);

    }
}
