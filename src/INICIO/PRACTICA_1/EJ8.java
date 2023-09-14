package INICIO.PRACTICA_1;

public class EJ8 {
    public static void main(String[] args){
        //8. Programa que dada una variable t que contiene un tiempo en segundos, nos
        //muestre dicho tiempo expresado en horas, minutos y segundos

        tiempoEquivalente(2356345);
    }
    public static void tiempoEquivalente(int tiempo){
        int horas,minutos,segundos;
        int minutostotales=tiempo/60;
        horas=minutostotales/60;
        minutos=minutostotales%60;
        segundos=tiempo%60;
        System.out.println(horas+" horas, "+minutos+" minutos, "+segundos+" segundos");

    }
}
