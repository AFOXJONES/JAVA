package VECTORES_7.PRACTICA_11.EJ_2;

import java.util.*;
public class Main {
    public static void main(String[] args){
        //En una empresa informática se guarda por cada empleado: nombre, dni, dirección, teléfono.
        // Hay dos tipos de empleados: propios y externos.
        // De cada empleado externo se guarda la empresa de la cual procede.
        // A cada empleado el programa le asigna un número para identificarlo.
        //Realizar un programa en JAVA que me permita realizar las siguientes operaciones:
        //a. Dar de alta un empleado. Se pide por teclado el tipo de empleado a dar de alta y se anotan sus datos.
        //b. Fichar un empleado. Se anota el número del empleado
        //      y se pide el número de horas realizadas, que se acumulan al empleado correspondiente.
        //c. Reparto de beneficios. Se pide una cantidad por teclado
        //      y se reparte a partes iguales entre todos los empleados propios.
        //d. Pagar a todos los empleados de la empresa, mostrando por pantalla lo que se le paga a cada uno.
        //      A los empleados externos se les paga a 22 euros la hora realizada,
        //      y a los propios se les paga una cantidad introducida por teclado
        //      al dar de alta al empleado más 15 euros la hora realizada.
        //      Una vez pagado un empleado se ponen a cero las horas realizadas y los beneficios.
        //e. Añadir una opción que muestre por pantalla la información que se mantiene
        //      en la empresa de todos los empleados.
        //
        //Los empleados se almacenan en un vector

        Vector<Empleado> empleados=new Vector<Empleado>();
        Scanner sc=new Scanner(System.in);

        int opt;
        do{
            System.out.println("Que desea hacer?");
            System.out.println("1. Dar de alta un empleado");
            System.out.println("2. Reparto de beneficios");
            System.out.println("3. Pagar a todos los empleados de la empresa");
            System.out.println("4. Mostrar datos de empleados");
            opt=sc.nextInt();

            switch(opt){
                case 1:
                    sc.nextLine();
                    System.out.println("Nombre:");
                    String nombre=sc.nextLine();
                    System.out.println("DNI:");
                    String dni=sc.nextLine();
                    System.out.println("Direccion:");
                    String direccion=sc.nextLine();
                    System.out.println("Telefono:");
                    String tlfn=sc.nextLine();

                    System.out.println("Que tipo de empleado quieres dar de alta?");
                    System.out.println("1. EXTERNO");
                    System.out.println("2. PROPIO");
                    int opcion=sc.nextInt();
                    switch(opcion){
                        case 1:
                            empleados.add(new Externo(nombre,dni,direccion,tlfn));
                            break;
                        case 2:
                            System.out.println("Cuanto dinero adicional va a cobrar por hora?");
                            double dinero=sc.nextDouble();
                            empleados.add(new Propio(nombre,dni,direccion,tlfn,dinero));
                            break;
                        default:
                            System.out.println("Opcion no admitida");
                            break;
                    }
                    break;
                case 2:
                    reparto(empleados);
                    break;
                case 3:
                    for(Empleado empleado: empleados){
                        empleado.cobrar();
                    }
                    break;
                case 4:
                    for(Empleado empleado: empleados){
                        System.out.println(empleado.toString());
                    }
                    break;
                default:
                    break;
            }
        }while(opt!=0);


    }

    public static void reparto(Vector<Empleado> empleados){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca los beneficios a repartir:");
        double beneficios=sc.nextDouble();
        double b=beneficios/empleados.size();
        for(int i=0;empleados.size()>i;i++){
            empleados.get(i).setBeneficios(empleados.get(i).getBeneficios()+b);
        }
        System.out.println("Beneficios repartidos con exito ("+b+" para cada uno");
    }
}
