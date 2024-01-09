package VECTORES_7.PRACTICA_11.EJ_4;

import java.util.Vector;

public class Pila extends Vector {


    // Añadir un elemento al final de la pila
    public void agregarElemento(char elemento) {
        add(elemento);
    }

    // Borrar el último elemento introducido
    public void borrarElemento() {
        if (!isEmpty()) {
            remove(size() - 1);
        } else {
            System.out.println("La pila está vacía. No se puede borrar.");
        }
    }

    // Obtener el último elemento introducido sin borrarlo
    public char obtenerUltimoElemento() {
        if (!isEmpty()) {
            return (char) lastElement();
        } else {
            System.out.println("La pila está vacía. No hay elementos para mostrar.");
            return '\0'; // Carácter nulo para indicar que la pila está vacía
        }
    }

    // Verificar si la pila está vacía
    public boolean estaVacia() {
        return isEmpty();
    }
}
