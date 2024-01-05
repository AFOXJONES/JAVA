package HERENCIA_6.PRACTICA_10.EJ_4;

public class LandRover extends Automovil{

    public LandRover(String matricula) {
        super(matricula);
    }

    public static void alquilar(int dias){
        int dinero;
        if(dias<4) {
            dinero= dias * 100;
        }else{
            dinero= dias * 70;
        }
        totalRecaudado+=dinero;
    }

    @Override
    public String toString() {
        return "LandRover{} " + super.toString();
    }
}
