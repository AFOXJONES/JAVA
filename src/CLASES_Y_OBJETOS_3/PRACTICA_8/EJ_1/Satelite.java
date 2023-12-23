package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_1;

public class Satelite {
    // Atributos
    private double distanciaTierra;
    private double meridiano;
    private double paralelo;

    // Constructor
    public Satelite(double distanciaTierra, double meridiano, double paralelo) {
        this.distanciaTierra = distanciaTierra;
        this.meridiano = meridiano;
        this.paralelo = paralelo;
    }

    // Método para verificar si el satélite está en órbita
    public boolean estaEnOrbita() {
        return distanciaTierra > 0; // Si la distancia es mayor que 0, está en órbita.
    }

    // Método para variar la altura del satélite (distancia a la tierra)
    public void variarAltura(double nuevaAltura) {
        this.distanciaTierra = nuevaAltura;
    }

    // Método para variar la posición del satélite (meridiano y paralelo)
    public void variarPosicion(double nuevoMeridiano, double nuevoParalelo) {
        this.meridiano = nuevoMeridiano;
        this.paralelo = nuevoParalelo;
    }

    public double getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(double meridiano) {
        this.meridiano = meridiano;
    }

    public double getParalelo() {
        return paralelo;
    }

    public void setParalelo(double paralelo) {
        this.paralelo = paralelo;
    }

    public double getDistanciaTierra() {
        return distanciaTierra;
    }

    public void setDistanciaTierra(double distanciaTierra) {
        this.distanciaTierra = distanciaTierra;
    }
}
