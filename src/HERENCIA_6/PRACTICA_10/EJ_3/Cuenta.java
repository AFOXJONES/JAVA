package HERENCIA_6.PRACTICA_10.EJ_3;
import java.util.*;
public class Cuenta {

        private static int contadorCuentas = 1;
        protected int numeroCuenta;
        protected ArrayList<String> titulares;
        protected double saldo;
        protected double saldoInicial;

        public Cuenta(ArrayList<String> titulares, double saldoInicial) {
            this.numeroCuenta = contadorCuentas++;
            this.titulares = titulares;
            this.saldo = saldoInicial;
            this.saldoInicial=saldoInicial;
        }

        public void aplicarInteres(int dias, double tasaInteres) {
            double interes = dias*tasaInteres/365;
            saldo += interes;
        }

        public void imprimirInformacion() {
            System.out.println("Cuenta #" + numeroCuenta);
            System.out.println("Titulares: " + titulares);
            System.out.println("Saldo actual: " + saldo + " euros");
        }

}
