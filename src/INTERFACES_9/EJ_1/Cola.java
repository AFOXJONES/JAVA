package INTERFACES_9.EJ_1;

public class Cola<T> implements Estructura<T> {
    private java.util.Queue<T> cola = new java.util.LinkedList<>();

    @Override
    public void agregarObjeto(T objeto) {
        cola.offer(objeto);
    }

    @Override
    public T extraerObjeto() {
        if (!cola.isEmpty()) {
            return cola.poll();
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }
}
