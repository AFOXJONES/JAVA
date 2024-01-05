package HERENCIA_6.PRACTICA_10.EJ_4;

public class Bicicleta extends Vehiculo{
    private static final int fianza=30;
    private static final int precio=10;

    public Bicicleta(String matricula) {
        super(matricula);
    }

    public static void alquilar(int dias){
        int dinero=dias*precio;
        totalRecaudado+=dinero;
    }

    @Override
    public String toString() {
        return "Bicicleta{} " + super.toString();
    }
}
