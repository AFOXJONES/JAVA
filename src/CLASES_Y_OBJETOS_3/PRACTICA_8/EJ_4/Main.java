package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_4;

import java.util.Scanner;

public class Main {
    //Un repartidor está identificado de forma única por un número. Por cada pedido realizado gana el 20% del importe de
    // dicho pedido más propinas. Codificar un método: realizar_pedido, otro que nos informe del número total de pedidos
    // realizados por todos los repartidores y otro que nos muestre las ganancias de un repartidor hasta el momento.
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        Repartidor EORTPE1=new Repartidor(1);
        Repartidor DGUTBER1=new Repartidor(2);
        Repartidor MSANMON1=new Repartidor(3);

        double precio = 0;
        double propina = 0;

        System.out.println("Hola buenas tardes, bienvenido a PizzaFox. Que desea?");
        System.out.println("1.Pizza Margarita(14.99€)");
        System.out.println("2.Pizza Peperoni(11.99€)");
        System.out.println("3.Pizza Barbacoa(13.49€)");
        int opt=sc.nextInt();

        switch(opt){
            case(1):
                precio=14.99;
                break;
            case(2):
                precio=11.99;
                break;
            case(3):
                precio=13.49;
                break;
            default:
                break;
        }



        System.out.println("Desea depositar propina?");
        System.out.println("1.SI");
        System.out.println("2.NO");
        opt=sc.nextInt();

        switch(opt){
            case(1):
                System.out.println("Introduzca el importe de propina deseado: ");
                propina=sc.nextDouble();
                break;
            default:
                break;
        }

        System.out.println("Elija al repartidor");
        System.out.println("1.EORTPE1");
        System.out.println("2.DGUTBER1");
        System.out.println("2.MSANMON1");
        opt=sc.nextInt();

        switch(opt){
            case(1):
                EORTPE1.realizarPedido(precio,propina);
                break;
            case(2):
                DGUTBER1.realizarPedido(precio,propina);
                break;
            case(3):
                MSANMON1.realizarPedido(precio,propina);
                break;
            default:
                break;
        }


        System.out.println("Muchas gracias por pedir en PizzaFox");
        System.out.println(EORTPE1.getGananciasTotales());
        System.out.println(DGUTBER1.getGananciasTotales());
        System.out.println(MSANMON1.getGananciasTotales());
        System.out.println(Repartidor.getGanaciasEmpresa());

    }
}
