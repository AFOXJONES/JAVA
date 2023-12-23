package CLASES_Y_OBJETOS_3.PRACTICA_8.EJ_5;

public class Cargamento {
    private static double veneficioAlmacen;
    private String fruta;
    private String procedencia;
    private double numeroKg;
    private double precioCosteKg;
    private double precioVentaKg;

    public Cargamento(){

    }

    public Cargamento(String fruta,String procedencia,double numeroKg,
                      double precioCosteKg, double precioVentaKg){
        this.fruta = fruta;
        this.procedencia = procedencia;
        this.numeroKg = numeroKg;
        this.precioCosteKg = precioCosteKg;
        this.precioVentaKg = precioVentaKg;
    }

    public static double getVeneficioAlmacen() {
        return veneficioAlmacen;
    }

    @Override
    public String toString() {
        return "Cargamento{" +
                "fruta='" + fruta + '\'' +
                ", procedencia='" + procedencia + '\'' +
                ", numeroKg=" + numeroKg +
                ", precioCosteKg=" + precioCosteKg +
                ", precioVentaKg=" + precioVentaKg +
                '}';
    }

    public void rebaja(double precio){
        if(precio<precioCosteKg && precioVentaKg>precio){
            System.out.println("El precio de venta no puede ser menor que el precio de coste y debe ser menor que el anterior");
        }else{
            precioVentaKg=precio;
        }
    }

    public double vender(double kg){
        if(numeroKg>kg){
            numeroKg-=kg;
            veneficioAlmacen+=precioVentaKg*kg;
            return precioVentaKg*kg;
        }else{
            System.out.println("No hay suficientes kg en stock");
            return 0;
        }
    }

    public static void compararProcedencia(Cargamento a, Cargamento b){
        if(a.procedencia.toUpperCase()==b.procedencia.toUpperCase()){
            System.out.println("Los dos cargamentos tienen la misma procedencia");
        }else{
            System.out.println("El lugar de procedencia no coincide");
        }
    }


    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double getNumeroKg() {
        return numeroKg;
    }

    public void setNumeroKg(double numeroKg) {
        this.numeroKg = numeroKg;
    }

    public double getPrecioCosteKg() {
        return precioCosteKg;
    }

    public void setPrecioCosteKg(double precioCosteKg) {
        this.precioCosteKg = precioCosteKg;
    }

    public double getPrecioVentaKg() {
        return precioVentaKg;
    }

    public void setPrecioVentaKg(double precioVentaKg) {
        this.precioVentaKg = precioVentaKg;
    }
}
