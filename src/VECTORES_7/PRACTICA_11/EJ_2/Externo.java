package VECTORES_7.PRACTICA_11.EJ_2;

import java.util.Scanner;

public class Externo extends Empleado{
    private static final double dineroPorHora=22;


    public Externo(String nombre, String dni, String direccion, String tlfn) {
        super(nombre, dni, direccion, tlfn);
    }

    @Override
    public void fichar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el numero de horas a fichar:");
        int h=sc.nextInt();
        sc.nextLine();
        setHoras(getHoras()+h);
        double benefit=getHoras()*dineroPorHora;
        setBeneficios(getBeneficios()+benefit);
        System.out.println("Has fichado correctamente");
        System.out.println("hoy has generado unos beneficios de "+benefit+"€");
    }

    @Override
    public String toString() {
        return "Externo{} " + super.toString();
    }
}
