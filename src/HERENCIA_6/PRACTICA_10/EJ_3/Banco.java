package HERENCIA_6.PRACTICA_10.EJ_3;
import java.util.*;
public class Banco {
    private ArrayList<Cuenta> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void altaCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        System.out.println("Cuenta #" + cuenta.numeroCuenta + " creada con éxito.");
    }

    public void cancelarCuentasPorTitular(String nif) {
        cuentas.removeIf(cuenta -> cuenta.titulares.contains(nif));
        System.out.println("Cuentas canceladas para el titular con NIF: " + nif);
    }

    public void mostrarInformacion(int dias) {
        for (Cuenta cuenta : cuentas) {
            cuenta.aplicarInteres(dias, (cuenta instanceof Cuenton) ? 4 : 3);
            cuenta.imprimirInformacion();
            System.out.println("Dinero producido: " + dias*(cuenta instanceof Cuenton ? 4 : 3)/365);
            System.out.println("------------------------");
        }
    }

    public void sortearViaje() {
        ArrayList<Cuenton> cuentones = new ArrayList<>();
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof Cuenton) {
                cuentones.add((Cuenton) cuenta);
            }
        }

        if (cuentones.isEmpty()) {
            System.out.println("No hay cuentones para sortear el viaje.");
        } else {
            int indiceGanador = (int) (Math.random() * cuentones.size());
            System.out.println("¡Felicidades! El ganador del viaje es el titular de la cuenta #" + cuentones.get(indiceGanador).numeroCuenta);
        }
    }
}
