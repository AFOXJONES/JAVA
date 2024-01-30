package INTERFACES_9.EJ_1;

public class Main {
    public static void main(String[] args){
        //Hacer un interface que contenta un método para añadir un objeto y otro para extraerlo.
        // Codificar dos clases: Pila y Cola que implementen dicho interface teniendo en cuenta
        // donde se añaden y extraen objetos de estos tipos de estructuras de datos.
        //hacer un main para probar ambas clases.


        // Prueba de la Pila
        Pila<String> pila = new Pila<>();
        pila.agregarObjeto("Objeto 1");
        pila.agregarObjeto("Objeto 2");

        System.out.println("Objeto extraído de la pila: " + pila.extraerObjeto());
        System.out.println("Objeto extraído de la pila: " + pila.extraerObjeto());

        // Prueba de la Cola
        Cola<Integer> cola = new Cola<>();
        cola.agregarObjeto(1);
        cola.agregarObjeto(2);

        System.out.println("Objeto extraído de la cola: " + cola.extraerObjeto());
        System.out.println("Objeto extraído de la cola: " + cola.extraerObjeto());
    }
}
