package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        //16. Una empresa que se dedica a la venta de desinfectantes necesita un programa
        //para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad
        //vendida en litros y el precio por litro.
        // El programa pedirá los datos de 5 facturas introducidas y calculará y mostrará:
        //Facturación total
        //cantidad en litros vendidos del artículo 1
        //número de facturas que se emitieron de más de 600 €

        Scanner sc=new Scanner(System.in);

        List<Integer> codigo=new ArrayList<>();
        List<Integer> litros=new ArrayList<>();
        List<Double> precio=new ArrayList<>();

        int cont=0;
        do {
            System.out.println("Codigo del articulo: ");
            int cod = sc.nextInt();
            codigo.add(cod);

            System.out.println("Litros vendidos: ");
            int lit = sc.nextInt();
            litros.add(lit);

            System.out.println("Precio por litro: ");
            double num = sc.nextDouble();
            precio.add(num);

            cont++;
        }while(cont<5);

        double facturacion = 0;
        int facturasPrecioAlto=0;
        for(int i=0;litros.size()>i;i++){
                if(precio.get(i)*litros.get(i)>=600)
                    facturasPrecioAlto++;
                facturacion+=(litros.get(i)*precio.get(i));

        }

        double litrosVendidos=litros.get(0);

        System.out.println("FACTURACION TOTAL: "+facturacion);

        System.out.println("LITROS VENDIDOS DEL PRIMER ARTICULO: "+litrosVendidos);

        System.out.println("FACTURAS MAYORES DE 600€: "+facturasPrecioAlto);

        System.out.println(codigo);
        System.out.println(litros);
        System.out.println(precio);

    }
}
