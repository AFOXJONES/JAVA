package VECTORES_7.PRACTICA_11.EJ_3;

public class Cliente {

    private String nombre;
    private String pelicula;
    private int numentradas;

    public Cliente() {
    }

    public Cliente(String nombre, String pelicula, int numentradas) {
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.numentradas = numentradas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getNumentradas() {
        return numentradas;
    }

    public void setNumentradas(int numentradas) {
        this.numentradas = numentradas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", pelicula='" + pelicula + '\'' +
                ", numentradas=" + numentradas +
                '}';
    }
}
