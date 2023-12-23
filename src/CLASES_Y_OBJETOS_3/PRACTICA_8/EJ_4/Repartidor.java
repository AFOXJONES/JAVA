package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_4;

public class Repartidor {
    private static int totalPedidos = 0;
    private static double ganaciasEmpresa=0;
    private int numeroRepartidor;
    private double gananciasTotales;

    public Repartidor(int numeroRepartidor) {
        this.numeroRepartidor = numeroRepartidor;
        this.gananciasTotales = 0.0;
    }

    public void realizarPedido(double importePedido, double propinas) {
        double gananciaPedido = importePedido * 0.20 + propinas;
        gananciasTotales += gananciaPedido;
        ganaciasEmpresa+=importePedido+propinas;
        totalPedidos++;
    }

    public static int getTotalPedidos() {
        return totalPedidos;
    }

    public double getGananciasTotales() {
        return gananciasTotales;
    }

    public int getNumeroRepartidor() {
        return numeroRepartidor;
    }
    public static double getGanaciasEmpresa() {
        return ganaciasEmpresa;
    }
}
