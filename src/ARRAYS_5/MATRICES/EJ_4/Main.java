package ARRAYS_5.MATRICES.EJ_4;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //BINGO
        //Crear un programa que simule el juego de la lotería de la siguiente forma:
        // Se escoge un número de jugadores (máximo 10),
        // para cada uno de ellos se genera un cartón que tiene 4 líneas,
        // cada línea tiene 5 números : 1..20,21..40,41..60,61..80.
        //Se van sacando bolas una a una, se muestra en pantalla el nombre del primer jugador que consigue línea,
        // el juego termina cuando un jugador rellena todo el cartón.
        //Crear una clase Jugador que contenga al menos como datos: nombre,
        // cartón (matriz de de 4x5) y los siguientes métodos:
        //a) Constructor: recibe el nombre del jugador y genera la matriz usando números aleatorios.
        //b) Anota bola: Se le pasa el número de la bola extraída y “tacha” dicho número del cartón.
        //c) Hay línea: Devuelve si han sido tachados todos los números de una línea.
        //d) Hay bingo: Devuelve si han sido tachados todos los números del cartón.
        //e) Crear una clase con un main que simule el juego anterior usando la clase Jugador.


        Random r=new Random();

        Jugador[] jugadores={new Jugador("Álvaro"),new Jugador("Manu")};

        boolean ganador=false;
        int numerosSacados=0;
        do {
            int numeroAleatorio = r.nextInt(90) + 1;
            numerosSacados++;
            for(Jugador jugador:jugadores){
                jugador.anotarBola(numeroAleatorio);
                jugador.hayLinea();
                if(jugador.bingo()){
                    ganador=true;
                    break;
                }
            }

        }while(!ganador);

        System.out.println("Numeros sacados hasta ganar: "+numerosSacados);


    }
}
