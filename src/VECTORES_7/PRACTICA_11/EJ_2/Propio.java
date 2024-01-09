package VECTORES_7.PRACTICA_11.EJ_2;

import java.util.Scanner;

public class Propio extends Empleado{

    private double dinero;
    private static final double dineroPorHora=15;


    public Propio(String nombre, String dni, String direccion, String tlfn, double dinero) {
        super(nombre, dni, direccion, tlfn);
        this.dinero = dinero;
    }

    @Override
    public void fichar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el numero de horas a fichar:");
        int h=sc.nextInt();
        sc.nextLine();
        setHoras(getHoras()+h);
        double benefit=getHoras()*(dinero+dineroPorHora);
        setBeneficios(getBeneficios()+benefit);
        System.out.println("Has fichado correctamente");
        System.out.println("hoy has generado unos beneficios de "+benefit+"€");
    }

    @Override
    public String toString() {
        return "Propio{" +
                "dinero=" + dinero +
                "} " + super.toString();
    }
}
