package VECTORES_7.PRACTICA_11.EJ_3;
import java.util.*;
public class Sala {
    private int numbutacas=40;
    private double totalRecaudado;
    public static final double precio=10;
    private String pelicula;

    public Sala() {
    }

    public Sala(String pelicula) {
        this.pelicula = pelicula;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public int getNumbutacas() {
        return numbutacas;
    }

    public void setNumbutacas(int numbutacas) {
        this.numbutacas = numbutacas;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numbutacas=" + numbutacas +
                ", totalRecaudado=" + totalRecaudado +
                ", pelicula='" + pelicula + '\'' +
                '}';
    }
}
