package VECTORES_7.PRACTICA_11.EJ_3;

public class ClienteConPase extends Cliente{
    private int entradaGratuitas;

    public ClienteConPase(String nombre, String pelicula, int numentradas, int entradaGratuitas) {
        super(nombre, pelicula, numentradas);
        this.entradaGratuitas = entradaGratuitas;
    }

    public int getEntradaGratuitas() {
        return entradaGratuitas;
    }

    public void setEntradaGratuitas(int entradaGratuitas) {
        this.entradaGratuitas = entradaGratuitas;
    }
}
