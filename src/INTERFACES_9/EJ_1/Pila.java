package INTERFACES_9.EJ_1;

public class Pila<T> implements Estructura<T> {
    private java.util.Stack<T> pila = new java.util.Stack<>();

    @Override
    public void agregarObjeto(T objeto) {
        pila.push(objeto);
    }

    @Override
    public T extraerObjeto() {
        if (!pila.isEmpty()) {
            return pila.pop();
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }
}
