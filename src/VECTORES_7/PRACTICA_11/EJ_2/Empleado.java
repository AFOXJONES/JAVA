package VECTORES_7.PRACTICA_11.EJ_2;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String dni;
    private String direccion;
    private String tlfn;
    private int horas;
    private double beneficios;

    public Empleado() {
    }

    public Empleado(String nombre, String dni, String direccion, String tlfn) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.tlfn = tlfn;
    }



    public void fichar(){

    }
    public void cobrar(){
        System.out.println("El empleado"+getNombre()+" ha cobrado "+beneficios+"€");
        setBeneficios(0);
        setHoras(0);
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tlfn='" + tlfn + '\'' +
                ", horas=" + horas +
                ", beneficios=" + beneficios +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
}
