package ARRAYS_5.PRACTICA_9.EJ_5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Vehiculo vehiculos[]=new Vehiculo[2];

        for(int i=0; vehiculos.length>i;i++){
            String matricula;
            do {
                System.out.println("Anote la matricula:");
                 matricula = sc.nextLine();
            }while(!validarMatricula(matricula));

            System.out.println("Modelo:");
            String modelo=sc.nextLine();

            System.out.println("Marca:");
            String marca=sc.nextLine();

            System.out.println("Año matriculacion:");
            int anioMatriculacion=sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese la categoría (UNO o DOS): ");
            String categoriaStr = sc.nextLine();

            Vehiculo.categoria miCategoria = Vehiculo.categoria.valueOf(categoriaStr.toUpperCase());

            Vehiculo miVehiculo = new Vehiculo(matricula, modelo, marca, anioMatriculacion, miCategoria);
            vehiculos[i]=miVehiculo;
        }

        String fin;
        do {
            System.out.println("Pulse cualquier tecla para continuar, o escriba 'fin' para finalizar");
           fin = sc.nextLine().toUpperCase();

            if (!fin.equals("FIN")) {
                Vehiculo VehiculoOperando = new Vehiculo();
                boolean encontrado = false;
                do {
                    System.out.println("Anote la matricula del vehiculo con el que quieras hacer operaciones:");
                    String matricula = sc.nextLine();


                    for (Vehiculo v : vehiculos) {
                        if (v.getMatricula().equals(matricula) && !encontrado) {
                            VehiculoOperando = v;
                            encontrado = true;
                            break;
                        }
                    }
                } while (!encontrado);

                System.out.println("QUE DESEA HACER (ANOTE NUMERO)");
                System.out.println("1.ALQUILAR");
                System.out.println("2.DEVOLVER");
                System.out.println("3.MOSTRAR INFORMACION");
                int opt = sc.nextInt();
                sc.nextLine();

                switch (opt) {
                    case 1:
                        System.out.println("Cuantos dias desea alquilarlo?");
                        int dias = sc.nextInt();
                        sc.nextLine();
                        VehiculoOperando.alquilar(dias, VehiculoOperando);
                        break;
                    case 2:
                        VehiculoOperando.devolverVehiculo(VehiculoOperando);
                        break;
                    case 3:
                        System.out.println(VehiculoOperando.toString());
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA");
                        break;
                }
            }
        }while(!fin.equals("FIN"));


        System.out.println("Vehiculos alquilados: "+Vehiculo.getVehiculosAlquilados());

        System.out.println("Total ganaciaas de la empresa: "+Vehiculo.getGananciasTotales());




    }

    public static boolean validarMatricula(String matricula){
        // Expresión regular para validar 7 caracteres, 4 dígitos y 3 letras
        String regex = "^(?=.*[0-9]{4})(?=.*[a-zA-Z]{3}).{7}$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(regex);

        // Crear un objeto Matcher
        Matcher matcher = pattern.matcher(matricula);

        // Verificar si la cadena cumple con los requisitos
        if(!matcher.matches()){
            System.out.println("Matricula inválida");
        }
        return matcher.matches();
    }
}
