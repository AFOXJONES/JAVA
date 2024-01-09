package VECTORES_7.PRACTICA_11.EJ_3;
import java.util.*;
public class Main {
    public static void main(String[] args){
        //Un cine tiene una única taquilla y dos salas en las que se proyectan sendas
        //películas. El precio normal de cada película son 10 euros. Cada sala tiene capacidad
        //para 40 espectadores,
        //En este cine tenemos varios tipos de clientes: cliente normal, socio, o con pase:
        //• Cliente con pase: Estos clientes disponen de un número de entradas
        //gratuitas (introducidas por teclado en el constructor), el resto a precio
        //normal.
        //• Socio: En este caso guardamos el número de carnet de socio. Los socios
        //pagarán un 20% de descuento por cada entrada adquirida hasta un máximo
        //de 4 entradas, el resto a precio normal.
        //• Cliente normal: El resto.
        //NOTA: Un cliente sólo puede pertenecer a una categoría, es decir no puede
        //haber socios con pases.
        //El cine debe implementarse como un array de salas, código automatizado con
        //funcionalidad independiente del número de salas. La taquilla será una clase que
        //gestione la cola de clientes.
        //Realizar un programa en Java que use un vector para simular el
        //comportamiento de la cola de la taquilla del cine codificando las siguientes opciones
        //mediante un menú:

        //a) Llegada de una persona a la cola de la taquilla. Por cada persona se
        //guarda: nombre, película y número de entradas de dicha película que
        //quiere adquirir, además de los datos propios por el tipo de cliente.

        //b) Comprar entradas. Cada vez que se pulse esta opción la primera persona de
        //la cola compra sus entradas mostrando por pantalla el importe que tiene
        //que abonar (y será eliminado de la cola). Si cuando una persona va a
        //comprar sus entradas no hay suficientes no comprará ninguna. En el
        //momento en que se llene una sala se mostrará un mensaje y se recorrerá el
        //vector eliminando de la cola a todas aquellas personas que quisieran
        //entradas para esa película. En el momento que se llenen las dos salas el
        //programa mostrará lo mismo que en la opción 3 y terminará. ( Anunciar que
        //una sala se ha llenado creando una excepción y manejándola).

        //c) Mostrar cada una de las personas que queda en la cola, el nº de personas
        //que hay en cada sala y el total recaudado en cada una de ellas.
        //d) Salir.
        Scanner sc=new Scanner(System.in);

        Vector<Sala> cine=new Vector<>();
        cine.add(new Sala("Spiderman 2"));
        cine.add(new Sala("Pulp Fiction"));

        Queue<Cliente> colaClientes = new LinkedList<>();

        int opt;
        do{
            System.out.println("Que desea hacer?");
            System.out.println("1. Añadir cliente a la cola");
            System.out.println("2. Comprar entradas");
            System.out.println("3. Mostrar personas en cola");
            System.out.println("0. Salir");
            opt=sc.nextInt();
            sc.nextLine();

            switch(opt){
                case 1:
                    System.out.println("Nombre:");
                    String nombre=sc.nextLine();
                    String pelicula;
                    boolean encontrado = false;
                    do {
                        System.out.println("Peliculas:");
                        for (Sala sala : cine) {
                            System.out.println(sala.getPelicula());
                        }
                        System.out.println("Escriba la pelicula que desea ver:");
                        pelicula = sc.nextLine();

                        for (Sala sala : cine) {
                            if (sala.getPelicula().equalsIgnoreCase(pelicula)) {
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Esa pelicula no esta en ninguna de las salas");
                        }
                    }while(!encontrado);
                    System.out.println("Numero de entradas:");
                    int numEntradas=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Tipo de cliente");
                    System.out.println("1. Normal");
                    System.out.println("2. Socio");
                    System.out.println("3. Cliente con pase");
                    int tipo=sc.nextInt();
                    sc.nextLine();

                    switch(tipo){
                        case 1:
                            colaClientes.add(new Cliente(nombre,pelicula,numEntradas));
                            break;
                        case 2:
                            System.out.println("Introduzca el numero de carnet de socio:");
                            String numSocio=sc.nextLine();
                            colaClientes.add(new Socio(nombre,pelicula,numEntradas,numSocio));
                            break;
                        case 3:
                            System.out.println("Numero de entradas gratuitas:");
                            int entradasGratis=sc.nextInt();
                            sc.nextLine();
                            colaClientes.add(new ClienteConPase(nombre,pelicula,numEntradas,entradasGratis));
                            break;
                        default:
                            System.out.println("Error");
                            break;
                        }
                        
                        break;
                case 2:
                    Cliente c=colaClientes.peek();
                        if (c != null) {
                            for (Sala sala : cine) {
                                if (sala.getPelicula().equalsIgnoreCase(c.getPelicula()) && sala.getNumbutacas() > c.getNumentradas()) {
                                    if (c instanceof ClienteConPase) {
                                        ClienteConPase pase = (ClienteConPase) c;
                                        int entradas;
                                        if(c.getNumentradas()>pase.getEntradaGratuitas()){
                                            entradas=pase.getEntradaGratuitas();
                                        }else{
                                            entradas=pase.getEntradaGratuitas()-c.getNumentradas();
                                        }
                                        sala.setTotalRecaudado(sala.getTotalRecaudado() + (c.getNumentradas()-entradas) * Sala.precio);
                                        pase.setEntradaGratuitas(pase.getEntradaGratuitas()-entradas);
                                    } else if (c instanceof Socio){
                                        sala.setTotalRecaudado(sala.getTotalRecaudado() + c.getNumentradas() * Sala.precio-((c.getNumentradas() * Sala.precio) * Socio.descuento));
                                    }else{
                                        sala.setTotalRecaudado(sala.getTotalRecaudado() + c.getNumentradas() * Sala.precio);
                                    }
                                    sala.setNumbutacas(sala.getNumbutacas()-c.getNumentradas());
                                    colaClientes.poll();
                                }
                            }
                        }

                    break;
                case 3:
                    System.out.println("GENTE EN LA COLA:");
                    for(Cliente cliente : colaClientes) {
                        System.out.println(cliente.toString());
                    }
                    System.out.println("Numero de personas por sala:");
                    for(Sala sala : cine) {
                        System.out.println("Butacas en la sala de "+sala.getPelicula()+" ="+sala.getNumbutacas());
                        System.out.println("Total reacudado en ella: "+sala.getTotalRecaudado());
                    }

                    break;
                default:
                    break;

            }


        }while(opt!=0);





    }
}
