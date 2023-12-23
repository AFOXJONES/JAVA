package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_6;

import java.util.*;

public class Viaje {
    private static int numViaje=1;
    private static double totalRecaudadoEmpresa=0;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String codigo;
    private int numPlazas;
    private double importePersona;

    public Viaje(String ciudadOrigen,String ciudadDestino,int numPlazas,double importePersona){
        this.ciudadOrigen=ciudadOrigen;
        this.ciudadDestino=ciudadDestino;
        this.numPlazas=numPlazas;
        this.importePersona=importePersona;
        if (ciudadOrigen.length() >= 2 && ciudadDestino.length() >= 2) {
            String parteOrigen = ciudadOrigen.substring(0, 2).toUpperCase();
            String parteDestino = ciudadDestino.substring(0, 2).toUpperCase();

            this.codigo = parteOrigen + parteDestino + numViaje;
        } else {
            // Manejar el caso cuando una o ambas cadenas son demasiado cortas
            this.codigo = "CODIGO_NO_VALIDO";
        }
        numViaje++;
    }


    public double reserva(int plazas){
        Scanner sc=new Scanner(System.in);
        if(plazas>numPlazas){
            return 0;
        }else{
            System.out.println("Cuantos niños viajan contigo?");
            int ninios=sc.nextInt();
            if(ninios>plazas){
                System.out.println("Debe ir acompañado de un mayor");
                return 0;
            }else{
                int adultos=plazas-ninios;
                double precio=adultos*importePersona;
                precio+=ninios*importePersona*0.8;
                numPlazas-=plazas;
                totalRecaudadoEmpresa+=precio;
                return precio;
            }
        }
    }

    public boolean modificarNumPlazas(int nuevasPlazas){
        if(nuevasPlazas>numPlazas){
            return false;
        }
        numPlazas=nuevasPlazas;
        return true;
    }



    @Override
    public String toString() {
        return "Viaje{" +
                "ciudadOrigen='" + ciudadOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", codigo='" + codigo + '\'' +
                ", numPlazas=" + numPlazas +
                ", importePersona=" + importePersona +
                '}';
    }

    public static double getTotalRecaudadoEmpresa() {
        return totalRecaudadoEmpresa;
    }
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }


    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public double getImportePersona() {
        return importePersona;
    }

    public void setImportePersona(double importePersona) {
        this.importePersona = importePersona;
    }
}
