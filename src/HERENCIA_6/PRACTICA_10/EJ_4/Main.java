package HERENCIA_6.PRACTICA_10.EJ_4;

import java.util.*;

public class Main {
    public static void main(String[] args){
    //Una empresa de alquiler de vehículos alquila automóviles y bicicletas por días.
    //Tiene dos modelos de coches: corsa y Land Rover. El precio de alquiler de una
    //bicicleta es de 10 euros día. El precio de alquiler de un corsa es de 80 euros día si el
    //número de días a alquilar es menor de 4 y de 60 euros día si el número de días a
    //alquilar es de 4 días o más. El precio de alquiler de un Land Rover es de 100 euros
    //día si el número de días es menor de 4 y de 70 euros día si se alquila 4 días o más.
    //Además cuando se alquila un automóvil hay que pagar una fianza de 50 euros, y
    //cuando se alquila una bicicleta una fianza de 30 euros.
    //Se quiere almacenar conjuntamente la información de todos los vehículos de
    //forma que se puedan realizar las siguientes operaciones:
    //- Dar de alta un vehículo.
    //- Alquilar un vehículo.
    //- Dar de baja un vehículo anotando la matrícula ( borrarlo ), suponemos que
    //todos los vehículos, incluidas las bicicletas tienen un número de matrícula
    //único.
    //- Listar la información de todos los vehículos de la empresa.
    //- Mostrar el total recaudado sin recorrer los vehículos.

        Scanner sc=new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        System.out.println("EMPEZAMOS?");
        System.out.println("1.si");
        System.out.println("0.No");
        int bucle=sc.nextInt();
        do {
            System.out.println("ELIGE UNA OPCION");
            System.out.println("1.Dar de alta un vehículo.");
            System.out.println("2.Alquilar un vehículo");
            System.out.println("3.Dar de baja un vehículo");
            System.out.println("4.Listar la información de todos los vehículos de la empresa");
            System.out.println("5.Mostrar el total recaudado");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("QUE TIPO DE VEHICULO DESEA DAR DE ALTA:");
                    System.out.println("1.BICICLETA");
                    System.out.println("2.AUTOMOVIL CORSA");
                    System.out.println("3.AUTOMOVIL LANDROVER");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Escriba la matricula:");
                    String matricula = sc.nextLine();
                    switch (tipo) {
                        case 1:
                            vehiculos.add(new Bicicleta(matricula));
                            break;
                        case 2:
                            vehiculos.add(new Corsa(matricula));
                            break;
                        case 3:
                            vehiculos.add(new LandRover(matricula));
                            break;
                        default:
                            break;
                    }

                    break;
                case 2:
                    for (Vehiculo vehiculo : vehiculos) {
                        System.out.println(vehiculo.toString() + "        ");
                    }
                    System.out.println("Que vehiculo deseas alquilar: (Escriba matricula)");
                    String mat = sc.nextLine();

                    System.out.println("Cuantos dias:");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo.getMatricula().equalsIgnoreCase(mat)) {
                            if (vehiculo instanceof Bicicleta) {
                                Bicicleta.alquilar(dias);
                            } else {
                                if (vehiculo instanceof Corsa) {
                                    Corsa.alquilar(dias);
                                } else {
                                    LandRover.alquilar(dias);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    for (Vehiculo vehiculo : vehiculos) {
                        System.out.println(vehiculo.toString() + "        ");
                    }
                    System.out.println("Que vehiculo deseas dar de baja: (Escriba matricula)");
                    mat = sc.nextLine();

                    for (int i = 0; vehiculos.size() > i; i++) {
                        if (vehiculos.get(i).getMatricula().equalsIgnoreCase(mat)) {
                            vehiculos.remove(i);
                            System.out.println("Vehiculo eliminado");
                        }
                    }

                    break;
                case 4:
                    for (Vehiculo vehiculo : vehiculos) {
                        vehiculo.toString();
                    }
                    break;
                case 5:
                    System.out.println("TOTAL RECAUDADO: " + Vehiculo.getTotalRecaudado());
                    break;
                default:
                    break;
            }

            System.out.println("SEGUIMOS?");
            System.out.println("1.si");
            System.out.println("0.No");
            bucle=sc.nextInt();
        }while(bucle!=0);

    }
}
