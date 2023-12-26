package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_6;


import java.util.*;

public class Main {
    public static void main(String[] args){
//En una agencia de viajes se guarda la siguiente información por cada viaje:
// Ciudad de origen y ciudad de destino, código, número de plazas,
// importe del viaje por
//persona. Se pide hacer una clase Viaje que contenga al menos los siguientes
//métodos:
//1. Constructor. El código del viaje se forma con las dos primeras letras
//del origen (en mayúsculas), las dos primeras letras del destino (en
//mayúsculas) y el número de viaje.
//2. Método que reserve un número de plazas pasado como parámetro.
//Si no tiene plazas suficientes no reserva ninguna. Los niños tienen un
//20% de descuento sobre el valor del billete. Devuelve el importe
//total de la reserva, 0 si no se puede realizar.
//3. Método que modifique el número de plazas de un viaje, sólo si es
//posible, es decir nunca puede haber más reservas que plazas.
//Retorna si se ha podido realizar o no la modificación.
//4. Método toString.
//5. Método que muestre el total recaudado por la agencia.
//Codificar un main que realice las siguientes operaciones:
//1. Crear dos viajes.
//2. Mostrad la información de ambos viajes.
//3. Reservad varias plazas de ambos viajes.
//4. Modificad el número de plazas del primer viaje.
//5. Mostrad de nuevo la información de ambos viajes.
//6. Mostrad el total recaudado por la agencia.
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
