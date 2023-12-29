package ARRAYS_5.PRACTICA_9.EJ_6;

public class Garaje {
    private static double totalGanaciasEmpresa;
    private int identificacion;
    private int metrosCuadrados;
    private int planta;
    private double precio;
    private boolean alquilado;


    public Garaje(int identificacion, int metrosCuadrados, int planta) {
        this.identificacion = identificacion;
        this.metrosCuadrados = metrosCuadrados;
        this.planta = planta;
        this.precio=calcularPrecio(planta,metrosCuadrados);
    }

    public double calcularPrecio(int planta, int metrosCuadrados){
        double precio=18;
        if(planta==1){
            precio+=3;
        }else if(planta==2){
            precio+=1.5;
        }else{
            precio+=1;
        }
        if(metrosCuadrados>4){
            precio+=1.5;
        }
        if(metrosCuadrados<3){
            precio-=1;
        }
        return precio;
    }

    public void alquilar(){
        if(!alquilado){
            alquilado=true;
            totalGanaciasEmpresa+=precio;
        }else{
            System.out.println("Este garaje ya esta alquilado");
        }
    }

    public void subirPrecio(double porcentaje){
            porcentaje/=100;
            precio*=(porcentaje+1);
            System.out.println("Nuevo precio es: "+precio);
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "identificacion=" + identificacion +
                ", metrosCuadrados=" + metrosCuadrados +
                ", planta=" + planta +
                ", precio=" + precio +
                ", alquilado=" + alquilado +
                '}';
    }

    public static double getTotalGanaciasEmpresa() {
        return totalGanaciasEmpresa;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public int getIdentificacion() {
        return identificacion;
    }


    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public double getPrecio() {
        return precio;
    }

}


