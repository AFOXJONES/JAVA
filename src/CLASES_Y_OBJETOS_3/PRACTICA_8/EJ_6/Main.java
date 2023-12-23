package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_6;


import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        ArrayList<Viaje> viajes=new ArrayList<>();

        int num = 1;

        do {
            System.out.println("Metiendo datos de viaje: ");

            System.out.println("Ciudad origen: ");
            String ciudadOrigen = sc.nextLine();

            System.out.println("Ciudad destino: ");
            String ciudadDestino = sc.nextLine();

            System.out.println("Numero de plazas ");
            int numPlazas = sc.nextInt();

            sc.nextLine();

            System.out.println("Importe por persona: ");
            double importePersona = sc.nextDouble();

            sc.nextLine();
            Viaje viaje = new Viaje(ciudadOrigen, ciudadDestino, numPlazas, importePersona);
            viajes.add(viaje);
            num++;
        } while (num <= 2);

        System.out.println(viajes.get(0).toString());
        System.out.println(viajes.get(1).toString());

        viajes.get(0).reserva(6);
        viajes.get(1).reserva(4);

        viajes.get(0).modificarNumPlazas(30);


        System.out.println(viajes.get(0).toString());
        System.out.println(viajes.get(1).toString());

        System.out.println(Viaje.getTotalRecaudadoEmpresa());
    }
}
