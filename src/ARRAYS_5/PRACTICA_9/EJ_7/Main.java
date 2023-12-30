package ARRAYS_5.PRACTICA_9.EJ_7;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //Programa que lleve la información de la liga de futbol, de primera división.
        // Por cada equipo guardo el nombre, victorias, derrotas, empates, goles a favor, goles en contra y puntos.
        // Generar un array con 10 equipos. Realizar un menú:
        //- Anotar partido. Se anota el nombre del primer equipo, del segundo,
        // los goles del primer equipo y del segundo. Se actualiza la información de cada equipo.
        //- Ordenar los equipos por puntos.
        //- Mostrar la información de todos los equipos.
        Scanner sc=new Scanner(System.in);

        Equipo equipos[]={new Equipo("Aston Birra"),new Equipo("Peponcios Club"),new Equipo("Calvorotas F.C.")};

        boolean seguimos=true;
        do {
            System.out.println("Que desea hacer?:");

            System.out.println("1.Anotar partido");
            System.out.println("2.Mostrar equipos ordenados por puntos");
            System.out.println("3.Mostrar informacion de los equipos");
            System.out.println("4.Salir");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    Equipo equipoA = null;
                    Equipo equipoB=null;
                    String a;
                    String b;
                    do {
                        System.out.println("Anota el nombre del primer equipo:");
                        a = sc.nextLine();
                        if (equipoExiste(a, equipos)) {
                            equipoA = retornarEquipo(a, equipos);
                        }
                    }while(!equipoExiste(a, equipos));
                    do {
                        System.out.println("Anota el nombre del segundo equipo:");
                        b = sc.nextLine();
                        if (equipoExiste(b, equipos)) {
                            equipoB = retornarEquipo(b, equipos);
                        }
                    }while(!equipoExiste(b, equipos));

                    jugarPartido(equipoA,equipoB);

                    break;
                case 2:
                    // Ordena el array de equipos usando un comparador personalizado
                    Arrays.sort(equipos, Comparator.comparingInt(Equipo::getPuntos).reversed());

                    for(Equipo e : equipos){
                        System.out.println(e.getNombre());
                    }

                    //o implementando el metodo CompareTo @override
                    Arrays.sort(equipos);

                    for(Equipo e : equipos){
                        System.out.println(e.getNombre());
                    }

                    break;
                case 3:
                    for(Equipo e : equipos){
                        System.out.println(e.toString());
                    }
                    break;
                case 4:
                    seguimos=false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(seguimos);


    }

    public static Equipo retornarEquipo(String a,Equipo[] equipos){

        for(Equipo e : equipos){
            if(e.getNombre().equalsIgnoreCase(a)){
                return e;
            }
        }
        return null;
    }

    public static boolean equipoExiste(String a,Equipo[] equipos){
        for(Equipo e : equipos){
            if(e.getNombre().equalsIgnoreCase(a)){
                return true;
            }
        }
        return false;
    }

    public static void jugarPartido(Equipo a, Equipo b){
        Scanner sc=new Scanner(System.in);
        System.out.println("Goles del equipo "+a.getNombre()+":");
        int golesA=sc.nextInt();
        sc.nextLine();
        a.setGolesAFavor(a.getGolesAFavor()+golesA);
        b.setGolesEnContra(b.getGolesEnContra()+golesA);

        System.out.println("Goles del equipo "+b.getNombre()+":");
        int golesB=sc.nextInt();
        sc.nextLine();
        b.setGolesAFavor(b.getGolesAFavor()+golesB);
        a.setGolesEnContra(a.getGolesEnContra()+golesB);

        if(golesA>golesB){
            a.setVictorias(a.getVictorias()+1);
            b.setDerrotas(b.getDerrotas()+1);
            a.setPuntos(a.getPuntos()+3);
        }else if(golesA<golesB){
            b.setVictorias(b.getVictorias()+1);
            a.setDerrotas(a.getDerrotas()+1);
            b.setPuntos(b.getPuntos()+3);
        }else{
            a.setEmpates(a.getEmpates()+1);
            b.setEmpates(b.getEmpates()+1);
            a.setPuntos(a.getPuntos()+1);
            b.setPuntos(b.getPuntos()+1);
        }
    }
}
