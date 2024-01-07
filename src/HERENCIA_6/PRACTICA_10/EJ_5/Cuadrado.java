package HERENCIA_6.PRACTICA_10.EJ_5;

public class Cuadrado extends Poligono{
    private int lado;

    public Cuadrado(int lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area=lado*lado;
        System.out.println("Area del cuadrado: "+area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro=4*lado;
        System.out.println("Perimetro del cuadrado: "+perimetro);
    }
}
