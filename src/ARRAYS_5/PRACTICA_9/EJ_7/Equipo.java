package ARRAYS_5.PRACTICA_9.EJ_7;

public class Equipo implements Comparable<Equipo>{
    private String nombre;
    private int victorias;
    private int derrotas;
    private int empates;
    private int golesAFavor;
    private int golesEnContra;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int compareTo(Equipo otroEquipo) {
        // Compara por puntos de forma descendente
        return Integer.compare(otroEquipo.puntos, this.puntos);
    }



    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", victorias=" + victorias +
                ", derrotas=" + derrotas +
                ", empates=" + empates +
                ", golesAFavor=" + golesAFavor +
                ", golesEnContra=" + golesEnContra +
                ", puntos=" + puntos +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }




}
