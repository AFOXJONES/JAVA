package HERENCIA_6.PRACTICA_10.EJ_4;

public class Corsa extends Automovil{

    public Corsa(String matricula) {
        super(matricula);
    }

    public static void alquilar(int dias){
        int dinero;
        if(dias<4) {
            dinero= dias * 80;
        }else{
            dinero= dias * 60;
        }
        totalRecaudado+=dinero;
    }

    @Override
    public String toString() {
        return "Corsa{} " + super.toString();
    }
}
