package SENTENCIAS_DE_CONTROL.PRACTICA_6;
import java.util.*;
public class EJ4 {
    public static void main(String[] args) {

        //4. En un museo se tienen las siguientes tarifas:
        //          Normal      Reducida
        //Adultos   3 euros     2 euros
        //Niños     2 euros     1,2 euros
        //Hacer un programa en el que se simula la compra de entradas en el museo de la siguiente
        //forma:
        //Por cada grupo que llega se anota el número de adultos y el número de niños y si se aplica
        //tarifa reducida o no. Con esta información se calcula el importe total de las entradas de
        //cada grupo y se muestra por pantalla. El programa termina cuando se hayan recaudado
        //más de 100 euros.
        //Mostrar al final el número de entradas del grupo que más entradas ha comprado.

        Scanner sc=new Scanner(System.in);


        final int adultoNormal=3;
        final int adultoReducida=2;
        final int ninioNormal=2;
        final double ninioReducida=1.2;

        List<Double> precioGrupos=new ArrayList<>();
        List<Integer> numeroEntradas=new ArrayList<>();


        int adultos=0;
        int ninios=0;
        double precioTotal=0;
        do{
            System.out.println("NUEVO GRUPO");

            System.out.println("Numero de adultos: ");
            adultos=sc.nextInt();
            System.out.println("Numero de niños: ");
            ninios=sc.nextInt();

            int tipoTarifa=0;
            do {
                System.out.print("Tipo de tarifa: Normal(pulse 1) Reducida(pulse 2): ");
                tipoTarifa=sc.nextInt();
            }while(tipoTarifa!=1 && tipoTarifa!=2);

            switch(tipoTarifa){
                case 1:
                    precioTotal=(adultos*adultoNormal)+(ninios*ninioNormal);
                    break;
                case 2:
                    precioTotal=(adultos*adultoReducida)+(ninios*ninioReducida);
                    break;
                default:
                    break;
            }
            System.out.println("El precio total de las entradas es de: "+precioTotal);
            precioGrupos.add(precioTotal);
            numeroEntradas.add(adultos+ninios);

        }while(precioGrupos.stream().mapToDouble(i -> i).sum()<=100);//Para sumar todos los campos de la Lista con lambda

        int mayor=0;
        double precio=0;
        for(int i=0;numeroEntradas.size()>i;i++){
            if(numeroEntradas.get(i)>mayor) {
                mayor = numeroEntradas.get(i);
                precio=precioGrupos.get(i);
            }
        }

        System.out.println("Numero de entradas del grupo con mas entradas compradas: "+mayor);
        System.out.println("Con un precio total de: "+precio);

    }
}
