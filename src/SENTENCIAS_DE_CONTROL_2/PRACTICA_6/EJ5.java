package SENTENCIAS_DE_CONTROL_2.PRACTICA_6;
import java.util.*;
public class EJ5 {
    public static void main(String[] args) {

        //5. En unos multicinesse están proyectando dos películas en dos salas distintas. Cada persona
        //que llega compra varias entradas para la misma película. Realizar un programa en el que se
        //anota por cada persona que llega a la taquilla el número de sala y el número de entradas
        //que compra para esa sala, el programa finaliza al anotar la sala 0. Mostrar el número total
        //de entradas vendidas y decir para que sala se han vendido más entradas. Decir además si
        //ha habido alguien que haya comprado más de 10 entradas.

        Scanner scanner = new Scanner(System.in);
        int totalEntradasVendidas = 0;
        int salaConMasEntradas = 0;
        int maxEntradas = 0;
        boolean alguienComproMasDe10Entradas = false;

        while (true) {
            System.out.print("Ingrese el número de sala (0 para finalizar): ");
            int numeroSala = scanner.nextInt();

            if (numeroSala == 0) {
                break;
            }

            System.out.print("Ingrese el número de entradas compradas: ");
            int numeroEntradas = scanner.nextInt();

            totalEntradasVendidas += numeroEntradas;

            if (numeroEntradas > maxEntradas) {
                maxEntradas = numeroEntradas;
                salaConMasEntradas = numeroSala;
            }

            if (numeroEntradas > 10) {
                alguienComproMasDe10Entradas = true;
            }
        }

        System.out.println("Número total de entradas vendidas: " + totalEntradasVendidas);
        if (salaConMasEntradas > 0) {
            System.out.println("La sala con más entradas vendidas es la sala " + salaConMasEntradas);
        }

        if (alguienComproMasDe10Entradas) {
            System.out.println("Alguien compró más de 10 entradas.");
        } else {
            System.out.println("Nadie compró más de 10 entradas.");
        }
    }
}
