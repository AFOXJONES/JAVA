package HERENCIA_6.PRACTICA_10.EJ_1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //En una librería se guarda por cada libro: titulo, autor, editorial y precio.
        // Hay libros normales y de texto. Estos tienen como información adicional el curso al que corresponden
        // y además se les aplica un descuento entre el 0 y el 20%.
        //Programa con un menú con las siguientes opciones:
        //1. Dar de alta libros en un array .
        //2. Listar todos los libros mostrando la información de cada uno.
        //3. Listar los libros que tienen un precio de salida menor que un precio introducido por teclado.

        Scanner sc=new Scanner(System.in);

        Libro[] libros={new LibroDeTexto("Conocimiento del medio","PEPE","MAXI",10.99,"SEGUNDO DE PRIMARIA",10),
                new Libro("Viven","Piers Paul Read","MAXI",14.99),
                new LibroDeTexto("Git & Github","BraisMoure","programingBook",13,"Programacion y Más",20)};


        for(Libro libro:libros){
            System.out.println(libro.toString());
        }

        // Solicitar el precio de referencia al usuario
        System.out.print("Introduce el precio de referencia: ");
        double precioReferencia = sc.nextDouble();

        System.out.println("Libros con precio menor que " + precioReferencia + ":");
        for (Libro libro : libros) {
            if (libro instanceof LibroDeTexto) {
                LibroDeTexto libroDeTexto = (LibroDeTexto) libro;
                if (libroDeTexto.getPrecio() < precioReferencia) {
                    System.out.println(libroDeTexto.toString());
                }
            } else {
                if (libro.getPrecio() < precioReferencia) {
                    System.out.println(libro.toString());
                }
            }
        }
    }
}

