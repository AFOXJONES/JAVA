package HERENCIA_6.PRACTICA_10.EJ_3;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //En un banco existen cuentas de dos tipos: la normal y el cuentón.
        // Una cuenta normal tiene un interés del 3% mientras que en un cuentón es del 4%.
        // Mientras que una cuenta normal se puede abrir con cualquier cantidad de dinero,
        // un cuentón se tiene que abrir con al menos 600 euros.
        // Cada cuenta tiene un número único que le es asignado por el banco en el momento de abrirla.
        // Además cada cuenta puede tener varios titulares (máximo 3), que vienen identificados por su nif.
        // Codificar un programa usando herencia que:
        //a) Dé de alta una cuenta.
        //b) Cancele todas las cuentas en las que figure un titular anotado por teclado.
        //c) Al anotar un número de días, nos muestre la información de todas las cuentas, incluido el dinero que han producido.
        //Ejemplo: Si una cuenta tiene un capital de 400 euros y se le aplica un interés del 3% durante 30 días, el dinero producido es:
        //(400 * 3 * 30) / 365.
        //d) Sortee un viaje entre todos los cuentones abiertos.

            Scanner scanner = new Scanner(System.in);
            Banco banco = new Banco();

            while (true) {
                System.out.println("1. Alta cuenta");
                System.out.println("2. Cancelar cuentas por titular");
                System.out.println("3. Mostrar información");
                System.out.println("4. Sortear viaje");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el tipo de cuenta (normal/cuenton): ");
                        String tipoCuenta = scanner.next();
                        System.out.print("Ingrese el número de titulares (1-3): ");
                        int numTitulares = scanner.nextInt();
                        ArrayList<String> titulares = new ArrayList<>();
                        for (int i = 0; i < numTitulares; i++) {
                            System.out.print("Ingrese el NIF del titular " + (i + 1) + ": ");
                            titulares.add(scanner.next());
                        }
                        System.out.print("Ingrese el saldo inicial: ");
                        double saldoInicial = scanner.nextDouble();

                        if (tipoCuenta.equals("normal")) {
                            banco.altaCuenta(new Cuenta(titulares, saldoInicial));
                        } else if (tipoCuenta.equals("cuenton")) {
                            banco.altaCuenta(new Cuenton(titulares, saldoInicial));
                        } else {
                            System.out.println("Tipo de cuenta no válido.");
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese el NIF del titular para cancelar cuentas: ");
                        String nifCancelar = scanner.next();
                        banco.cancelarCuentasPorTitular(nifCancelar);
                        break;
                    case 3:
                        System.out.print("Ingrese el número de días para mostrar la información: ");
                        int dias = scanner.nextInt();
                        banco.mostrarInformacion(dias);
                        break;
                    case 4:
                        banco.sortearViaje();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            }
        }
}
