package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.FECHAS;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class EJ_4 {
    public static void main(String[] args) {
        //Simular durante 1 minuto el lanzamiento de un dado, pasado ese tiempo mostrar la cantidad de seises que han salido
        final int TIEMPO_SIMULACION_SEGUNDOS = 3;
        final int CARA_SEIS = 6;

        Random random = new Random();
        long tiempoInicio = System.currentTimeMillis();

        int cantidadSeises = 0;

        while (System.currentTimeMillis() - tiempoInicio < TIEMPO_SIMULACION_SEGUNDOS * 1000) {
            // Simular el lanzamiento de un dado (números del 1 al 6)
            int resultadoDado = random.nextInt(6) + 1;

            // Verificar si el resultado es seis
            if (resultadoDado == CARA_SEIS) {
                cantidadSeises++;
            }
        }

        // Mostrar resultados
        System.out.println("Simulación completada durante 1 minuto.");
        System.out.println("Cantidad de seises obtenidos: " + cantidadSeises);


        //o asi tambien



            Instant inicio = Instant.now();
            Instant fin = inicio.plusSeconds(TIEMPO_SIMULACION_SEGUNDOS);

            while (Instant.now().isBefore(fin)) {
                // Simular el lanzamiento de un dado (números del 1 al 6)
                int resultadoDado = random.nextInt(6) + 1;

                // Verificar si el resultado es seis
                if (resultadoDado == CARA_SEIS) {
                    cantidadSeises++;
                }
            }

            // Mostrar resultados
            Duration duracionSimulacion = Duration.between(inicio, Instant.now());
            System.out.println("Simulación completada durante " + duracionSimulacion.getSeconds() + " segundos.");
            System.out.println("Cantidad de seises obtenidos: " + cantidadSeises);

    }
}
