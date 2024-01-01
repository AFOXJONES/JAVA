package ARRAYS_5.MATRICES.EJ_4;

import java.util.*;

public class Jugador {
    private String nombre;
    private int[][] carton;

    public Jugador(String nombre) {
        this.nombre = nombre;
        int[][] c=new int[4][5];
        for(int i=0;c.length>i;i++){
            for(int j=0;c[0].length>j;j++){
                Random rand = new Random();
                int numeroAleatorio = rand.nextInt(90)+1;
                c[i][j]=numeroAleatorio;
            }
        }
        this.carton=c;
    }


    public void anotarBola(int numero){
        for(int i=0;carton.length>i;i++){
            for(int j=0;carton[0].length>j;j++) {
                if(carton[i][j]==numero){
                    carton[i][j]=0;
                    System.out.println(nombre+" tacha");
                }
            }
        }
    }

    public void hayLinea(){
        for(int i=0;carton.length>i;i++){
            int cont=0;
            for(int j=0;carton[0].length>j;j++) {
                if(carton[i][j]==0){
                    cont++;
                    if(cont==5) {
                        //esto es como hacer un bucle de la longitud de carton[i] y ponerle el valor a cada posicion 101
                        Arrays.fill(carton[i], 101);
                        System.out.println("Hay linea para: "+nombre);
                    }
                    }
                }
            }
    }

    public boolean bingo(){
        int cont=0;
        for(int i=0;carton.length>i;i++) {
            for (int j = 0; carton[0].length > j; j++) {
                if (carton[i][j] == 0 || carton[i][j] ==101) {
                    cont++;
                    if (cont == 20) {
                        System.out.println("GANADOR");
                        System.out.println("Hay bingo para: "+nombre);
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[][] getCarton() {
        return carton;
    }

    public void setCarton(int[][] carton) {
        this.carton = carton;
    }
}
