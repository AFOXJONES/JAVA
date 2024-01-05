package HERENCIA_6.PRACTICA_10.EJ_3;
import java.util.*;
public class Cuenton extends Cuenta {
    public Cuenton(ArrayList<String> titulares, double saldoInicial) {
        super(titulares, saldoInicial);
        if (saldoInicial < 600) {
            System.out.println("¡Error! Un cuentón debe abrirse con al menos 600 euros.");
            throw new IllegalArgumentException("¡Error! Un cuentón debe abrirse con al menos 600 euros.");
        }
    }
}


