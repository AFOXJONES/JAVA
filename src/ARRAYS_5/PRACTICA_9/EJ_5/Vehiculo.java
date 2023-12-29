package ARRAYS_5.PRACTICA_9.EJ_5;

import java.util.*;

public class Vehiculo {
    private static int vehiculosAlquilados;
    private static int gananciasTotales;
    private int ganancias;
    private String matricula;
    private String modelo;
    private String marca;
    private int anioMatriculacion;
    private categoria miCategoria;
    private boolean alquilado;
    public enum categoria {
        UNO,
        DOS
    }
    public Vehiculo() {

    }

    public Vehiculo(String matricula, String modelo, String marca, int anioMatriculacion, categoria miCategoria) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.anioMatriculacion = anioMatriculacion;
        this.miCategoria = miCategoria;
        this.alquilado = false;
    }

    public int alquilar(int dias, Vehiculo v){
        int importe;
        if(v.getMiCategoria().equals(categoria.UNO)){
            if(dias<=2){
                importe=dias*45;
            }else{
                importe=dias*30;
            }
        }else{
            if(dias<=2){
                importe=dias*50;
            }else{
                importe=dias*40;
            }
        }
        vehiculosAlquilados++;
        ganancias+=importe;
        gananciasTotales+=importe;
        return importe;
    }

    public void devolverVehiculo(Vehiculo v){
        if(v.alquilado){
            v.alquilado=false;
            vehiculosAlquilados--;
            System.out.println("Vehiculo devuelto");
        }else{
            System.err.println("El vehiculo no se puede devolver porqeu no esta alquilado");
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "ganancias=" + ganancias +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", anioMatriculacion=" + anioMatriculacion +
                ", miCategoria=" + miCategoria +
                ", alquilado=" + alquilado +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public categoria getMiCategoria() {
        return miCategoria;
    }

    public void setMiCategoria(categoria miCategoria) {
        this.miCategoria = miCategoria;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public static int getVehiculosAlquilados() {
        return vehiculosAlquilados;
    }

    public int getGanancias() {
        return ganancias;
    }
}
