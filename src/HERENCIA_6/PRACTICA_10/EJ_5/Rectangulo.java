package HERENCIA_6.PRACTICA_10.EJ_5;

public class Rectangulo extends Poligono{
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        super(4);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        double area=largo*ancho;
        System.out.println("Area del rectangulo: "+area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro=2*(largo+ancho);
        System.out.println("Area del perimetro: "+perimetro);
    }
}
