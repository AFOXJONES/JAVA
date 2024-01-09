package VECTORES_7.PRACTICA_11.EJ_4;

public class Main {
    public static void main(String[] args){
        //Crear una clase Pila como subclase de la clase Vector. Tiene que contener los
        //siguientes métodos:
        //- Añadir un elemento, siempre al final.
        //- Borrar un elemento, el último introducido.
        //- Método que nos retorne el último elemento introducido sin borrarlo.
        //- Método que nos diga si la pila está vacía.
        //Probarla, con un programa que use una pila de char,
        // con un menú que nos permita hacer todas las operaciones anteriores.
        Pila pila = new Pila();


        pila.agregarElemento('A');
        pila.agregarElemento('B');
        pila.agregarElemento('C');

        System.out.println("Último elemento introducido: " + pila.obtenerUltimoElemento());

        pila.borrarElemento();

        System.out.println("¿La pila está vacía? " + pila.estaVacia());
        pila.borrarElemento();
        pila.borrarElemento();
        System.out.println("¿La pila está vacía? " + pila.estaVacia());
    }
}
