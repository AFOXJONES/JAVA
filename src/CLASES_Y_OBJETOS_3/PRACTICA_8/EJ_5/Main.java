package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_5;

import java.util.*;

public class Main {
    public static void main(String[] args){
//En un almacén se guarda fruta para su posterior venta. Por cada cargamento se tiene
// la siguiente información: nombre de la fruta, procedencia, número de kilos,
// precio coste por kilo y precio venta por kilo.
//Codificar una clase para manejar esta información de forma que contenga las
//siguientes operaciones:
//- Constructor
//- Método que devuelva la información de cada cargamento de fruta.
//- Método “rebajar” que rebaja el precio de venta en una cantidad pasada
//como parámetro, (el precio de venta nunca puede ser menor que el precio
//de coste).
//- Método “vender”: se le pasa el número de kilos a vender y si hay suficiente
//cantidad, se decrementa el número de kilos y se devuelve el importe de la
//venta, sino da error.
//- Método que nos diga si dos cargamentos de fruta tienen la misma
//procedencia.
//- Llevar en todo momento el beneficio obtenido por el almacén.
//Para probar dicha clase hacer un main que:
//- Dé de alta 3 cargamentos y muestre su información.
//- Diga si los dos primeros tienen la misma procedencia.
//- Rebaje el precio del tercero.
//- Realice ventas de los tres cargamentos.
//- Muestre el beneficio obtenido por el almacén.
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
