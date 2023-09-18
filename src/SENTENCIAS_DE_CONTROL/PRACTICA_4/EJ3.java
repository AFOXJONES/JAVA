package SENTENCIAS_DE_CONTROL.PRACTICA_4;
import java.util.*;
public class EJ3 {
    public static void main(String[] args) {

        //3. Programa que lee tres números y permite al usuario elegir si quiere verlos
        //ordenados en forma ascendente o descendente

        Scanner sc = new Scanner(System.in);

        List<Integer> list=new ArrayList<>();

        System.out.println("Escribe el primer numero: ");
        int num1=sc.nextInt();
        list.add(num1);


        System.out.println("Escribe el segundo numero: ");
        int num2=sc.nextInt();
        list.add(num2);

        System.out.println("Escribe el tercero numero: ");
        int num3=sc.nextInt();
        list.add(num3);

        System.out.println("Desea tener los numero ordendos de forma ascendente(pulse 1) o descendente(pulse 2): ");
        int orden=sc.nextInt();

        Collections.sort(list);
        if(orden==1)
            System.out.println("Lista ordenada de forma ascendente: "+list);
        else if(orden==2){
            List<Integer> list2=new ArrayList<>();
            list2.add(list.get(2));
            list2.add(list.get(1));
            list2.add(list.get(0));
            list=list2;
            System.out.println("Lista ordenada de forma descendente: "+list);
        }




    }
}
