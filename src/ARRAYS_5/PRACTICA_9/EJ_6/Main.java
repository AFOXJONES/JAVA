package ARRAYS_5.PRACTICA_9.EJ_6;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //Una empresa se dedica al alquiler de plazas de garaje. De cada uno de ellos guarda
        //el número que lo identifica, los metros cuadrados, la planta en la que está y el
        //precio de alquiler. El alquiler es de 18€ más
        //• 3€ si está en la 1ª planta
        //• 1,50€ si está en la 2ª
        //• 1 si está en una planta inferior
        //Si el garaje tiene más de 4m2 pagará 1,5€ más sobre el precio anterior y si tiene
        //menos de 3m2 el precio disminuirá en 1€.
        //Programa que crea un array con 5 garajes, con un menú en el que aparezcan las
        //siguientes opciones:
        //- Alquilar un garaje: se pide el número y se busca en el array. Si no existe se
        //indica, si está alquilado se indica. Si está libre se procede a alquilarlo. Todos los
        //garajes se alquilan por un período de un año.
        //- Mostrar el precio de alquiler de un garaje: se pide su número
        //- Mostrar la información de los garajes que estén libres
        //- Subir el precio de un garaje: se pide por teclado un porcentaje y se aumenta el
        //precio de un garaje, sólo si está libre.
        //- Mostrar los beneficios de la empresa.


        Scanner sc=new Scanner(System.in);

        Garaje garajes[]= {new Garaje(1,7,1),new Garaje(2,2,2)};
        int opt;
        do {
            System.out.println("QUE DESA HACER:");
            System.out.println("1.Alquilar un garaje");
            System.out.println("2.Mostrar el precio de alquiler de un garaje");
            System.out.println("3.Mostrar la información de los garajes que estén libres");
            System.out.println("4.Subir el precio de un garaje");
            System.out.println("5.Mostrar los beneficios de la empresa");
            opt = sc.nextInt();
            if (opt != 0) {


                switch (opt) {
                    case 1:
                        System.out.println("Anote el id de garaje:");
                        int id = sc.nextInt();
                        alquilarGaraje(garajes, id);
                        break;
                    case 2:
                        System.out.println("Ingrese el ID del garaje para mostrar el precio de alquiler:");
                        int idMostrarPrecio = sc.nextInt();
                        mostrarPrecio(garajes, idMostrarPrecio);
                        break;
                    case 3:
                        mostrarGarajesLibres(garajes);
                        break;
                    case 4:
                        System.out.println("Ingrese el ID del garaje para subir el precio:");
                        int idSubirPrecio = sc.nextInt();
                        System.out.println("Ingrese el porcentaje de aumento:");
                        double porcentajeAumento = sc.nextDouble();
                        subirPrecio(garajes, idSubirPrecio, porcentajeAumento);
                        break;
                    case 5:
                        System.out.println("Ganancias totales de la empresa: " + Garaje.getTotalGanaciasEmpresa());
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                        break;
                }

            }
        }while(opt!=0);
    }

    public static void alquilarGaraje(Garaje[] garajes, int id) {
        for (Garaje garaje : garajes) {
            if (garaje.getIdentificacion() == id) {
                garaje.alquilar();
                return;
            }
        }
        System.out.println("No se encontró un garaje con el ID proporcionado.");
    }

    public static void mostrarPrecio(Garaje[] garajes, int id) {
        for (Garaje garaje : garajes) {
            if (garaje.getIdentificacion() == id) {
                System.out.println("El precio de alquiler del garaje es: " + garaje.getPrecio());
                return;
            }
        }
        System.out.println("No se encontró un garaje con el ID proporcionado.");
    }

    public static void mostrarGarajesLibres(Garaje[] garajes) {
        for (Garaje garaje : garajes) {
            if (!garaje.isAlquilado()) {
                System.out.println(garaje);
            }
        }
    }

    public static void subirPrecio(Garaje[] garajes, int id, double porcentajeAumento) {
        for (Garaje garaje : garajes) {
            if (garaje.getIdentificacion() == id && !garaje.isAlquilado()) {
                garaje.subirPrecio(porcentajeAumento);
                return;
            }
        }
        System.out.println("No se encontró un garaje con el ID proporcionado o el garaje está alquilado.");
    }
}
