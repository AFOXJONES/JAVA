package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {

        //8. Pedir el salario de 10 empleados. Mostrar cuantos ganan más de 1000€.

        Scanner sc = new Scanner(System.in);

        int salario=0;
        int cont=0;
        int salarioMayor=0;
        do {
            System.out.println("Inserta el salario del empleado: ");
            salario = sc.nextInt();
            if(salario>1000)
                salarioMayor++;
            cont++;
        } while (cont<10);

        System.out.println("Numero de empleandos con salario mayor a 100€: "+salarioMayor);
    }
}
