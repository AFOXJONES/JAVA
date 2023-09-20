package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.*;

public class EJ9 {
    public static void main(String[] args) {

        //9. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la
        //cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más
        //de 1.75.

        Scanner sc = new Scanner(System.in);


        int cont=0;
        int contMayores=0;
        int contAltos=0;
        int edad;
        double estatura;
        double edadMedia=0;
        double estaturaMedia=0;
        do {
            System.out.println("Inserta la edad del alumno: ");
            edad = sc.nextInt();

            if(edad>=18)
                contMayores++;

            System.out.println("Inserta la estatura del alumno: ");
            estatura = sc.nextDouble();

            if(estatura>1.75)
                contAltos++;

            edadMedia+= edad;
            estaturaMedia+=estatura;
            cont++;
        } while (cont<5);

        System.out.println("Edad media: "+edadMedia/cont+" Estatura media: "+estaturaMedia/cont);
        System.out.println("Alumnos mayores de 18 años: "+contMayores+" Alumnos mas altos de 1.75: "+contAltos);
    }
}
