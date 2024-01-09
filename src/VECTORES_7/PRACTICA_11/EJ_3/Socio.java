package VECTORES_7.PRACTICA_11.EJ_3;

public class Socio extends Cliente{
    public static final double descuento=0.2;
    private String numCarnetSocio;


    public Socio(String nombre, String pelicula, int numentradas, String numCarnetSocio) {
        super(nombre, pelicula, numentradas);
        this.numCarnetSocio = numCarnetSocio;
    }

    public String getNumCarnetSocio() {
        return numCarnetSocio;
    }

    public void setNumCarnetSocio(String numCarnetSocio) {
        this.numCarnetSocio = numCarnetSocio;
    }
}
