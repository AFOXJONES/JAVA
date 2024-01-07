package HERENCIA_6.PRACTICA_10.EJ_5;

public abstract class Poligono {
    private int numeroLados;

    public Poligono() {
    }

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
}
