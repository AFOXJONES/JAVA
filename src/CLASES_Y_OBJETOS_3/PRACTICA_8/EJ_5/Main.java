package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_5;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        ArrayList<Cargamento> cargamentos = new ArrayList<>();
        int num = 1;

        do {
            System.out.println("Añadiendo cargamento numero " + num);

            System.out.println("Que tipo de fruta desea vender? ");
            String fruta = sc.next();

            System.out.println("Procedencia de la fruta: ");
            String procedencia = sc.next();

            System.out.println("Numero de kg en el cargamento: ");
            double numKg = sc.nextDouble();

            System.out.println("Coste por kg de fruta: ");
            double precioCosteKg = sc.nextDouble();

            System.out.println("Precio a vender por kg: ");
            double precioVentaKg = sc.nextDouble();

            // Crear instancia de CargamentoFruta y añadir a la lista
            Cargamento cargamento = new Cargamento(fruta, procedencia, numKg, precioCosteKg, precioVentaKg);
            cargamentos.add(cargamento);
            num++;
        } while (num <= 3);

        Cargamento.compararProcedencia(cargamentos.get(0),cargamentos.get(1));

        cargamentos.get(2).rebaja(5);

        for(int i=0;cargamentos.size()>i;i++){
            System.out.println("Cuantos kg desea comprar: ");
            double kg=sc.nextDouble();
            cargamentos.get(i).vender(kg);
        }

        System.out.println("beneficio total del almacen: "+Cargamento.getVeneficioAlmacen());



    }
}
