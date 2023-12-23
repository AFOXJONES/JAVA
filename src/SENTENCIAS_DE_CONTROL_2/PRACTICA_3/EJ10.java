package SENTENCIAS_DE_CONTROL_2.PRACTICA_3;
import java.util.*;
public class EJ10 {
    public static void main(String[] args) {

        //10. Una empresa tiene trabajadores de categorías A, B y C. Todos cobran un salario base. Los
        //de las categorías A y B cobran además un suplemento de 240 euros. En la categoría C, en
        //la sección 1ª están los contratados por días, que cobran un suplemento de 0.5 € por día
        //trabajado y se les descuenta 30 € por baja injustificada. El resto de las secciones de esta
        //categoría cobra 120€ de suplemento. Programa que lee los datos de un trabajador y nos
        //calcula su sueldo final

        Scanner sc = new Scanner(System.in);

        System.out.println("Salario base:");
        double salario = sc.nextDouble();


        String categoria;
        do {
            System.out.println("Selecciona categoria del trabajador (A, B, C):");
            categoria = sc.next();
            categoria=categoria.toUpperCase();
            if(!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C"))
                System.out.println("Has introducido mal la categoria ");
        }
        while (!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C"));

        if(categoria.equals("C")) {
            int seccion;
            do {
                System.out.println("A que seccion pertenece el trabajador?(1, 2, 3):");
                seccion = sc.nextInt();

                if(seccion!=1 &&  seccion!=2 && seccion!=3)
                    System.out.println("Has introducido mal la seccion");
            }
            while (seccion!=1 &&  seccion!=2 && seccion!=3);

            if(seccion==1){
                System.out.println("Dias trabajados por mes: ");
                int dias = sc.nextInt();

                System.out.println("Dias de baja injustificada: ");
                int diasBaja = sc.nextInt();

                salario=(salario+(dias*0.5))-(diasBaja*30);
            }else
                salario+=120;
        }else
            salario+=240;

        System.out.println("El salario del trabajador es de: "+salario+"$");


    }
}
