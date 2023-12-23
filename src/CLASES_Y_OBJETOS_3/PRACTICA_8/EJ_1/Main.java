package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_1;

public class Main {

    //La agencia espacial europea guarda para cada satélite la distancia de la tierra a la que se encuentra así como el meridano y el paralelo en los que orbita. Diseñar una clase que nos permita:
    // Saber si un satélite está en órbita
    // Variar la altura de un satélite (distancia a la tierra)
    // Variar su posición (varían el meridiano y el paralelo)
    //Generar satélites en la clase main para comprobar que la clase satélite funciona
    public static void main(String[] args){
        // Crear instancias de satélite para comprobar la funcionalidad
        Satelite satelite1 = new Satelite(1000, 30, 45);
        Satelite satelite2 = new Satelite(1500, 60, 75);

        // Verificar si los satélites están en órbita
        System.out.println("Satélite 1 en órbita: " + satelite1.estaEnOrbita());
        System.out.println("Satélite 2 en órbita: " + satelite2.estaEnOrbita());

        // Variar la altura y posición de los satélites
        satelite1.variarAltura(1200);
        satelite2.variarPosicion(75, 90);

        // Mostrar la nueva información de los satélites
        System.out.println("Nueva altura del Satélite 1: " + satelite1.getDistanciaTierra());
        System.out.println("Nueva posición del Satélite 2: (" + satelite2.getMeridiano() + ", " + satelite2.getParalelo() + ")");

    }
}
