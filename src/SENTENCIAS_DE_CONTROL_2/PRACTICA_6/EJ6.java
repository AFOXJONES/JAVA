package SENTENCIAS_DE_CONTROL_2.PRACTICA_6;
import java.util.*;
public class EJ6 {
    public static void main(String[] args) {

        //6. Calcular el precio de la entrada a un parque de atracciones teniendo en cuenta lo siguiente:
        //Hay dos tarifas, reducida 16 euros (para menores de 7 años y mayores de 65) y normal 25
        //euros (para el resto). Todos los mayores de 18 años pueden sacar además ticket para ver la
        //actuación de un grupo de teatro con un coste adicional de 3 euros.
        //Para realizar el programa mostrar un menú con las opciones
        // Comprar entrada: leer la edad de la persona y en el caso de que sea mayor de
        //edad preguntar si desea ver el teatro
        // Cerrar taquilla:se muestra el importe total recaudado y se acaba el programa

        Scanner sc=new Scanner(System.in);

        int opcion=0;
        boolean activo=true;
        int precioTotal=0;
        while(activo){
            System.out.println("\uF0B7 COMPRAR ENTRADA(1)");
            System.out.println("\uF0B7 CERRAR TAQUILLA(2)");
            opcion=sc.nextInt();

            int edad=0;
            String teatro;
            switch(opcion){
                case 1:
                    System.out.print("Cuantos años tienes: ");
                    edad=sc.nextInt();
                    if(edad>7 && edad<65)
                        precioTotal+=25;
                    else
                        precioTotal+=16;

                    System.out.print("Desea ademas comprar la entrada de 3€ al teatro?(Escribir 'si' si lo desea): ");
                    teatro=sc.next();
                    if(teatro.equalsIgnoreCase("SI"))
                        precioTotal+=3;
                    break;
                case 2:
                    activo=false;
                    System.out.println("Importe total recaudado= "+precioTotal);
                    break;
                default:
                    System.out.println("Esa no es una opcion, intente de nuevo");
                    break;
            }
        }
    }
}
